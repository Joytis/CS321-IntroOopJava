// EXERCISE 4.3!
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;


public class JavaIcon implements Icon
{
	private int size;

	public JavaIcon(int s) { size = s; }

	public int getIconWidth() { return size; }
	public int getIconHeight() { return size; }

	public void paintIcon(Component c, Graphics g, int x, int y) 
	{
		Graphics2D g2 = (Graphics2D) g;
		Rectangle2D.Double base = new Rectangle2D.Double(x + (size / 6), y + (size / 2), 
														 size * 0.4, size * 0.5);
		Rectangle2D.Double handlebase = new Rectangle2D.Double(x + (size / 3) * 2, y + (size / 1.8),
															   size * 0.1, size * 0.35);
		Rectangle2D.Double handle_bot = new Rectangle2D.Double(x + (size / 3) * 1.7, y + (size / 1.8),
															   size * 0.2, size * 0.07);
		Rectangle2D.Double handle_top = new Rectangle2D.Double(x + (size / 3) * 1.7, y + (size / 1.2),
															   size * 0.2, size * 0.07);

		CubicCurve2D c1 = new CubicCurve2D.Double();
		CubicCurve2D c2 = new CubicCurve2D.Double();
		CubicCurve2D c3 = new CubicCurve2D.Double();

		double ref_x = x + size / 5.5;
		double ref_y = y + size / 2.5;

		c1.setCurve(ref_x, ref_y,
					ref_x - size / 6, ref_y - size / 6,
					ref_x + size / 6, ref_y - size / 5,
					ref_x, ref_y  - size / 4);

		ref_x = x + size / 3.2;
		c2.setCurve(ref_x, ref_y,
					ref_x - size / 6, ref_y - size / 6,
					ref_x + size / 6, ref_y - size / 5,
					ref_x, ref_y  - size / 4);
		
		ref_x = x + size / 2;
		c3.setCurve(ref_x, ref_y,
					ref_x - size / 6, ref_y - size / 6,
					ref_x + size / 6, ref_y - size / 5,
					ref_x, ref_y  - size / 4);
		

		g2.setColor(Color.GRAY);
		g2.fill(base);
		g2.fill(handlebase);
		g2.fill(handle_bot);
		g2.fill(handle_top);


		g2.setColor(Color.orange);
		g2.draw(c1);
		g2.draw(c2);
		g2.draw(c3);
	}

}
