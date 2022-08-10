import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;

public class Login {

	private JFrame frame;
	private JTextField textField;
	private JPasswordField passwordField;
	protected Object sc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try {
					Login window = new Login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(Color.GREEN);
		frame.setBounds(100, 100, 735, 363);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hospital Management  System");
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 46));
		lblNewLabel.setBounds(181, 3, 483, 156);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("USERNAME");
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblNewLabel_1.setBounds(51, 104, 123, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("PASSWORD");
		lblNewLabel_1_1.setFont(new Font("SansSerif", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(51, 147, 123, 20);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setBounds(181, 107, 306, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(184, 150, 303, 20);
		frame.getContentPane().add(passwordField);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = textField.getText();
				String password= passwordField.getText();
			if(password.contains ("World") && username.contains("Hello"))
			{
				textField.setText(null);
				passwordField.setText(null);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "INVALID LOGIN","ERROR",JOptionPane.ERROR_MESSAGE);
				textField.setText(null);
				passwordField.setText(null);
			}
			}
		});
		btnNewButton.setFont(new Font("SansSerif", Font.BOLD, 14));
		btnNewButton.setBounds(73, 200, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("ADMIN");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_1.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 14));
		btnNewButton_1.setBounds(250, 200, 155, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("EXIT");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_2.setFont(new Font("SansSerif", Font.BOLD, 14));
		btnNewButton_2.setBounds(459, 202, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_1_1 = new JButton("STUDENT");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent args) {
				textField.setText(null);
				passwordField.setText(null);
			}
		});
		btnNewButton_1_1.setFont(new Font("SansSerif", Font.BOLD | Font.ITALIC, 14));
		btnNewButton_1_1.setBounds(250, 264, 155, 23);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 189, 678, 0);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(732, 72, -732, 0);
		frame.getContentPane().add(separator_1);
	}
}
