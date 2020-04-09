package example3;

import java.awt.Frame;  // Using Frame class in package java.awt
import java.awt.Label;

//A GUI program is written as a subclass of Frame - the top-level container
//This subclass inherits all properties from Frame, e.g., title, icon, buttons, content-pane
public class MyGUIProgram extends Frame {

// private variables......

// Constructor to setup the GUI components
public MyGUIProgram() { 

	Label lblInput;                     // Declare an Label instance called lblInput
	lblInput = new Label("Enter ID");   // Construct by invoking a constructor via the new operator
	add(lblInput);                      // this.add(lblInput) - "this" is typically a subclass of Frame
	lblInput.setText("Enter password"); // Modify the Label's text string
	lblInput.getText();
	setLayout(null);
	setVisible(true);

}

// methods............

// The entry main() method
public static void main(String[] args) {
   // Invoke the constructor (to setup the GUI) by allocating an instance
   new MyGUIProgram();
}
}