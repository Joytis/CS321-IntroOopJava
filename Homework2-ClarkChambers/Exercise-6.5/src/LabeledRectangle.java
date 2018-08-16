// EXERCISE 6.5

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;

public class LabeledRectangle extends Rectangle
{
    private String text;

    public LabeledRectangle(int x, int y, int width, int height, String text)
    {
    	super(x, y, width, height);
    	this.text = text;
    }

    public void draw(Graphics g) 
    {
		Graphics2D g2 = (Graphics2D) g;
    	Rectangle2D.Double base = new Rectangle2D.Double(x, y, width, height);
    	
    	g2.setColor(Color.BLACK);
    	g2.fill(base);

    	g2.setColor(Color.WHITE);
    	
    	int style = Font.BOLD | Font.ITALIC;
		Font font = new Font ("Garamond", style , 13);
		drawCenteredString(g, text, new Rectangle(x, y, width, height), font);
    }

    private void drawCenteredString(Graphics g, String text, Rectangle rect, Font font) {
	    // Get the FontMetrics
	    FontMetrics metrics = g.getFontMetrics(font);
	    // Determine the X coordinate for the text
	    int ref_x = rect.x + (rect.width - metrics.stringWidth(text)) / 2;
	    // Determine the Y coordinate for the text (note we add the ascent, as in java 2d 0 is top of the screen)
	    int ref_y = rect.y + ((rect.height - metrics.getHeight()) / 2) + metrics.getAscent();
	    // Set the font
	    g.setFont(font);
	    // Draw the String
	    g.drawString(text, ref_x, ref_y);
	}
 }
