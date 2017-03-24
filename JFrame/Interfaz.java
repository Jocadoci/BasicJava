import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Interfaz {   
	public static void main(String arg[]) {
		// Example to open a windows frame. And send it to another activity.
		Botones go = new Botones();
		go.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		go.setSize(600,600);
		go.setVisible(true);
		go.setLocationRelativeTo(null);   
		go.setResizable(false);
	}
} 