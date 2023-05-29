package client;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import client.*;

public class SendFileView extends JFrame {

	private JPanel contentPane;
	private JTextField tF_choose;
	private JTextField tF_send;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SendFileView frame = new SendFileView();
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
	public SendFileView() {
		setTitle("Chat application");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 554, 382);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(20, 20, 20, 20));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(192, 192, 192));
		panel.setBounds(75, 91, 391, 183);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lbl_choose = new JLabel("Choose file");
		lbl_choose.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lbl_choose.setBounds(42, 31, 71, 28);
		panel.add(lbl_choose);
		
		JLabel lbl_send = new JLabel("Send file");
		lbl_send.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lbl_send.setBounds(42, 92, 71, 28);
		panel.add(lbl_send);
		
		tF_choose = new JTextField();
		tF_choose.setBounds(42, 58, 245, 23);
		panel.add(tF_choose);
		tF_choose.setColumns(10);
		
		tF_send = new JTextField();
		tF_send.setColumns(10);
		tF_send.setBounds(42, 120, 245, 23);
		panel.add(tF_send);
		
		JButton btnFind = new JButton("Find");
		btnFind.setFont(new Font("Segoe UI", Font.BOLD, 13));
		btnFind.setBackground(new Color(89, 183, 219));
		btnFind.setBounds(309, 57, 72, 23);
		panel.add(btnFind);
		
		JButton btnSend = new JButton("Send");
		btnSend.setFont(new Font("Segoe UI", Font.BOLD, 13));
		btnSend.setBackground(new Color(240, 162, 43));
		btnSend.setBounds(309, 120, 72, 23);
		panel.add(btnSend);
		
		JLabel lblNewLabel = new JLabel("Chat application");
		lblNewLabel.setFont(new Font("Goudy Old Style", Font.BOLD, 28));
		lblNewLabel.setBounds(165, 11, 203, 40);
		contentPane.add(lblNewLabel);
		
		
	}
}

