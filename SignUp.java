package HUB;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import javax.swing.ButtonGroup;

import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.Box;
import java.awt.Component;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JTree;

public class SignUp extends JFrame{
	String gender;
	JTextField password;
	private JFrame frmSignUp;
	//private final Action action = new SwingAction();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					SignUp window = new SignUp();
//					window.frmSignUp.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
		try {
			SignUp window = new SignUp();
			window.frmSignUp.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the application.
	 */
	public SignUp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frmSignUp = new JFrame();
		frmSignUp.setTitle("SIGN UP");
		frmSignUp.getContentPane().setBackground(new Color(192, 192, 192));
		frmSignUp.setBounds(100, 100, 954, 600);
		frmSignUp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSignUp.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("First Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(636, 68, 71, 14);
		frmSignUp.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(732, 65, 124, 20);
		frmSignUp.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Last Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(636, 93, 71, 14);
		frmSignUp.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(732, 89, 124, 20);
		frmSignUp.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Age");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(636, 116, 46, 14);
		frmSignUp.getContentPane().add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(732, 113, 123, 20);
		frmSignUp.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Gender");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(636, 141, 46, 14);
		frmSignUp.getContentPane().add(lblNewLabel_3);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Female");
		rdbtnNewRadioButton.setBounds(734, 138, 71, 23);
		frmSignUp.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Male");
		rdbtnNewRadioButton_1.setBounds(806, 138, 70, 23);
		frmSignUp.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Other");
		rdbtnNewRadioButton_2.setBounds(877, 138, 109, 23);
		frmSignUp.getContentPane().add(rdbtnNewRadioButton_2);
		
		
		ButtonGroup bg=new ButtonGroup();   
		bg.add(rdbtnNewRadioButton);
		bg.add(rdbtnNewRadioButton_1);
		bg.add(rdbtnNewRadioButton_2);
		
		JLabel lblNewLabel_4 = new JLabel("Email ID");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_4.setBounds(637, 165, 46, 14);
		frmSignUp.getContentPane().add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBounds(733, 165, 123, 20);
		frmSignUp.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Contact No.");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_5.setBounds(637, 190, 70, 14);
		frmSignUp.getContentPane().add(lblNewLabel_5);
		
		textField_4 = new JTextField();
		textField_4.setBounds(733, 189, 123, 20);
		frmSignUp.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNewLabel_6 = new JLabel("Address");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_6.setBounds(638, 215, 49, 14);
		frmSignUp.getContentPane().add(lblNewLabel_6);
		
		textField_5 = new JTextField();
		textField_5.setBounds(733, 213, 123, 20);
		frmSignUp.getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("City");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_7.setBounds(639, 239, 46, 14);
		frmSignUp.getContentPane().add(lblNewLabel_7);
		
		textField_6 = new JTextField();
		textField_6.setBounds(733, 237, 123, 20);
		frmSignUp.getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("State");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_8.setBounds(639, 263, 46, 14);
		frmSignUp.getContentPane().add(lblNewLabel_8);
		
		textField_7 = new JTextField();
		textField_7.setBounds(733, 261, 123, 20);
		frmSignUp.getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Country");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_9.setBounds(639, 285, 60, 14);
		frmSignUp.getContentPane().add(lblNewLabel_9);
		
		textField_8 = new JTextField();
		textField_8.setBounds(733, 285, 123, 20);
		frmSignUp.getContentPane().add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Pin Code");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_10.setBounds(639, 310, 60, 14);
		frmSignUp.getContentPane().add(lblNewLabel_10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(733, 310, 123, 20);
		frmSignUp.getContentPane().add(textField_9);
		textField_9.setColumns(10);
		
		boolean b=true ;
		String password;
		String confirmPassword;
		JLabel lblNewLabel_11 = new JLabel("Password");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_11.setBounds(639, 333, 60, 14);
		frmSignUp.getContentPane().add(lblNewLabel_11);
		do {
		textField_12 = new JTextField();
		textField_12.setBounds(733, 333, 123, 20);
		frmSignUp.getContentPane().add(textField_12);
		textField_12.setColumns(10);
		password=textField_12.getText();
		JLabel lblNewLabel_12 = new JLabel("Confirm Password");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_12.setBounds(632, 358, 100, 14);
		frmSignUp.getContentPane().add(lblNewLabel_12);
		
		textField_13 = new JTextField();
		textField_13.setBounds(733, 356, 123, 20);
		frmSignUp.getContentPane().add(textField_13);
		textField_13.setColumns(10);
		confirmPassword=textField_13.getText();
		
		if(password.equals(confirmPassword)) {
			b=false;
			//password.setText(textField_12.getText());
			//password.setText(textField_12.getText());
		}else {
			textField_12.setText("");
			textField_13.setText("");
		}
		}while(b==true);
		
		JButton btnNewButton = new JButton("SIGN UP");
		btnNewButton.setBackground(new Color(128, 128, 255));
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/service","root","root");
					System.out.println("connection successfully");
					String query ="INSERT INTO costumor VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
					if(rdbtnNewRadioButton.isSelected()) {
						gender="FEMALE";
					}else if(rdbtnNewRadioButton_1.isSelected()) {
						gender="MALE";
					}else if(rdbtnNewRadioButton_2.isSelected()) {
						gender="other";
					}
					PreparedStatement ps=con.prepareStatement(query);
					ps.setString(1,textField.getText());
					ps.setString(2,textField_1.getText());
					ps.setString(3,textField_2.getText());
					ps.setString(4,gender);
					ps.setString(5, textField_3.getText());
					ps.setString(6,textField_4.getText());
					ps.setString(7,textField_5.getText());
					ps.setString(8,textField_6.getText());
					ps.setString(9,textField_7.getText());
					ps.setString(10,textField_8.getText());
					ps.setString(11,textField_9.getText());
					ps.setString(12,textField_12.getText());
					int i=ps.executeUpdate();
					System.out.println(i+ "INSERTED!");
					
				}catch(Exception e1) {
					System.out.println(e1.getMessage());
				}
			}
		});
		
		JButton btnNewButton_1 = new JButton("RESET");
		btnNewButton_1.setBackground(new Color(128, 128, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					textField.setText("");
					textField_1.setText("");
					textField_2.setText("");
					textField_3.setText("");
					textField_4.setText("");
					textField_5.setText("");
					textField_6.setText("");
					textField_7.setText("");
					textField_8.setText("");
					textField_9.setText("");
					textField_12.setText("");
					textField_13.setText("");
				}catch(Exception e2) {
					System.out.println(e2.getMessage());
				}
			}
			});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(820, 415, 100, 35);
		frmSignUp.getContentPane().add(btnNewButton_1);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(650, 415, 100, 35);
		frmSignUp.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Attach Profile Image");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser newFile= new JFileChooser();
				newFile.showOpenDialog(null);
			}
		});
		btnNewButton_2.setBounds(680, 20, 150, 23);
		frmSignUp.getContentPane().add(btnNewButton_2);
		
		
		
		
		
		
		//JButton btnNewButton = new JButton("Sign Up");
		
//		btnNewButton.setBackground(new Color(128, 128, 255));
//		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
//		btnNewButton.setBounds(700, 400, 100, 30);
//		frmSignUp.getContentPane().add(btnNewButton);
//		
//		JLabel lblNewLabel_11 = new JLabel("Password");
//		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 12));
//		lblNewLabel_11.setBounds(639, 330, 60, 14);
//		frmSignUp.getContentPane().add(lblNewLabel_11);
//		
//		
//		
//		ButtonGroup group = new ButtonGroup();
//	}
	}
	}

