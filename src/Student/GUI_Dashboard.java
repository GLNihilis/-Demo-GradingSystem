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
		setBounds(100, 100, 1290, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Panel panel = new Panel();
		panel.setBackground(new Color(30, 164, 255));
		panel.setBounds(0, 0, 1274, 67);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lbl_Slogan = new JLabel("STUDENT MANAGEMENT");
		lbl_Slogan.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Slogan.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\BTNhom_9\\bin\\icons\\icons8-dashboard-32.png"));
		lbl_Slogan.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lbl_Slogan.setBounds(10, 11, 293, 45);
		panel.add(lbl_Slogan);
		
		JLabel lbl_Email = new JLabel("user@gmail.com");
		lbl_Email.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_Email.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lbl_Email.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\BTNhom_9\\bin\\icons\\icons8-male-user-32.png"));
		lbl_Email.setBounds(708, 11, 361, 45);
		panel.add(lbl_Email);
		
		JLabel lbl_Logout = new JLabel("Logout ");
		lbl_Logout.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Logout.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\BTNhom_9\\bin\\icons\\icons8-shutdown-32.png"));
		lbl_Logout.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lbl_Logout.setBounds(1160, 13, 124, 43);
		panel.add(lbl_Logout);
		
		Panel panel_1 = new Panel();
		panel_1.setBackground(Color.DARK_GRAY);
		panel_1.setBounds(0, 67, 210, 594);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lbl_Dashboard = new JLabel("DASHBOARD");
		lbl_Dashboard.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\BTNhom_9\\bin\\icons\\icons8-dashboard-32 (1).png"));
		lbl_Dashboard.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Dashboard.setForeground(Color.WHITE);
		lbl_Dashboard.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lbl_Dashboard.setBounds(0, 0, 210, 50);
		panel_1.add(lbl_Dashboard);
		
		Panel panel_2 = new Panel();
		panel_2.setBackground(new Color(30, 164, 255));
		panel_2.setBounds(0, 51, 210, 10);
		panel_1.add(panel_2);
		
		JLabel lbl_Student = new JLabel("Student");
		lbl_Student.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_Student.setForeground(Color.WHITE);
		lbl_Student.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lbl_Student.setBounds(0, 61, 210, 40);
		panel_1.add(lbl_Student);
		
		JButton lbl_S_Add = new JButton("Add");
		lbl_S_Add.setContentAreaFilled(false);
		lbl_S_Add.setBorderPainted(false);
		lbl_S_Add.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GUI_S_Add S_Add = new GUI_S_Add();
				S_Add.setVisible(true);
			}
		});
		lbl_S_Add.setBackground(Color.DARK_GRAY);
		lbl_S_Add.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_S_Add.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\BTNhom_9\\bin\\icons\\icons8-add-user-group-man-man-25.png"));
		lbl_S_Add.setForeground(new Color(255, 255, 255));
		lbl_S_Add.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lbl_S_Add.setBounds(0, 104, 210, 25);
		panel_1.add(lbl_S_Add);
		
		JButton lbl_S_Remove = new JButton("Remove");
		lbl_S_Remove.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GUI_S_Remove S_Remove = new GUI_S_Remove();
				S_Remove.setVisible(true);
			}
		});
		lbl_S_Remove.setBorderPainted(false);
		lbl_S_Remove.setContentAreaFilled(false);
		lbl_S_Remove.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_S_Remove.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\BTNhom_9\\bin\\icons\\icons8-denied-25.png"));
		lbl_S_Remove.setForeground(Color.WHITE);
		lbl_S_Remove.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lbl_S_Remove.setBounds(0, 128, 210, 25);
		panel_1.add(lbl_S_Remove);
		
		JButton lbl_S_Update = new JButton("Update");
		lbl_S_Update.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GUI_S_Update S_Update = new GUI_S_Update();
				S_Update.setVisible(true);
			}
		});
		lbl_S_Update.setContentAreaFilled(false);
		lbl_S_Update.setBorderPainted(false);
		lbl_S_Update.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_S_Update.setForeground(Color.WHITE);
		lbl_S_Update.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\BTNhom_9\\bin\\icons\\icons8-update-user-25.png"));
		lbl_S_Update.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lbl_S_Update.setBounds(0, 155, 210, 25);
		panel_1.add(lbl_S_Update);
		
		JButton lbl_S_Manage = new JButton("Manage");
		lbl_S_Manage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GUI_S_Manage S_Manage = new GUI_S_Manage();
				S_Manage.setVisible(true);
			}
		});
		lbl_S_Manage.setBorderPainted(false);
		lbl_S_Manage.setContentAreaFilled(false);
		lbl_S_Manage.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_S_Manage.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\BTNhom_9\\bin\\icons\\icons8-shortlist-25.png"));
		lbl_S_Manage.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lbl_S_Manage.setForeground(Color.WHITE);
		lbl_S_Manage.setBounds(0, 181, 210, 25);
		panel_1.add(lbl_S_Manage);
		
		JLabel lbl_Score = new JLabel("Score");
		lbl_Score.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_Score.setForeground(Color.WHITE);
		lbl_Score.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lbl_Score.setBounds(0, 208, 210, 40);
		panel_1.add(lbl_Score);
		
		JButton lbl_Sc_Add = new JButton("Add");
		lbl_Sc_Add.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GUI_Sc_Add Sc_Add = new GUI_Sc_Add();
				Sc_Add.setVisible(true);
			}
		});
		lbl_Sc_Add.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_Sc_Add.setContentAreaFilled(false);
		lbl_Sc_Add.setBorderPainted(false);
		lbl_Sc_Add.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\BTNhom_9\\bin\\icons\\icons8-add-to-clipboard-25.png"));
		lbl_Sc_Add.setForeground(Color.WHITE);
		lbl_Sc_Add.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lbl_Sc_Add.setBounds(0, 251, 210, 25);
		panel_1.add(lbl_Sc_Add);
		
		JButton lbl_Sc_Update = new JButton("Update");
		lbl_Sc_Update.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GUI_Sc_Update Sc_Update = new GUI_Sc_Update();
				Sc_Update.setVisible(true);
			}
		});
		lbl_Sc_Update.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_Sc_Update.setContentAreaFilled(false);
		lbl_Sc_Update.setBorderPainted(false);
		lbl_Sc_Update.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\BTNhom_9\\bin\\icons\\icons8-update-user-25.png"));
		lbl_Sc_Update.setForeground(Color.WHITE);
		lbl_Sc_Update.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lbl_Sc_Update.setBounds(0, 276, 210, 25);
		panel_1.add(lbl_Sc_Update);
		
		JButton lbl_Sc_Manage = new JButton("Manage");
		lbl_Sc_Manage.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GUI_Sc_Manage Sc_Manage = new GUI_Sc_Manage();
				Sc_Manage.setVisible(true);
			}
		});
		lbl_Sc_Manage.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_Sc_Manage.setContentAreaFilled(false);
		lbl_Sc_Manage.setBorderPainted(false);
		lbl_Sc_Manage.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\BTNhom_9\\bin\\icons\\icons8-shortlist-25.png"));
		lbl_Sc_Manage.setForeground(Color.WHITE);
		lbl_Sc_Manage.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lbl_Sc_Manage.setBounds(0, 302, 210, 25);
		panel_1.add(lbl_Sc_Manage);
		
		JLabel lbl_Admin = new JLabel("Admin");
		lbl_Admin.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_Admin.setForeground(Color.WHITE);
		lbl_Admin.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lbl_Admin.setBounds(0, 328, 210, 40);
		panel_1.add(lbl_Admin);
		
		JButton lbl_A_Add = new JButton("Add");
		lbl_A_Add.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GUI_A_Add A_Add = new GUI_A_Add();
				A_Add.setVisible(true);
			}
		});
		lbl_A_Add.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_A_Add.setContentAreaFilled(false);
		lbl_A_Add.setBorderPainted(false);
		lbl_A_Add.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\BTNhom_9\\bin\\icons\\icons8-add-user-group-man-man-25.png"));
		lbl_A_Add.setForeground(Color.WHITE);
		lbl_A_Add.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lbl_A_Add.setBounds(0, 368, 210, 25);
		panel_1.add(lbl_A_Add);
		
		JButton lbl_A_Remove = new JButton("Remove");
		lbl_A_Remove.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GUI_A_Remove A_Remove = new GUI_A_Remove();
				A_Remove.setVisible(true);
			}
		});
		lbl_A_Remove.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_A_Remove.setContentAreaFilled(false);
		lbl_A_Remove.setBorderPainted(false);
		lbl_A_Remove.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\BTNhom_9\\bin\\icons\\icons8-denied-25.png"));
		lbl_A_Remove.setForeground(Color.WHITE);
		lbl_A_Remove.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lbl_A_Remove.setBounds(0, 394, 210, 25);
		panel_1.add(lbl_A_Remove);
		
		JButton lbl_A_Update = new JButton("Update");
		lbl_A_Update.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				GUI_A_Update A_Update = new GUI_A_Update();
				A_Update.setVisible(true);
			}
		});
		lbl_A_Update.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_A_Update.setContentAreaFilled(false);
		lbl_A_Update.setBorderPainted(false);
		lbl_A_Update.setIcon(new ImageIcon("C:\\Users\\Admin\\Downloads\\BTNhom_9\\bin\\icons\\icons8-update-user-25.png"));
		lbl_A_Update.setForeground(Color.WHITE);
		lbl_A_Update.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		lbl_A_Update.setBounds(0, 420, 210, 25);
		panel_1.add(lbl_A_Update);
		
		Panel panel_3 = new Panel();
		panel_3.setBounds(210, 67, 1064, 594);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lbl_Title = new JLabel("Statistics");
		lbl_Title.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_Title.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lbl_Title.setBounds(505, 11, 85, 27);
		panel_3.add(lbl_Title);
		
		JLabel lbl_C1 = new JLabel("Student: ");
		lbl_C1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_C1.setBounds(63, 43, 69, 20);
		panel_3.add(lbl_C1);
		
		JLabel lbl_C2 = new JLabel("Medium score: ");
		lbl_C2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_C2.setBounds(63, 74, 111, 24);
		panel_3.add(lbl_C2);
		
		JLabel lbl_C4 = new JLabel("Class: ");
		lbl_C4.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_C4.setBounds(384, 46, 46, 16);
		panel_3.add(lbl_C4);
		
		JLabel lbl_C5 = new JLabel("Student class 10: ");
		lbl_C5.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_C5.setBounds(384, 80, 129, 18);
		panel_3.add(lbl_C5);
		
		JLabel lbl_C6 = new JLabel("Student class 11: ");
		lbl_C6.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_C6.setBounds(707, 47, 160, 16);
		panel_3.add(lbl_C6);
		
		JLabel lbl_C7 = new JLabel("Student class 12: ");
		lbl_C7.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_C7.setBounds(707, 80, 123, 16);
		panel_3.add(lbl_C7);
	}
}
