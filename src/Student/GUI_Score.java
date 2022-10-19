package Student;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GUI_Score extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField text_Liter;
	private JTextField text_Math;
	private JTextField text_Eng;
	private JTextField text_Phy;
	private JTextField text_Chem;
	private JTextField text_Bio;
	private JTextField text_His;
	private JTextField text_Geo;
	private JTextField text_Ethic;
	private JTextField text_Info;
	private JTextField text_ID;
	private JTextField text_Name;
	Process_Score psc = new Process_Score();
	
	DefaultTableModel Model = new DefaultTableModel();
	Vector<String> column = new Vector<String>();
	Vector<Vector<Object>> row = new Vector<>();
	
	public void getAllScore() {
		ArrayList<Student> ls = psc.getListScore();
		for(int i = 0; i < ls.size(); i++) {
			Student s = (Student) ls.get(i);
			Vector<Object> tbRow = new Vector<>();
			tbRow.add(s.getID());
			tbRow.add(s.getName());
			tbRow.add(s.getLiterature());
			tbRow.add(s.getMath());
			tbRow.add(s.getEnglish());
			tbRow.add(s.getPhysical());
			tbRow.add(s.getChemical());
			tbRow.add(s.getBiology());
			tbRow.add(s.getHistory());
			tbRow.add(s.getGeography());
			tbRow.add(s.getEthic());
			tbRow.add(s.getInformatic());

			row.add(tbRow);
		}
		Model.setDataVector(row, column);
		table.setModel(Model);
	}
	
	public void Data() {
		ArrayList<Student> ls = psc.getListScore();
		Model.setRowCount(0);
		for(int i = 0; i < ls.size(); i++) {
			Student s = (Student) ls.get(i);
			Vector<Object> tbRow = new Vector<>();
			tbRow.add(s.getID());
			tbRow.add(s.getName());
			tbRow.add(s.getLiterature());
			tbRow.add(s.getMath());
			tbRow.add(s.getEnglish());
			tbRow.add(s.getPhysical());
			tbRow.add(s.getChemical());
			tbRow.add(s.getBiology());
			tbRow.add(s.getHistory());
			tbRow.add(s.getGeography());
			tbRow.add(s.getEthic());
			tbRow.add(s.getInformatic());
			
			row.add(tbRow);
		}
		Model.setDataVector(row, column);
		table.setModel(Model);
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Score frame = new GUI_Score();
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
	public GUI_Score() {
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
		panel_Student.setLayout(null);
		panel_Student.setBounds(8, 8, 399, 411);
		contentPane.add(panel_Student);
				
		JLabel lbl_ID = new JLabel("Student ID");
		lbl_ID.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_ID.setBounds(8, 15, 95, 25);
		panel_Student.add(lbl_ID);
		
		text_ID = new JTextField();
		text_ID.setFont(new Font("Tahoma", Font.PLAIN, 12));
		text_ID.setColumns(10);
		text_ID.setBounds(111, 16, 280, 25);
		panel_Student.add(text_ID);
		
		JLabel lbl_Name = new JLabel("Name");
		lbl_Name.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_Name.setBounds(8, 48, 95, 25);
		panel_Student.add(lbl_Name);
		
		text_Name = new JTextField();
		text_Name.setFont(new Font("Tahoma", Font.PLAIN, 12));
		text_Name.setColumns(10);
		text_Name.setBounds(111, 49, 280, 25);
		panel_Student.add(text_Name);

		JLabel lbl_Liter = new JLabel("Literature");
		lbl_Liter.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_Liter.setBounds(8, 81, 95, 25);
		panel_Student.add(lbl_Liter);

		JLabel lbl_Math = new JLabel("Math");
		lbl_Math.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_Math.setBounds(8, 114, 95, 25);
		panel_Student.add(lbl_Math);

		JLabel lbl_Eng = new JLabel("English");
		lbl_Eng.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_Eng.setBounds(8, 147, 95, 25);
		panel_Student.add(lbl_Eng);

		JLabel lbl_Phy = new JLabel("Physical");
		lbl_Phy.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_Phy.setBounds(8, 180, 95, 25);
		panel_Student.add(lbl_Phy);

		JLabel lbl_Chem = new JLabel("Chemical");
		lbl_Chem.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_Chem.setBounds(8, 213, 95, 25);
		panel_Student.add(lbl_Chem);

		JLabel lbl_Bio = new JLabel("Biology");
		lbl_Bio.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_Bio.setBounds(8, 246, 95, 25);
		panel_Student.add(lbl_Bio);

		JLabel lbl_His = new JLabel("History");
		lbl_His.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_His.setBounds(8, 279, 95, 25);
		panel_Student.add(lbl_His);

		JLabel lbl_Geo = new JLabel("Geography");
		lbl_Geo.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_Geo.setBounds(8, 312, 95, 25);
		panel_Student.add(lbl_Geo);

		JLabel lbl_Ethic = new JLabel("Ethic");
		lbl_Ethic.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_Ethic.setBounds(8, 345, 95, 25);
		panel_Student.add(lbl_Ethic);

		JLabel lbl_Infor = new JLabel("Informatic");
		lbl_Infor.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lbl_Infor.setBounds(8, 378, 95, 25);
		panel_Student.add(lbl_Infor);

		text_Liter = new JTextField();
		text_Liter.setFont(new Font("Tahoma", Font.PLAIN, 12));
		text_Liter.setColumns(10);
		text_Liter.setBounds(111, 82, 280, 25);
		panel_Student.add(text_Liter);

		text_Math = new JTextField();
		text_Math.setFont(new Font("Tahoma", Font.PLAIN, 12));
		text_Math.setColumns(10);
		text_Math.setBounds(111, 115, 280, 25);
		panel_Student.add(text_Math);

		text_Eng = new JTextField();
		text_Eng.setFont(new Font("Tahoma", Font.PLAIN, 12));
		text_Eng.setColumns(10);
		text_Eng.setBounds(111, 148, 280, 25);
		panel_Student.add(text_Eng);

		text_Phy = new JTextField();
		text_Phy.setFont(new Font("Tahoma", Font.PLAIN, 12));
		text_Phy.setColumns(10);
		text_Phy.setBounds(111, 181, 280, 25);
		panel_Student.add(text_Phy);

		text_Chem = new JTextField();
		text_Chem.setFont(new Font("Tahoma", Font.PLAIN, 12));
		text_Chem.setColumns(10);
		text_Chem.setBounds(111, 214, 280, 25);
		panel_Student.add(text_Chem);

		text_Bio = new JTextField();
		text_Bio.setFont(new Font("Tahoma", Font.PLAIN, 12));
		text_Bio.setColumns(10);
		text_Bio.setBounds(111, 247, 280, 25);
		panel_Student.add(text_Bio);

		text_His = new JTextField();
		text_His.setFont(new Font("Tahoma", Font.PLAIN, 12));
		text_His.setColumns(10);
		text_His.setBounds(111, 280, 280, 25);
		panel_Student.add(text_His);

		text_Geo = new JTextField();
		text_Geo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		text_Geo.setColumns(10);
		text_Geo.setBounds(111, 313, 280, 25);
		panel_Student.add(text_Geo);

		text_Ethic = new JTextField();
		text_Ethic.setFont(new Font("Tahoma", Font.PLAIN, 12));
		text_Ethic.setColumns(10);
		text_Ethic.setBounds(111, 346, 280, 25);
		panel_Student.add(text_Ethic);

		text_Info = new JTextField();
		text_Info.setFont(new Font("Tahoma", Font.PLAIN, 12));
		text_Info.setColumns(10);
		text_Info.setBounds(111, 379, 280, 25);
		panel_Student.add(text_Info);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(419, 8, 659, 411);
		contentPane.add(panel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 641, 393);
		panel.add(scrollPane);

		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i = table.getSelectedRow();
				TableModel model = table.getModel();
				text_ID.setText((String)model.getValueAt(i, 0));
				text_Name.setText((String)model.getValueAt(i, 1));
				text_Liter.setText((String)model.getValueAt(i, 2));
				text_Math.setText((String)model.getValueAt(i, 3));
				text_Eng.setText((String)model.getValueAt(i, 4));
				text_Phy.setText((String)model.getValueAt(i, 5));
				text_Chem.setText((String)model.getValueAt(i, 6));
				text_Bio.setText((String)model.getValueAt(i, 7));
				text_His.setText((String)model.getValueAt(i, 8));
				text_Geo.setText((String)model.getValueAt(i, 9));
				text_Ethic.setText((String)model.getValueAt(i, 10));
				text_Info.setText((String)model.getValueAt(i, 11));
			}
		});
		scrollPane.setViewportView(table);

		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBounds(8, 427, 1068, 56);
		contentPane.add(panel_1);

		JButton btn_Add = new JButton("ADD NEW");
		btn_Add.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_Add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(text_ID.getText().equals("") || text_Name.getText().equals("") || text_Liter.getText().equals("") || text_Math.getText().equals("") || text_Eng.getText().equals("") || text_Phy.getText().equals("") || text_Chem.getText().equals("") || text_Bio.getText().equals("") || text_His.getText().equals("") || text_Geo.getText().equals("") || text_Ethic.getText().equals("") || text_Info.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Please Fill Complete Information");
				}
				else {
					if(psc.insert_Score(text_ID.getText(), text_Name.getText(), Double.parseDouble(text_Liter.getText()), Double.parseDouble((String)text_Math.getText()), Double.parseDouble((String)text_Eng.getText()), Double.parseDouble((String)text_Phy.getText()), Double.parseDouble((String)text_Chem.getText()), Double.parseDouble((String)text_Bio.getText()), Double.parseDouble((String)text_His.getText()), Double.parseDouble((String)text_Geo.getText()), Double.parseDouble((String)text_Ethic.getText()), Double.parseDouble((String)text_Info.getText()))) {
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
		panel_1.add(btn_Add);

		JButton btn_Update = new JButton("UPDATE");
		btn_Update.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_Update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(psc.update_Score(text_ID.getText(), text_Name.getText(), Double.parseDouble((String)text_Liter.getText()), Double.parseDouble((String)text_Math.getText()), Double.parseDouble((String)text_Eng.getText()), Double.parseDouble((String)text_Phy.getText()), Double.parseDouble((String)text_Chem.getText()), Double.parseDouble((String)text_Bio.getText()), Double.parseDouble((String)text_His.getText()), Double.parseDouble((String)text_Geo.getText()), Double.parseDouble((String)text_Ethic.getText()), Double.parseDouble((String)text_Info.getText()))) {
					JOptionPane.showMessageDialog(btn_Update, "Update Succesfully", "Update", JOptionPane.INFORMATION_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(btn_Update, "Update Fail", "Update", JOptionPane.INFORMATION_MESSAGE);
				}
				Data();
			}
		});
		btn_Update.setBorderPainted(false);
		btn_Update.setBackground(new Color(0, 191, 255));
		btn_Update.setBounds(223, 11, 205, 36);
		panel_1.add(btn_Update);

		JButton btn_Delete = new JButton("DELETE");
		btn_Delete.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_Delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(psc.delete_Score(text_ID.getText())) {
					JOptionPane.showMessageDialog(btn_Delete, "Delete Succesfully", "Delete", JOptionPane.INFORMATION_MESSAGE);
				}
				else {
					JOptionPane.showMessageDialog(btn_Delete, "Delete Fail", "Delete", JOptionPane.INFORMATION_MESSAGE);
				}
			Data();
			}
		});
		btn_Delete.setBorderPainted(false);
		btn_Delete.setBackground(new Color(0, 191, 255));
		btn_Delete.setBounds(436, 10, 200, 36);
		panel_1.add(btn_Delete);

		JButton btn_Reset = new JButton("RESET");
		btn_Reset.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_Reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btn_Reset, "Reset Succesfully", "Reset", JOptionPane.INFORMATION_MESSAGE);
				text_ID.setText(null);
				text_Liter.setText(null);
				text_Math.setText(null);
				text_Eng.setText(null);
				text_Phy.setText(null);
				text_Chem.setText(null);
				text_Bio.setText(null);
				text_His.setText(null);
				text_Geo.setText(null);
				text_Ethic.setText(null);
				text_Info.setText(null);
			}
		});
		btn_Reset.setBorderPainted(false);
		btn_Reset.setBackground(new Color(0, 191, 255));
		btn_Reset.setBounds(644, 10, 205, 36);
		panel_1.add(btn_Reset);

		JButton btn_Exit = new JButton("EXIT");
		btn_Exit.setFont(new Font("Tahoma", Font.BOLD, 12));
		btn_Exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(btn_Exit, "Confirm if you want to exit", "Exit ?", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btn_Exit.setBorderPainted(false);
		btn_Exit.setBackground(new Color(0, 191, 255));
		btn_Exit.setBounds(857, 11, 203, 36);
		panel_1.add(btn_Exit);
		
		column.add("Student ID");
		column.add("Name");
		column.add("Literature");
		column.add("Math");
		column.add("English");
		column.add("Physical");
		column.add("Chemical");
		column.add("Biology");
		column.add("History");
		column.add("Geography");
		column.add("Ethic");
		column.add("Informatic");
		getAllScore();
	}
}
