package client;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import javax.swing.JLayeredPane;
import javax.swing.JTextPane;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.Button;

public class MainView extends JFrame {

	private JPanel contentPane;
	private JTextField tF_search;
	private JTextField txtWriteMesage;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainView frame = new MainView();
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
	public MainView() {
		setTitle("Chat application");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setSize(900,500);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(20, 20, 20, 20));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_chat = new JPanel();
		panel_chat.setBackground(new Color(255, 255, 255));
		panel_chat.setBounds(275, 11, 588, 439);
		contentPane.add(panel_chat);
		panel_chat.setLayout(null);
		
		JLabel lbl_chatuser1 = new JLabel("   User 1");
		lbl_chatuser1.setBackground(new Color(84, 172, 224));
		lbl_chatuser1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lbl_chatuser1.setBounds(27, 25, 536, 41);
		lbl_chatuser1.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("gamer.png"))));
		panel_chat.add(lbl_chatuser1);
		
		txtWriteMesage = new JTextField();
		txtWriteMesage.setBackground(new Color(192, 192, 192));
		txtWriteMesage.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		txtWriteMesage.setForeground(new Color(0, 0, 0));
		txtWriteMesage.setHorizontalAlignment(SwingConstants.CENTER);
		txtWriteMesage.setText("Write a message");
		txtWriteMesage.setBounds(62, 376, 450, 41);
		panel_chat.add(txtWriteMesage);
		txtWriteMesage.setColumns(10);
		
		JButton btn_send = new JButton("");
		btn_send.setBackground(new Color(134, 196, 247));
		btn_send.setBounds(522, 376, 45, 41);
		btn_send.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("paper-plane.png"))));
		panel_chat.add(btn_send);
		
		JButton btn_file = new JButton("");
		btn_file.setBackground(new Color(255, 255, 255));
		btn_file.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_file.setBounds(7, 376, 45, 41);
		btn_file.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("link.png"))));
		panel_chat.add(btn_file);
		
		JPanel panel_list = new JPanel();
		panel_list.setBackground(new Color(255, 255, 255));
		panel_list.setBounds(10, 11, 232, 439);
		contentPane.add(panel_list);
		panel_list.setLayout(null);
		
		JLabel lbl_tina = new JLabel("   Tina");
		lbl_tina.setFont(new Font("Segoe UI Emoji", Font.BOLD, 14));
		lbl_tina.setBounds(40, 11, 152, 84);
		lbl_tina.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("woman1.png"))));
		panel_list.add(lbl_tina);
		
		JButton btn_user1 = new JButton("User 1");
		btn_user1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_user1.setBackground(new Color(255, 255, 255));
		btn_user1.setFont(new Font("Segoe UI", Font.BOLD, 11));
		btn_user1.setBounds(10, 172, 212, 44);
		btn_user1.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("gamer.png"))));
		panel_list.add(btn_user1);
		
		
		JButton btn_user3 = new JButton("User 3");
		btn_user3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_user3.setFont(new Font("Segoe UI", Font.BOLD, 11));
		btn_user3.setBackground(Color.WHITE);
		btn_user3.setBounds(10, 339, 212, 44);
		btn_user3.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("beau.png"))));
		panel_list.add(btn_user3);
		
		JButton btn_user2 = new JButton("User 2");
		btn_user2.setFont(new Font("Segoe UI", Font.BOLD, 11));
		btn_user2.setBackground(Color.WHITE);
		btn_user2.setBounds(10, 262, 212, 44);
		btn_user2.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("man.png"))));
		panel_list.add(btn_user2);
		
		tF_search = new JTextField();
		tF_search.setBounds(10, 106, 175, 37);
		panel_list.add(tF_search);
		tF_search.setColumns(10);
		
		JButton btn_search = new JButton("");
		btn_search.setBackground(new Color(84, 172, 224));
		btn_search.setBounds(187, 106, 35, 37);
		btn_search.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().createImage(MainView.class.getResource("search.png"))));
		panel_list.add(btn_search);
		
		
	
	}
}