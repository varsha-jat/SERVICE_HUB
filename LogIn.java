package HUB;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.JToolBar;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import javax.swing.JInternalFrame;
import javax.swing.SwingConstants;

public class LogIn extends JFrame{

	String email;
	String password;
	JFrame LOGIN;
	private JTextField textField;
	SignUp objSign = new SignUp();
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogIn window = new LogIn();
					window.LOGIN.setVisible(true);
					//window.objSign.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LogIn() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		LOGIN = new JFrame();
		LOGIN.getContentPane().setBackground(new Color(192, 192, 192));
		LOGIN.setTitle("LOGIN");
		LOGIN.setBounds(100, 100, 953, 600);
		LOGIN.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		LOGIN.getContentPane().setLayout(null);
		
		JInternalFrame internalFrame = new JInternalFrame("");
		internalFrame.setBounds(600, 40, 400, 500);
		LOGIN.getContentPane().add(internalFrame);
		internalFrame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(160, 80, 194, 30);
		internalFrame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Email ID");
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(50, 80, 87, 28);
		internalFrame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setForeground(new Color(0, 0, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(50, 150, 82, 25);
		internalFrame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				email=textField.getText();
				password=passwordField.getText();
				try {
					Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/service","root","root");
					System.out.println("connection successfully");
					String query="SELECT * FROM service_providers WHERE email_id ='"+ email + "' AND password='"+password+"'";
					PreparedStatement ps= con.prepareStatement(query);
					ResultSet rs= ps.executeQuery();
					if(rs.next()) {
						JOptionPane.showMessageDialog(btnNewButton, "LOG IN SUCCESSFULL");
						
//						JOptionPane optionPane = new JOptionPane();
						
//						optionPane.setBounds(0, 0, 262, 90);
//						LOGIN.getContentPane().add(optionPane);
						//System.out.println("name "+ rs.getString("first_name"));
						//System.out.println("LOG IN successfully!");
					}else {
						//System.out.println("LOG IN failed!");
						JOptionPane.showMessageDialog(btnNewButton, "LOG IN FAILED!\n Enter valid Email/Password");
					}
//					int i=ps.executeUpdate();
//					System.out.println(i+ " login");
				}catch(Exception e1) {
					System.out.println(e1.getMessage());
				}
			}
		});
		
		btnNewButton.setBackground(new Color(128, 128, 255));
		btnNewButton.setBounds(80, 260, 200, 35);
		internalFrame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Don't have an account ? /SIGN UP");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					//new SignUp().setVisible(true);
					LOGIN.dispose();
					SignUp objSign = new SignUp();
					objSign.SIGNUP.setVisible(true);
					//objSignsetVisible(true);
				}catch(Exception e3) {
					System.out.println(e3.getMessage());
				}
			}});
		btnNewButton_1.setForeground(new Color(128, 128, 255));
		btnNewButton_1.setBounds(60, 370, 230, 20);
		internalFrame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("----------------------  OR  ----------------------");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setForeground(new Color(0, 0, 0));
		lblNewLabel_2.setBounds(70, 330, 220, 14);
		internalFrame.getContentPane().add(lblNewLabel_2);
//		ImageIcon img2= new ImageIcon(this.getClass().getResource("/pexels-lisa-fotios-730256.jpg"));
//		
		JButton btnNewButton_2 = new JButton("Forget Password");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ForgetPassword objForgetPassword= new ForgetPassword(email);
				objForgetPassword.frame.setVisible(true);
			}
		});
		btnNewButton_2.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_2.setBounds(195, 183, 140, 16);
		internalFrame.getContentPane().add(btnNewButton_2);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(160, 150, 200, 30);
		internalFrame.getContentPane().add(passwordField);
		
		JLabel lblNewLabel_3 = new JLabel("");
//		ImageIcon img= new ImageIcon(this.getClass().getResource("/pexels-invisiblepower-351448.jpg"));
//		lblNewLabel_3.setIcon(img);
		lblNewLabel_3.setBounds(0, 0, 1390, 730);
		LOGIN.getContentPane().add(lblNewLabel_3);
		internalFrame.setVisible(true);
		
		
	}
}
