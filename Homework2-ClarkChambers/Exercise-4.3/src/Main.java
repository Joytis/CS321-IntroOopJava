// EXERCISE 4.3!
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Main {
	public static void main(String[] argv) {
		JOptionPane.showMessageDialog(
         		null,
				"Wow! Coffee!", 
				"Delicious!", 
				JOptionPane.INFORMATION_MESSAGE, 
				new JavaIcon(100));
	}
}
