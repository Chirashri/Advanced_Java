/*4c. Develop a Swing program in Java to display a message “Digital Clock is pressed” or “Hour
Glass is pressed” depending upon the Jbutton with image either Digital Clock or Hour Glass is
pressed by implementing the event handling mechanism with addActionListener( ).*/
package github1;



import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Image_Button_Demo4c {
	 JLabel messageLabel; 
	 
	    Image_Button_Demo4c() { 
	        // Create the main window 
	        JFrame frame = new JFrame("Clock & Hourglass Button Example"); 
	 
	        // Create a label to show the message 
	        messageLabel = new JLabel(); 
	        messageLabel.setBounds(50, 30, 500, 50); 
	        messageLabel.setFont(new Font("Arial", Font.BOLD, 24)); 
	 
	        // Load images (place them in your project directory or use full paths) 
	        ImageIcon digitalClockIcon = new ImageIcon("D:\\6thsem\\time.jpg"); // You must have this 
	//image 
	        ImageIcon hourGlassIcon = new ImageIcon("D:\\6thsem\\hour.jpg");        // You must have this 
	//image 
	 
	        // Create button with digital clock image 
	        JButton digitalClockButton = new JButton(digitalClockIcon); 
	        digitalClockButton.setBounds(100, 100, 120, 120); 
	        digitalClockButton.addActionListener(new ActionListener() { 
	            public void actionPerformed(ActionEvent e) { 
	                messageLabel.setText("Digital Clock is pressed"); 
	            } 
	        }); 
	 
	        // Create button with hourglass image 
	        JButton hourGlassButton = new JButton(hourGlassIcon); 
	        hourGlassButton.setBounds(300, 100, 120, 120); 
	        hourGlassButton.addActionListener(new ActionListener() { 
	            public void actionPerformed(ActionEvent e) { 
	                messageLabel.setText("Hour Glass is pressed"); 
	            } 
	        }); 
	 
	        // Add components to the frame 
	        frame.add(messageLabel); 
	        frame.add(digitalClockButton); 
	        frame.add(hourGlassButton); 
	 
	        // Configure the frame 
	        frame.setSize(550, 300); 
	        frame.setLayout(null); 
	        frame.setVisible(true); 
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	    } 
	 
	    public static void main(String[] args) { 
	        new Image_Button_Demo4c(); 
	    } 
}


