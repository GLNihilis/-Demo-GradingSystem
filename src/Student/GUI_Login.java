package Student;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSeparator;
import java.awt.Color;
import javax.swing.SwingConstants;

public class GUI_Login extends JFrame {

	private JPanel contentPane;
	private JTextField txt_User;
	private JPasswordField txt_Pass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Login frame = new GUI_Login();
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
	public GUI_Login() {
		setTitle("Login Form");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 473, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 191, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl_Login = new JLabel("Login System");
		lbl_Login.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Login.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lbl_Login.setBounds(163, 23, 137, 21);
		contentPane.add(lbl_Login);
		
		JLabel lbl_User = new JLabel("Username");
		lbl_User.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_User.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lbl_User.setBounds(68, 74, 72, 19);
		contentPane.add(lbl_User);
		
		txt_User = new JTextField();
		txt_User.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txt_User.setBounds(177, 73, 200, 20);
		contentPane.add(txt_User);
		txt_User.setColumns(10);
		
		JLabel lbl_Pass = new JLabel("Password");
		lbl_Pass.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Pass.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lbl_Pass.setBounds(68, 133, 72, 19);
		contentPane.add(lbl_Pass);
		
		txt_Pass = new JPasswordField();
		txt_Pass.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		txt_Pass.setBounds(177, 132, 200, 20);
		contentPane.add(txt_Pass);
		
		JButton btn_Login = new JButton("Login");
		btn_Login.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String password = txt_Pass.getText();
				String username = txt_User.getText();
				
				if(password.contains("123") && username.contains("admin")) {
					txt_Pass.setText(null);
					txt_User.setText(null);
					
					GUI_Search db = new GUI_Search();
					db.setVisible(true);
				}
				else {
					JOptionPane.showMessageDialog(btn_Login, "Invalid Login Details", "Login error", JOptionPane.ERROR_MESSAGE);
					txt_Pass.setText(null);
					txt_User.setText(null);
				}
				
			}
		});
		btn_Login.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btn_Login.setBounds(51, 216, 89, 23);
		contentPane.add(btn_Login);
		
		JButton btn_Exit = new JButton("Exit");
		btn_Exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(btn_Exit, "Confirm if you want to exit", "Login Systems", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btn_Exit.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btn_Exit.setBounds(186, 216, 89, 23);
		contentPane.add(btn_Exit);
		
		JButton btn_Reset = new JButton("Reset");
		btn_Reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txt_User.setText(null);
				txt_Pass.setText(null);
			}
		});
		btn_Reset.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		btn_Reset.setBounds(321, 216, 89, 23);
		contentPane.add(btn_Reset);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(36, 185, 385, 1);
		contentPane.add(separator);
	}
}