import java.awt.Font;

import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;

public class javamsguni {

    public javamsguni() {

        JFrame _frame = new JFrame(); //Creates the window
        JPanel _panel = new JPanel(); //The stuff that goes in the window
        JTextField _input = new JTextField(); //Takes in user input

        
        String _message = JOptionPane.showInputDialog("Please enter your message"); //Gets the user's input.

        JLabel _label = new JLabel(_message); //Sets the output to be whatever the user enters in.

        _frame.add(_panel); //Adds the panel to the window.
        _frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //When you close the window the application ends.
        _frame.setTitle("Pop up"); //Title for the window (text at the top bar).
    
        _panel.add(_label); //Adds the text to the panel.
        _label.setFont(new Font("Serif", Font.PLAIN, 30)); //Sets the text font and size.

        
        _frame.setLocationRelativeTo(null); //Positions the text box approximately in the center.
        _frame.setSize(400, 200); //Sets the size of the pop up.
        _frame.setVisible(true); //Makes the pop up visible.

    }

    public static void main(String[] args) {
        new javamsguni(); //Instantiates the pop up box.
    }
}