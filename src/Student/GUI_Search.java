package Student;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class GUI_Search extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField text_Search;
	
	DefaultTableModel  Model =  new DefaultTableModel();
	Vector<String> column = new Vector<String>();
	Vector<Vector<Object>> row = new Vector<>();
	Process_Search ps = new Process_Search();
	
	public void getEntireList() {
		ArrayList<Student> ls =  ps.getEntireList();
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
			tbRow.add(s.GPA());
			tbRow.add(s.Rank());
	 
			row.add(tbRow);
		}
		Model.setDataVector(row, column);
		table.setModel(Model);
	}
	
	public void getStudent_ByID(String ID) {
		Model.setRowCount(0);
		Student ls =  ps.getStudent_ByID(ID);
		//for(int i=0;i<ls.size();i++) {
			//Student s = (Student) ls.get(i);
			Vector<Object> tbRow = new Vector<>();
			tbRow.add(ls.getID());
			tbRow.add(ls.getName());
			tbRow.add(ls.getLiterature());
			tbRow.add(ls.getMath());
			tbRow.add(ls.getEnglish());
			tbRow.add(ls.getPhysical());
			tbRow.add(ls.getChemical());
			tbRow.add(ls.getBiology());
			tbRow.add(ls.getHistory());
			tbRow.add(ls.getGeography());
			tbRow.add(ls.GPA());
			tbRow.add(ls.Rank());
	 
			row.add(tbRow);
		
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
					GUI_Search frame = new GUI_Search();
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
	public GUI_Search() {
		setTitle("Search Page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 510);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu Menu = new JMenu("");
		menuBar.add(Menu);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 191, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 46, 1066, 397);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JLabel lbl_Search = new JLabel("Student ID :");
		lbl_Search.setBounds(10, 8, 94, 30);
		lbl_Search.setFont(new Font("Times New Roman", Font.BOLD, 16));
		contentPane.add(lbl_Search);
		
		text_Search = new JTextField();
		text_Search.setBounds(112, 8, 626, 30);
		contentPane.add(text_Search);
		text_Search.setColumns(10);
		
		JButton btn_Search = new JButton("Search");
		btn_Search.setBounds(750, 8, 157, 30);
		btn_Search.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				getStudent_ByID(text_Search.getText());
			}
		});
		btn_Search.setFont(new Font("Times New Roman", Font.BOLD, 16));
		contentPane.add(btn_Search);
		
		JButton btn_Exit = new JButton("Exit");
		btn_Exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(JOptionPane.showConfirmDialog(btn_Exit, "Confirm if you want to exit", "Exit ?", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					GUI_Dashboard frame = new GUI_Dashboard();
					frame.setVisible(true);
					dispose();
				}
			}
		});
		btn_Exit.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btn_Exit.setBounds(919, 8, 157, 30);
		contentPane.add(btn_Exit);
		
		column.add("ID");
		column.add("Name");
		column.add("Literature");
		column.add("Math");
		column.add("English");
		column.add("Physical");
		column.add("Chemical");
		column.add("Biology");
		column.add("History");
		column.add("Geography");
		column.add("GPA");
		column.add("Rank");
		getEntireList();
	}
}
