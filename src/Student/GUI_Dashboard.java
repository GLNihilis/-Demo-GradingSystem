package Student;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class GUI_Dashboard extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Dashboard frame = new GUI_Dashboard();
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
	public GUI_Dashboard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_Slogan = new JPanel();
		panel_Slogan.setBackground(SystemColor.desktop);
		panel_Slogan.setBounds(0, 0, 250, 70);
		contentPane.add(panel_Slogan);
		panel_Slogan.setLayout(null);
		
		JLabel lbl_Slogan = new JLabel("DASHBOARD");
		lbl_Slogan.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Slogan.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lbl_Slogan.setForeground(SystemColor.textHighlightText);
		lbl_Slogan.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\BTNhom_9\\src\\icons\\icons8-dashboard-32 (1).png"));
		lbl_Slogan.setBounds(8, 8, 234, 54);
		panel_Slogan.add(lbl_Slogan);
		
		JPanel panel_Header = new JPanel();
		panel_Header.setBounds(248, 0, 838, 70);
		panel_Header.setBackground(SystemColor.textHighlight);
		contentPane.add(panel_Header);
		panel_Header.setLayout(null);
		
		JLabel lbl_Slogan_1 = new JLabel("Log Out");
		lbl_Slogan_1.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\BTNhom_9\\src\\icons\\icons8-shutdown-32.png"));
		lbl_Slogan_1.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Slogan_1.setForeground(SystemColor.desktop);
		lbl_Slogan_1.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lbl_Slogan_1.setBounds(675, 8, 155, 54);
		panel_Header.add(lbl_Slogan_1);
		
		JButton btn_Student = new JButton("");
		btn_Student.setFont(new Font("Tahoma", Font.PLAIN, 32));
		btn_Student.setBorderPainted(false);
		btn_Student.setBackground(SystemColor.textHighlight);
		btn_Student.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\BTNhom_9\\src\\icons\\icons8-add-user-group-man-man-25.png"));
		btn_Student.setBounds(70, 200, 240, 139);
		contentPane.add(btn_Student);
		
		JButton btn_Score = new JButton("");
		btn_Score.setBackground(SystemColor.textHighlight);
		btn_Score.setBorderPainted(false);
		btn_Score.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\BTNhom_9\\src\\icons\\icons8-add-to-clipboard-25.png"));
		btn_Score.setBounds(420, 200, 240, 139);
		contentPane.add(btn_Score);
		
		JButton btn_Search = new JButton("");
		btn_Search.setBackground(SystemColor.textHighlight);
		btn_Search.setBorderPainted(false);
		btn_Search.setBounds(775, 200, 240, 139);
		contentPane.add(btn_Search);
		
		JLabel lbl_Student = new JLabel("Student  Management");
		lbl_Student.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl_Student.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Student.setBounds(70, 335, 240, 50);
		contentPane.add(lbl_Student);
		
		JLabel lbl_Score = new JLabel("Score Management");
		lbl_Score.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl_Score.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Score.setBounds(420, 335, 240, 50);
		contentPane.add(lbl_Score);
		
		JLabel lbl_Search = new JLabel("Search");
		lbl_Search.setFont(new Font("Tahoma", Font.BOLD, 18));
		lbl_Search.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Search.setBounds(775, 335, 240, 50);
		contentPane.add(lbl_Search);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 66, 1086, 447);
		contentPane.add(panel);
	}
}
