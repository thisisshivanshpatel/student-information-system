package login;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.FileReader;

import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DetailsReader extends JFrame {

	private JPanel contentPane;
	private JTextField txtBack;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DetailsReader frame = new DetailsReader();
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
	public DetailsReader() {
		setTitle("STUDENT INFORMATION CENTER");
		setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\project\\Practice\\java\\student database manager\\imgs\\businessman4.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(210, 75, 929, 617);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 102, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setFont(new Font("Consolas", Font.BOLD, 20));
		textArea.setBounds(29, 85, 883, 570);
		contentPane.add(textArea);
		
		JLabel lblStudentId = new JLabel("Student Id");
		lblStudentId.setForeground(new Color(255, 255, 255));
		lblStudentId.setFont(new Font("Bookman Old Style", Font.BOLD, 18));
		lblStudentId.setBounds(29, 49, 105, 14);
		contentPane.add(lblStudentId);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setForeground(Color.WHITE);
		lblFirstName.setFont(new Font("Bookman Old Style", Font.BOLD, 18));
		lblFirstName.setBounds(158, 48, 105, 16);
		contentPane.add(lblFirstName);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setForeground(Color.WHITE);
		lblLastName.setFont(new Font("Bookman Old Style", Font.BOLD, 18));
		lblLastName.setBounds(294, 48, 105, 16);
		contentPane.add(lblLastName);
		
		JLabel lblCourse = new JLabel("Course");
		lblCourse.setForeground(Color.WHITE);
		lblCourse.setFont(new Font("Bookman Old Style", Font.BOLD, 18));
		lblCourse.setBounds(412, 51, 105, 14);
		contentPane.add(lblCourse);
		
		JLabel lblDob = new JLabel("DOB");
		lblDob.setForeground(Color.WHITE);
		lblDob.setFont(new Font("Bookman Old Style", Font.BOLD, 18));
		lblDob.setBounds(495, 51, 55, 14);
		contentPane.add(lblDob);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setForeground(Color.WHITE);
		lblGender.setFont(new Font("Bookman Old Style", Font.BOLD, 18));
		lblGender.setBounds(560, 51, 105, 14);
		contentPane.add(lblGender);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setForeground(Color.WHITE);
		lblAddress.setFont(new Font("Bookman Old Style", Font.BOLD, 18));
		lblAddress.setBounds(655, 51, 105, 14);
		contentPane.add(lblAddress);
		
		txtBack = new JTextField();
		txtBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Mainpage mp=new Mainpage();
				mp.setVisible(true);
			     setVisible(false);
			}
		});
		txtBack.setText("Back");
		txtBack.setHorizontalAlignment(SwingConstants.CENTER);
		txtBack.setForeground(Color.WHITE);
		txtBack.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtBack.setEditable(false);
		txtBack.setColumns(10);
		txtBack.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		txtBack.setBackground(new Color(255, 51, 51));
		txtBack.setBounds(823, 11, 96, 30);
		contentPane.add(txtBack);
		
		
		try {
			FileReader reader=new FileReader("Sdatabase.txt");
			BufferedReader br=new BufferedReader(reader);
			textArea.read(br, null);
			br.close();
		}catch(Exception e)
		{
			JOptionPane.showMessageDialog(null,e);
		}
		setUndecorated(true);
	}
}
