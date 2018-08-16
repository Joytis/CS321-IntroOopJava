// EXERCISE 6.5
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class LabRektComponent extends JPanel{
	
	private LabeledRectangle lab_rekt;

	public LabRektComponent() 
	{
		lab_rekt = new LabeledRectangle(50, 50, 200, 200, "Cool String B)");
	}
	
	@Override
   protected void paintComponent(Graphics g) {
      super.paintComponent(g);
      lab_rekt.draw(g);
   }
}
