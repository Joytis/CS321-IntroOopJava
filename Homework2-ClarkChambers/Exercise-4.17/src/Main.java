// EXERCISE 4.17
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class Main {
	public static void main(String[] args) 
	{
		int delay = 1000; //milliseconds
		  ActionListener al = new ActionListener() {
		      	public void actionPerformed(ActionEvent evt) {
		      		System.out.println("Hello, World!");
		      	}
		  };
		  Timer t = new Timer(delay, al);
		  t.start();
	}
}
