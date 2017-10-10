/*
Example of a simple Gui in Java.
*/

import java.awt.*;
import java.awt.event.*;

public class AWTCounter extends Frame implements ActionListener{
	//Declare Variables
	private Label lblCount; 	//Declare Label component
	private TextField tfCount;	//Declare a TextField component
	private Button btnCount;	//Declare a Button component
	private int count=0;		//Counter's value

	//Constructor to setup GUI components and event handlers
	public AWTCounter(){
		setLayout(new FlowLayout());
		// "supper" Frame, which is a Container, sets its layout to FlowLayout to arrange
		// the components from left-to-right, and flow to next row from top-to-bottom.
		
		lblCount = new Label("Counter"); //Construct Label Component
		add (lblCount);					 //"super" Frame Container adds Label component

		tfCount = new TextField("0",10);	//Construct a TextField component
		tfCount.setEditable (false);	    // set to ready-only
		add(tfCount);						//"super" Frame container adds TextField component

		btnCount = new Button("Count");     //Construct a Button component
		add(btnCount);						//"super" Frame container adds Button component

		btnCount.addActionListener(this);
		/*	"btnCount" is the source object that fires an ActionEvent when clicked.
			The source add "this" instance as an ActionEvent listener, which provides
			an ActionEvent handler called actionPerformed().
			Clicking "btnCount" invokes actionPerformed().
		*/

			setTitle("AWT Counter"); //"super" Frame sets its title
			setSize(250,100);		 //"super" Fram sets its initial window size

			//For inspecting the Container/Components objects

			System.out.println(this);
			System.out.println(lblCount);
			System.out.println(tfCount);
			System.out.println(btnCount);

			setVisible(true); //"super" Frame shows

			//Again display for understanding what is going on out there.
			System.out.println(this);
			System.out.println(lblCount);
			System.out.println(tfCount);
			System.out.println(btnCount);
	}

	//The entry main() method
	public static void main(String[] args){
		//Invoke the constructor to setup the GUI, by allocating an instance
		AWTCounter app = new AWTCounter();
			//or simply "new AWTCounter();"	for an anonymous instance.	
	}

	//ActionEvent handler - Called back upon button-click.
	//@Override
	public void actionPerformed(ActionEvent evt){
		++count; //Increase the counter value
		//Display the counter value on the TextField ftCount.
		tfCount.setText(count + ""); //Convert int to String.
	}

}