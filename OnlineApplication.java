package OnlineForm;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.TextField;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.tree.DefaultTreeCellEditor.DefaultTextField;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OnlineApplication {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OnlineApplication window = new OnlineApplication();
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
	public OnlineApplication() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.CYAN);
		frame.setBounds(100, 100, 887, 731);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("HOSPITAL APPLICATION FORM");
		lblNewLabel.setBounds(375, 24, 743, 42);
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 44));
		
		JLabel lblNewLabel_1 = new JLabel("Name Of Patient");
		lblNewLabel_1.setBounds(57, 86, 237, 23);
		lblNewLabel_1.setFont(new Font("SansSerif", Font.BOLD, 24));
		lblNewLabel_1.setBackground(Color.CYAN);
		
		JLabel lblNewLabel_2 = new JLabel("First Name:");
		lblNewLabel_2.setBounds(57, 142, 138, 23);
		lblNewLabel_2.setFont(new Font("SansSerif", Font.PLAIN, 16));
		
		textField = new JTextField();
		textField.setBounds(151, 142, 212, 20);
		textField.setColumns(10);
		
		JLabel lblNewLabel_2_1 = new JLabel("Last Name:");
		lblNewLabel_2_1.setBounds(57, 176, 138, 23);
		lblNewLabel_2_1.setFont(new Font("SansSerif", Font.PLAIN, 16));
		
		textField_1 = new JTextField();
		textField_1.setBounds(151, 180, 212, 20);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel(" Category:");
		lblNewLabel_3.setBounds(57, 335, 237, 33);
		lblNewLabel_3.setFont(new Font("SansSerif", Font.BOLD, 18));
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Male");
		rdbtnNewRadioButton.setBounds(57, 224, 111, 23);
		rdbtnNewRadioButton.setFont(new Font("SansSerif", Font.PLAIN, 14));
		
		JRadioButton rdbtnFemale = new JRadioButton("Female");
		rdbtnFemale.setBounds(194, 224, 111, 23);
		rdbtnFemale.setFont(new Font("SansSerif", Font.PLAIN, 14));
		
		JRadioButton rdbtnChild = new JRadioButton("Child");
		rdbtnChild.setBounds(57, 283, 111, 23);
		rdbtnChild.setFont(new Font("SansSerif", Font.PLAIN, 14));
		
		JRadioButton rdbtnAdult = new JRadioButton("Adult");
		rdbtnAdult.setBounds(209, 283, 111, 23);
		rdbtnAdult.setFont(new Font("SansSerif", Font.PLAIN, 14));
		
		JRadioButton rdbtnCitizen = new JRadioButton("Citizen");
		rdbtnCitizen.setBounds(355, 283, 111, 23);
		rdbtnCitizen.setFont(new Font("SansSerif", Font.PLAIN, 14));
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(lblNewLabel);
		frame.getContentPane().add(lblNewLabel_1);
		frame.getContentPane().add(lblNewLabel_2);
		frame.getContentPane().add(textField);
		frame.getContentPane().add(lblNewLabel_2_1);
		frame.getContentPane().add(textField_1);
		frame.getContentPane().add(rdbtnNewRadioButton);
		frame.getContentPane().add(rdbtnFemale);
		frame.getContentPane().add(lblNewLabel_3);
		frame.getContentPane().add(rdbtnChild);
		frame.getContentPane().add(rdbtnAdult);
		frame.getContentPane().add(rdbtnCitizen);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(167, 344, 212, 20);
		frame.getContentPane().add(textField_2);
		
		JLabel lblNewLabel_4 = new JLabel("(ex: Gynacologist, psycologist, etc..,,,)");
		lblNewLabel_4.setFont(new Font("SansSerif", Font.PLAIN, 14));
		lblNewLabel_4.setBounds(99, 379, 332, 23);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_3_1 = new JLabel("PhoneNumber:");
		lblNewLabel_3_1.setFont(new Font("SansSerif", Font.BOLD, 14));
		lblNewLabel_3_1.setBounds(68, 413, 237, 42);
		frame.getContentPane().add(lblNewLabel_3_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(290, 421, 212, 20);
		frame.getContentPane().add(textField_3);
		
		JLabel lblNewLabel_4_1 = new JLabel("(ex: Only numbers \"1234567890\" etc..,,,)");
		lblNewLabel_4_1.setFont(new Font("SansSerif", Font.PLAIN, 14));
		lblNewLabel_4_1.setBounds(115, 456, 332, 23);
		frame.getContentPane().add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Address:");
		lblNewLabel_1_1.setFont(new Font("SansSerif", Font.BOLD, 24));
		lblNewLabel_1_1.setBackground(Color.CYAN);
		lblNewLabel_1_1.setBounds(57, 504, 345, 23);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(80, 541, 322, 63);
		frame.getContentPane().add(textField_4);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				{
					JOptionPane.showMessageDialog(null,"ENTER DETAILS FIRST", "CORRECT",JOptionPane.OK_OPTION);
				}
				String Firstname = textField.getText();
				String Lastname = textField_1.getText();
				String Category = textField_2.getText();
				if(Firstname.contains("") )
				{
					textField.setText(null);//ONlY IF statements are used//
					
				}
				if(Lastname.contains(""))
				{
					textField_1.setText(null);
					
				}
				if(Category.contains(""))
				{
					textField_2.setText(null);
				}
				{
					JOptionPane.showMessageDialog(null,"DEAITLS ARE SUBMITTED", "CORRECT",JOptionPane.OK_OPTION);
				}
				
			}
		});
		btnNewButton.setFont(new Font("SansSerif", Font.PLAIN, 20));
		btnNewButton.setBounds(61, 624, 134, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnClose = new JButton("Reset");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null,"RESET COMPLETED", "CORRECT",JOptionPane.OK_OPTION);
			}
			{
				String Firstname = textField.getText();
				String Lastname = textField_1.getText();
				String Category = textField_2.getText();
				if(Firstname.contains("") )
				{
					textField.setText(null);//ONlY IF statements are used//
					
				}
				if(Lastname.contains(""))
				{
					textField_1.setText(null);
					
				}
				if(Category.contains(""))
				{
					textField_2.setText(null);
				}
			}
		});
		btnClose.setFont(new Font("SansSerif", Font.PLAIN, 20));
		btnClose.setBounds(229, 624, 134, 23);
		frame.getContentPane().add(btnClose);
		
	}	};
		
			
	

