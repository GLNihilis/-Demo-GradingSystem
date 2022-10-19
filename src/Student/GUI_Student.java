package Student;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSlider;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPasswordField;

public class GUI_Student extends JFrame {

	private JPanel contentPane;
	private JTextField text_ID;
	private JTextField text_Name;
	private JTextField text_ClassID;
	private JTextField text_Gender;
	private JTextField text_Birth;
	private JTextField text_Address;
	private JTable table;
	Process_Student pst = new Process_Student();
	
	DefaultTableModel Model = new DefaultTableModel();
	Vector<String> column = new Vector<String>();
	Vector<Vector<Object>> row = new Vector<>();
	
	public void getAllStudent() {
		ArrayList<Student> ls = pst.getListStudent();
		for(int i = 0; i < ls.size(); i++) {
			Student s = (Student) ls.get(i);
			Vector<Object> tbRow = new Vector<>();
			tbRow.add(s.getID());
			tbRow.add(s.getName());
			tbRow.add(s.getClassID());
			tbRow.add(s.getGender());
			tbRow.add(s.getBirth());
			tbRow.add(s.getAddress());

			row.add(tbRow);
		}
		Model.setDataVector(row, column);
		table.setModel(Model);
	}
	
	public void Data() {
		ArrayList<Student> ls = pst.getListStudent();
		Model.setRowCount(0);
		for(int i = 0; i < ls.size(); i++) {
			Student s = (Student) ls.get(i);
			Vector<Object> tbRow = new Vector<>();
			tbRow.add(s.getID());
			tbRow.add(s.getName());
			tbRow.add(s.getClassID());
			tbRow.add(s.getGender());
			tbRow.add(s.getBirth());
			tbRow.add(s.getAddress());
			
			row.add(tbRow);
		}
		Model.setDataVector(row, column);
		table.setModel(Model);
	}
	
/*
	public void getStudent_ByClassID_ByGender(String ClassID, String Gender) {
		Model.setRowCount(0);
		ArrayList<Student> ls = pst.getStudent_ByClassID_ByGender(ClassID, Gender);
		for (int i = 0; i < ls.size(); i++) {
			Student s = (Student) ls.get(i);
			Vector<Object> tbRow = new Vector<>();
			tbRow.add(s.getID());
			tbRow.add(s.getName());
			tbRow.add(s.getClassID());
			tbRow.add(s.getGender());
			tbRow.add(s.getBirth());
			tbRow.add(s.getAddress());
			
			row.add(tbRow);
		}
		Model.setDataVector(row, column);
		table.setModel(Model);
	}
	
	public void Checkbox_btn() {
		if(checkbox_Male.isSelected() == true) {
			getStudent_ByClassID_ByGender((String)combo_ClassID.getSelectedItem(), "Nam");
		}
		if(checkbox_Female.isSelected() == true) {
			getStudent_ByClassID_ByGender((String)combo_ClassID.getSelectedItem(), "Nữ");
		}
	}
*/
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Student frame = new GUI_Student();
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
	public GUI_Student() {
		setTitle("Student Management");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 550);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu Menu = new JMenu("");
		menuBar.add(Menu);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 191, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_Student = new JPanel();
		panel_Student.setBounds(10, 10, 399, 409);
		contentPane.add(panel_Student);
		panel_Student.setLayout(null);
		
		JLabel lbl_ID = new JLabel("Student ID");
		lbl_ID.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_ID.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_ID.setBounds(10, 10, 100, 30);
		panel_Student.add(lbl_ID);
		
		JLabel lbl_Name = new JLabel("Student Name");
		lbl_Name.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_Name.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_Name.setBounds(10, 48, 100, 30);
		panel_Student.add(lbl_Name);
		
		JLabel lbl_ClassID = new JLabel("ClassID");
		lbl_ClassID.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_ClassID.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_ClassID.setBounds(10, 86, 100, 30);
		panel_Student.add(lbl_ClassID);
		
		JLabel lbl_Gender = new JLabel("Gender");
		lbl_Gender.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_Gender.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_Gender.setBounds(10, 124, 100, 30);
		panel_Student.add(lbl_Gender);
		
		JLabel lbl_Birth = new JLabel("Date of Birth");
		lbl_Birth.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_Birth.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_Birth.setBounds(10, 162, 100, 30);
		panel_Student.add(lbl_Birth);
		
		JLabel lbl_Address = new JLabel("Address");
		lbl_Address.setHorizontalAlignment(SwingConstants.LEFT);
		lbl_Address.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_Address.setBounds(10, 200, 100, 30);
		panel_Student.add(lbl_Address);
		
		text_ID = new JTextField();
		text_ID.setFont(new Font("Tahoma", Font.PLAIN, 12));
		text_ID.setBounds(120, 10, 262, 30);
		panel_Student.add(text_ID);
		text_ID.setColumns(10);
		
		text_Name = new JTextField();
		text_Name.setFont(new Font("Tahoma", Font.PLAIN, 12));
		text_Name.setColumns(10);
		text_Name.setBounds(119, 50, 262, 30);
		panel_Student.add(text_Name);
		
		text_ClassID = new JTextField();
		text_ClassID.setFont(new Font("Tahoma", Font.PLAIN, 12));
		text_ClassID.setColumns(10);
		text_ClassID.setBounds(120, 86, 262, 30);
		panel_Student.add(text_ClassID);
		
		text_Gender = new JTextField();
		text_Gender.setFont(new Font("Tahoma", Font.PLAIN, 12));
		text_Gender.setColumns(10);
		text_Gender.setBounds(118, 124, 262, 30);
		panel_Student.add(text_Gender);
		
		text_Birth = new JTextField();
		text_Birth.setColumns(10);
		text_Birth.setFont(new Font("Tahoma", Font.PLAIN, 12));
		text_Birth.setBounds(120, 163, 262, 30);
		panel_Student.add(text_Birth);
		
		text_Address = new JTextField();
		text_Address.setFont(new Font("Tahoma", Font.PLAIN, 12));
		text_Address.setColumns(10);
		text_Address.setBounds(120, 200, 262, 201);
		panel_Student.add(text_Address);
		
		JPanel panel_Table = new JPanel();
		panel_Table.setBounds(419, 10, 659, 409);
		contentPane.add(panel_Table);
		panel_Table.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 641, 391);
		panel_Table.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.PLAIN, 12));
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i = table.getSelectedRow();
				TableModel model = table.getModel();
				text_ID.setText((String)model.getValueAt(i, 0));
				text_Name.setText((String)model.getValueAt(i, 1));
				text_ClassID.setText((String)model.getValueAt(i, 2));
				text_Gender.setText((String)model.getValueAt(i, 3));
				text_Birth.setText((String)model.getValueAt(i, 4));
				text_Address.setText((String)model.getValueAt(i, 5));
			}
		});
		scrollPane.setViewportView(table);
		
		JPanel panel_Btn = new JPanel();
		panel_Btn.setBounds(10, 427, 1068, 56);
		contentPane.add(panel_Btn);
		panel_Btn.setLayout(null);
		
		JButton btn_Add = new JButton("ADD NEW");
		btn_Add.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_Add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(text_ID.getText().equals("") || text_Name.getText().equals("") || text_ClassID.getText().equals("") || text_Gender.getText().equals("") || text_Birth.getText().equals("") || text_Address.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Please Fill Complete Information");
				}
				else {
					if(pst.insert_Student(text_ID.getText(), text_Name.getText(), text_ClassID.getText(), text_Gender.getText(), text_Birth.getText(),text_Address.getText())) {
						JOptionPane.showMessageDialog(btn_Add, "Add Succesfully", "Add", JOptionPane.INFORMATION_MESSAGE);
					}
					else {
						JOptionPane.showMessageDialog(btn_Add, "Add Fail", "Add", JOptionPane.INFORMATION_MESSAGE);
					}
					Data();
				}
			}
		});
		btn_Add.setBorderPainted(false);
		btn_Add.setBackground(new Color(0, 191, 255));
		btn_Add.setBounds(10, 10, 205, 36);
		panel_Btn.add(btn_Add);
		
		JButton btn_Update = new JButton("UPDATE");
		btn_Update.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_Update.setBackground(new Color(0, 191, 255));
		btn_Update.setBorderPainted(false);
		btn_Update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(pst.update_Student(text_ID.getText(), text_Name.getText(), text_ClassID.getText(), text_Gender.getText(), text_Birth.getText(), text_Address.getText())) {
					JOptionPane.showMessageDialog(btn_Update, "Update Succesfully", "Update", JOptionPane.INFORMATION_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(btn_Update, "Update Fail", "Update", JOptionPane.INFORMATION_MESSAGE);
				}
				Data();
			}
		});
		btn_Update.setBounds(223, 10, 205, 36);
		panel_Btn.add(btn_Update);
		
		JButton btn_Delete = new JButton("DELETE");
		btn_Delete.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_Delete.setBackground(new Color(0, 191, 255));
		btn_Delete.setBorderPainted(false);
		btn_Delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/*if(JOptionPane.showConfirmDialog(btn_Delete, "Do you want delete ?", "Question?", JOptionPane.YES_NO_CANCEL_OPTION) == JOptionPane.YES_NO_CANCEL_OPTION) { */
				if(pst.delete_Student(text_ID.getText())) {
					JOptionPane.showMessageDialog(btn_Delete, "Delete Succesfully", "Delete", JOptionPane.INFORMATION_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(btn_Delete, "Delete Fail", "Delete", JOptionPane.INFORMATION_MESSAGE);
				}
				Data();
			}
		});
		btn_Delete.setBounds(436, 10, 205, 36);
		panel_Btn.add(btn_Delete);
		
		JButton btn_Reset = new JButton("RESET");
		btn_Reset.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_Reset.setBackground(new Color(0, 191, 255));
		btn_Reset.setBorderPainted(false);
		btn_Reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btn_Reset, "Reset Succesfully", "Reset", JOptionPane.INFORMATION_MESSAGE);
				text_ID.setText(null);
				text_Name.setText(null);
				text_ClassID.setText(null);
				text_Gender.setText(null);
				text_Birth.setText(null);
				text_Address.setText(null);
			}
		});
		btn_Reset.setBounds(652, 10, 200, 36);
		panel_Btn.add(btn_Reset);
		
		JButton btn_Exit = new JButton("EXIT");
		btn_Exit.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_Exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(btn_Exit, "Confirm if you want to exit", "Exit ?", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btn_Exit.setBackground(new Color(0, 191, 255));
		btn_Exit.setBorderPainted(false);
		btn_Exit.setBounds(860, 10, 200, 36);
		panel_Btn.add(btn_Exit);
		
		column.add("Student ID");
		column.add("Name");
		column.add("ClassID");
		column.add("Gender");
		column.add("Date Of Birth");
		column.add("Address");
		getAllStudent();
	}
}
