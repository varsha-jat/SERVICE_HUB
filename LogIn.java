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
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.JToolBar;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

public class LogIn extends JFrame{

	private JFrame LOGIN;
	private JTextField textField;
	private JPasswordField passwordField;
	SignUp objSign = new SignUp();

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
	
	public void initialize() {
		LOGIN = new JFrame();
		LOGIN.getContentPane().setBackground(new Color(192, 192, 192));
		LOGIN.setTitle("LOGIN");
		LOGIN.setBounds(100, 100, 953, 600);
		LOGIN.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		LOGIN.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Email ID");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(638, 153, 87, 28);
		LOGIN.getContentPane().add(lblNewLabel);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(733, 215, 194, 30);
		LOGIN.getContentPane().add(passwordField);
		
		textField = new JTextField();
		textField.setBounds(733, 149, 194, 30);
		LOGIN.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(639, 215, 82, 25);
		LOGIN.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/service","root","root");
					System.out.println("connection successfully");
					String query="SELECT * FROM costumor WHERE email_id ='"+ textField.getText() + "' AND password='"+passwordField.getText()+"'";
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
						JOptionPane.showMessageDialog(btnNewButton, "LOG IN FAILED!");
					}
//					int i=ps.executeUpdate();
//					System.out.println(i+ " login");
				}catch(Exception e1) {
					System.out.println(e1.getMessage());
				}
			}
		});
		
		btnNewButton.setBackground(new Color(128, 128, 255));
		btnNewButton.setBounds(680, 300, 200, 35);
		LOGIN.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Don't have an account ? /SIGN UP");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					//new SignUp().setVisible(true);
					SignUp objSign = new SignUp();
					objSign.setVisible(true);
					//objSignsetVisible(true);
				}catch(Exception e3) {
					System.out.println(e3.getMessage());
				}
			}});
		btnNewButton_1.setForeground(new Color(128, 128, 255));
		btnNewButton_1.setBounds(670, 400, 230, 20);
		LOGIN.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("----------------------  OR  ----------------------");
		lblNewLabel_2.setBounds(680, 360, 220, 14);
		LOGIN.getContentPane().add(lblNewLabel_2);
		
		
	}
}
