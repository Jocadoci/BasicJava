import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;

public class Botones extends JFrame implements ActionListener {

  private JButton sleep;// Their buttons are: s and s1 
  private JButton hurt;// Their buttons are: h and h1
  // ... Buttons that you want use.


  public Botones() {
    super ("Basic Assist");

    // Interfaz.
    setLayout(new GridLayout(4,2,2,2)); // Here you can set values to display the view of the layout.  

    // Botttons
    Icon s = new ImageIcon(getClass().getResource("/Imagenes/s.png"));
    Icon s1 = new ImageIcon(getClass().getResource("/Imagenes/s1.png")); // This second icon/image is edited to be able to add effect after clicked.
    sleep = new JButton("  ", s);
    sleep.setRolloverIcon(s1);
    sleep.addActionListener(this);
    add(sleep);

    Icon h = new ImageIcon(getClass().getResource("/Imagenes/h.png"));
    Icon h1 = new ImageIcon(getClass().getResource("/Imagenes/h1.png"));
    hurt = new JButton(" ", h);
    hurt.setRolloverIcon(h1);
    hurt.addActionListener(this);     
    add(hurt);


  }
  // Action Listeners for the buttons.
  @Override
  public void actionPerformed(ActionEvent e) {

    if (e.getSource()==sleep) {       
      URL url = Botones.class.getResource("/Audio/Dormir.wav");
      AudioClip clip = Applet.newAudioClip(url);
      clip.loop();
      JOptionPane.showMessageDialog(null, " ");
      clip.stop();
    }


    if (e.getSource()==hurt) {
      // This is an example that you can open another activity and window.
      Hurt hu = new Hurt();
      hu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      hu.setSize(400,400);
      hu.setVisible(true);
      hu.setLocationRelativeTo(null);  
      hu.setResizable(false);
    } 

  }       
}   





       
  
  


 