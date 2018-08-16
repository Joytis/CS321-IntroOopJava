// EXERCISE 6.5
import javax.swing.JFrame;

public class Main extends JFrame{

   	Main() {
   		super("Main");
   		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		LabRektComponent labrekt = new LabRektComponent ();
		getContentPane().add(labrekt);

		pack();
    setSize(400, 400);
		setLocationRelativeTo(null);
		setVisible(true);
   	}
   	
	public static void main(String[] args) {
    	new Main();
   	}
}
