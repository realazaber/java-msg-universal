import java.awt.Font;

import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;

public class javamsguni {

    public javamsguni() {

        JFrame _frame = new JFrame(); //Creates the window
        JPanel _panel = new JPanel(); //The stuff that goes in the window
        JTextField _input = new JTextField(); //Takes in user input

        

        String _message = JOptionPane.showInputDialog("Please enter your message");

        JLabel _label = new JLabel(_message);

        _panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 30, 30));

        _frame.add(_panel);
        _frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        _frame.setTitle("Pop up");
        
        

        _panel.add(_label);
        _label.setFont(new Font("Serif", Font.PLAIN, 30));

        
        _frame.setLocationRelativeTo(null); 
        _frame.setSize(400, 200);
        _frame.setVisible(true);
        

    }

    public static void main(String[] args) {
        new javamsguni();
    }
}