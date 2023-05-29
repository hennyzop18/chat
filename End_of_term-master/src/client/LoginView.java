package client;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import client.*;

public class LoginView extends JFrame {

	private JPanel contentPane;
	private JTextField tF_user;
	private JTextField tF_password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginView frame = new LoginView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginView() {
		setTitle("Chat application");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(20, 20, 20, 20));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 261);
		contentPane.add(panel);
		panel.setLayout(null);
		
		tF_user = new JTextField();
		tF_user.setBounds(188, 67, 142, 25);
		panel.add(tF_user);
		tF_user.setColumns(10);
		
		tF_password = new JTextField();
		tF_password.setBounds(188, 114, 142, 25);
		panel.add(tF_password);
		tF_password.setColumns(10);
		
		JLabel Lb_user = new JLabel("username");
		Lb_user.setFont(new Font("Segoe UI", Font.BOLD, 11));
		Lb_user.setBounds(121, 71, 57, 14);
		panel.add(Lb_user);
		
		JLabel Lb_password = new JLabel("password");
		Lb_password.setFont(new Font("Segoe UI", Font.BOLD, 11));
		Lb_password.setBounds(121, 118, 59, 14);
		panel.add(Lb_password);
		
		
		
		
		
		JButton btn_login = new JButton("Login");
		btn_login.setBounds(197, 159, 75, 25);
		panel.add(btn_login);
		btn_login.setForeground(new Color(255, 255, 255));
		btn_login.setBackground(new Color(128, 128, 128));
		btn_login.setFont(new Font("Segoe UI Black", Font.PLAIN, 11));
		
		JLabel lb_donthave = new JLabel("Don't have an account ?  ");
		lb_donthave.setFont(new Font("Arial", Font.PLAIN, 11));
		lb_donthave.setBounds(159, 195, 130, 14);
		panel.add(lb_donthave);
		
		JLabel lb_signup = new JLabel("Sign-up");
		lb_signup.setForeground(new Color(128, 128, 255));
		lb_signup.setBounds(284, 195, 46, 14);
		panel.add(lb_signup);
		
		JLabel lblNewLabel = new JLabel("Chat application");
		lblNewLabel.setFont(new Font("Goudy Old Style", Font.BOLD, 28));
		lblNewLabel.setBounds(127, 21, 203, 40);
		panel.add(lblNewLabel);
		btn_login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
	
	}
}
