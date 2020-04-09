package ex5;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces

import javax.swing.*;

 
// An AWT program inherits from the top-level container java.awt.Frame
public class AWTCounter extends JFrame implements ActionListener {
   private JLabel lblCount;    // Declare a Label component 
   private JTextField tfCount; // Declare a TextField component 
   private JButton btnCount;   // Declare a Button component
   private int count = 0;     // Counter's value
 
   // Constructor to setup GUI components and event handlers
   public AWTCounter () {
      setLayout(new FlowLayout());
         // "super" Frame, which is a Container, sets its layout to FlowLayout to arrange
         // the components from left-to-right, and flow to next row from top-to-bottom.
 
      lblCount = new JLabel("Counter");  // construct the Label component
      add(lblCount);                    // "super" Frame container adds Label component
 
      tfCount = new JTextField(count + "", 10); // construct the TextField component with initial text
      tfCount.setEditable(false);       // set to read-only
      add(tfCount);                     // "super" Frame container adds TextField component
 
      btnCount = new JButton("Count");   // construct the Button component
      add(btnCount);                    // "super" Frame container adds Button component
 
      btnCount.addActionListener(this);
         // "btnCount" is the source object that fires an ActionEvent when clicked.
         // The source add "this" instance as an ActionEvent listener, which provides
         //   an ActionEvent handler called actionPerformed().
         // Clicking "btnCount" invokes actionPerformed().
 
      setTitle("Swing Counter");  // "super" Frame sets its title
      setSize(250, 100);        // "super" Frame sets its initial window size
 
      // For inspecting the Container/Components objects
      // System.out.println(this);
      // System.out.println(lblCount);
      // System.out.println(tfCount);
      // System.out.println(btnCount);
 
      setVisible(true);         // "super" Frame shows
 
      // System.out.println(this);
      // System.out.println(lblCount);
      // System.out.println(tfCount);
      // System.out.println(btnCount);
   }
 
   // The entry main() method
   
   // ActionEvent handler - Called back upon button-click.
   @Override
   public void actionPerformed(ActionEvent evt) {
      ++count; // Increase the counter value
      // Display the counter value on the TextField tfCount
      tfCount.setText(count + ""); // Convert int to String
   }
}