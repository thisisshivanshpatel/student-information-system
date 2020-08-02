package login;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Toolkit;

public class Mainpage extends JFrame {

	private JPanel contentPane;
	private JTextField txtAddStudent;
	private JTextField txtSetPassword;
	private JTextField textField;
	private JTextField txtDeleteStudent;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mainpage frame = new Mainpage();
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
	public Mainpage() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\project\\Practice\\java\\student database manager\\imgs\\businessman4.png"));
		setTitle("STUDENT INFORMATION CENTER");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(210, 75, 929, 617);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 255, 127));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtAddStudent = new JTextField();
		txtAddStudent.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				StudentRecordM stm=new StudentRecordM();
		        stm.setVisible(true);
		        setVisible(false);
			}
		});
	
	
		txtAddStudent.setBackground(new Color(72, 61, 139));
		txtAddStudent.setForeground(new Color(255, 255, 255));
		txtAddStudent.setFont(new Font("Consolas", Font.BOLD, 18));
		txtAddStudent.setHorizontalAlignment(SwingConstants.CENTER);
		txtAddStudent.setText("ADD STUDENT");
		txtAddStudent.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		txtAddStudent.setEditable(false);
		txtAddStudent.setBounds(271, 88, 378, 49);
		contentPane.add(txtAddStudent);
		txtAddStudent.setColumns(10);
		
		JTextField txtViewStudentDetails = new JTextField();
		txtViewStudentDetails.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DetailsReader dr=new DetailsReader();
				dr.setVisible(true);
				setVisible(false);
			}
		});
	
		txtViewStudentDetails.setBackground(new Color(72, 61, 139));
		txtViewStudentDetails.setForeground(new Color(255, 255, 255));
		txtViewStudentDetails.setFont(new Font("Consolas", Font.BOLD, 18));
		txtViewStudentDetails.setHorizontalAlignment(SwingConstants.CENTER);
		txtViewStudentDetails.setText("VIEW STUDENT  DETAILS");
		txtViewStudentDetails.setEditable(false);
		txtViewStudentDetails.setBounds(271, 268, 378, 49);
		contentPane.add(txtViewStudentDetails);
		txtViewStudentDetails.setColumns(10);
		
		txtSetPassword = new JTextField();
		txtSetPassword.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				username_password up=new username_password();
				up.setVisible(true);
				setVisible(false);
			}
		});
		txtSetPassword.setText("SET USERNAME AND PASSWORD");
		txtSetPassword.setHorizontalAlignment(SwingConstants.CENTER);
		txtSetPassword.setForeground(Color.WHITE);
		txtSetPassword.setFont(new Font("Consolas", Font.BOLD, 18));
		txtSetPassword.setEditable(false);
		txtSetPassword.setColumns(10);
		txtSetPassword.setBackground(new Color(72, 61, 139));
		txtSetPassword.setBounds(271, 354, 378, 49);
		contentPane.add(txtSetPassword);
		
		textField = new JTextField();
		textField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		textField.setText("Close");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setForeground(Color.WHITE);
		textField.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		textField.setBackground(new Color(255, 51, 51));
		textField.setBounds(408, 497, 96, 30);
		contentPane.add(textField);
		
		txtDeleteStudent = new JTextField();
		txtDeleteStudent.setText("DELETE STUDENT");
		txtDeleteStudent.setHorizontalAlignment(SwingConstants.CENTER);
		txtDeleteStudent.setForeground(Color.WHITE);
		txtDeleteStudent.setFont(new Font("Consolas", Font.BOLD, 18));
		txtDeleteStudent.setEditable(false);
		txtDeleteStudent.setColumns(10);
		txtDeleteStudent.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		txtDeleteStudent.setBackground(new Color(72, 61, 139));
		txtDeleteStudent.setBounds(271, 177, 378, 49);
		contentPane.add(txtDeleteStudent);
		setUndecorated(true);
	}
}
