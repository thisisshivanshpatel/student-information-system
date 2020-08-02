package login;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.util.Formatter;

import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import java.awt.Toolkit;

public class StudentRecordM extends JFrame {

	private JPanel contentPane;
	private JTextField jtxtStudentID;
	private JTextField jtxtFirstName;
	private JTextField jtxtLastName;
	private JRadioButton male;
	private JRadioButton female;

	/**
	 * Launch the application.
	 */
	static public void writefile(String a,String b,String c,String d,String e,String f1,String g)
    {
try{    
    FileWriter fw=new FileWriter("Sdatabase.txt",true);  
    Formatter f=new Formatter(fw);
    //f.format("%s %s %s %s %s %s %s", "Student Id ","First Name ","Last Name ","Course ","DOB ","Gender ","Address \r\n");
    f.format("%s %s %s %s %s %s %s",a,b,c,d,e,f1,g); 
    f.format("%s","\r\n\n");
    f.close();         	
    
}
catch(Exception s)
{
System.out.println(e);
} 
   }
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentRecordM frame = new StudentRecordM();
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
	public StudentRecordM() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\project\\Practice\\java\\student database manager\\imgs\\businessman4.png"));
		setTitle("STUDENT INFORMATION SYSTEM");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1182, 584);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(51, 153, 255), 12));
		panel.setBackground(SystemColor.textHighlight);
		panel.setBounds(10, 11, 719, 444);
		contentPane.add(panel);
		
		jtxtStudentID = new JTextField();
		jtxtStudentID.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		jtxtStudentID.setColumns(10);
		jtxtStudentID.setBounds(195, 33, 151, 26);
		panel.add(jtxtStudentID);
		
		JLabel label = new JLabel("Student ID:");
		label.setFont(new Font("Consolas", Font.BOLD, 18));
		label.setBounds(52, 37, 116, 25);
		panel.add(label);
		
		jtxtFirstName = new JTextField();
		jtxtFirstName.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		jtxtFirstName.setColumns(10);
		jtxtFirstName.setBounds(195, 66, 151, 26);
		panel.add(jtxtFirstName);
		
		JLabel label_1 = new JLabel("First Name:");
		label_1.setFont(new Font("Consolas", Font.BOLD, 18));
		label_1.setBounds(52, 70, 116, 25);
		panel.add(label_1);
		
		jtxtLastName = new JTextField();
		jtxtLastName.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		jtxtLastName.setColumns(10);
		jtxtLastName.setBounds(195, 101, 151, 26);
		panel.add(jtxtLastName);
		
		JLabel label_2 = new JLabel("Last Name:");
		label_2.setFont(new Font("Consolas", Font.BOLD, 18));
		label_2.setBounds(52, 101, 116, 25);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("Course:");
		label_3.setFont(new Font("Consolas", Font.BOLD, 18));
		label_3.setBounds(52, 139, 133, 25);
		panel.add(label_3);
		
		JLabel label_4 = new JLabel("Gender:");
		label_4.setFont(new Font("Consolas", Font.BOLD, 18));
		label_4.setBounds(52, 193, 116, 25);
		panel.add(label_4);
		
		JLabel label_5 = new JLabel("DOB:");
		label_5.setFont(new Font("Consolas", Font.BOLD, 18));
		label_5.setBounds(52, 225, 116, 25);
		panel.add(label_5);
		
		JLabel label_6 = new JLabel("Address:");
		label_6.setFont(new Font("Consolas", Font.BOLD, 18));
		label_6.setBounds(52, 272, 116, 25);
		panel.add(label_6);
		
		JTextArea jtxtAddress = new JTextArea();
		jtxtAddress.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		jtxtAddress.setBounds(195, 272, 238, 118);
		panel.add(jtxtAddress);
		
		male = new JRadioButton("Male");
		male.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(male.isSelected())
				{		
					female.setSelected(false);
				}
			}
		});
		male.setFont(new Font("Consolas", Font.BOLD, 18));
		male.setBackground(SystemColor.textHighlight);
		male.setBounds(193, 193, 65, 23);
		panel.add(male);
		
		female = new JRadioButton("Female");
		female.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(female.isSelected())
				{		
					male.setSelected(false);
				}
			}
		});
		female.setFont(new Font("Consolas", Font.BOLD, 18));
		female.setBackground(SystemColor.textHighlight);
		female.setBounds(270, 193, 90, 23);
		panel.add(female);
		
		JComboBox course1 = new JComboBox();
		course1.setBounds(195, 138, 151, 22);
		panel.add(course1);
		course1.addItem("None");
		course1.addItem("BCA");
		course1.addItem("MCA");
		course1.addItem("BTECH");
		course1.addItem("MTECH");
		course1.setSelectedItem("COURSES");
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(195, 225, 151, 25);
		panel.add(dateChooser);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new LineBorder(new Color(51, 153, 255), 12));
		panel_1.setBackground(SystemColor.textHighlight);
		panel_1.setBounds(747, 11, 409, 444);
		contentPane.add(panel_1);
		
		JTextArea jtxtTranscript = new JTextArea();
		jtxtTranscript.setEditable(false);
		jtxtTranscript.setFont(new Font("Times New Roman", Font.PLAIN, 17));
		jtxtTranscript.setBounds(20, 25, 368, 397);
		panel_1.add(jtxtTranscript);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(51, 153, 255), 12));
		panel_2.setBackground(SystemColor.textHighlight);
		panel_2.setBounds(12, 466, 1144, 68);
		contentPane.add(panel_2);
		
		JButton button = new JButton("Confirm");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selection="none";
				if(male.isSelected())
				{
					selection="Male";
				}
				if(female.isSelected())
				{
					selection="Female";
				}
				java.text.SimpleDateFormat fmt = new java.text.SimpleDateFormat("dd-MM-yyy");
				String formattedDate1 = fmt.format(dateChooser.getDate());
				String FirstName=jtxtFirstName.getText(),
						LastName=jtxtLastName.getText(),
						DOB=formattedDate1 ,
						Address=jtxtAddress.getText(),
						Gender=selection,
						c1=course1.getSelectedItem().toString(),
						studentid=jtxtStudentID.getText();

		writefile(studentid,FirstName,LastName,c1,DOB,Gender,Address);		
				jtxtTranscript.setText("");
				jtxtTranscript.append("\tStudent Infomation System\n"
						             +"==================================="
						             +"\nStudent Id  \t :\t"+jtxtStudentID.getText()
						             +"\nFirst Name  \t :\t"+jtxtFirstName.getText()
						             +"\nLast Name   \t :\t"+jtxtLastName.getText()
						             +"\nGender      \t :\t"+selection
						             +"\nDate of birth \t :\t"+formattedDate1         	             
						             +"\nCourse      \t :\t"+course1.getSelectedItem().toString()
						             +"\nAddress     \t :\t"+jtxtAddress.getText()
			             
						);

			}
			
		});
		button.setFont(new Font("Consolas", Font.BOLD, 18));
		button.setBounds(46, 16, 135, 34);
		panel_2.add(button);
		
		JButton button_1 = new JButton("Print");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					jtxtTranscript.print();
				} catch (java.awt.print.PrinterException ev) {
			System.err.format("No Printer found", ev.getMessage());
				}
			}
		});
			
	
		button_1.setFont(new Font("Consolas", Font.BOLD, 18));
		button_1.setBounds(397, 16, 135, 34);
		panel_2.add(button_1);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField temp=null;
				for(Component c:panel.getComponents()) {
					if(c.getClass().toString().contains("javax.swing.JTextField")) {
						temp=(JTextField)c;
						temp.setText(null);
					}
				}
			jtxtTranscript.setText(null);
			jtxtAddress.setText(null);
			}
			
		});
		btnReset.setFont(new Font("Consolas", Font.BOLD, 18));
		btnReset.setBounds(629, 16, 135, 34);
		panel_2.add(btnReset);
		
		JButton button_3 = new JButton("Exit");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	/*
				if(JOptionPane.showConfirmDialog(this, "Confirm if you want to exit", "Student information System",
						JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION ) {
					System.exit(0);
				}
	*/                  dispose();		
			}
		});
		button_3.setFont(new Font("Consolas", Font.BOLD, 18));
		button_3.setBounds(873, 16, 135, 34);
		panel_2.add(button_3);
		
		JButton button_4 = new JButton("Back");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mainpage next=new Mainpage();
				next.setVisible(true);
				setVisible(false);
			}
		});
		
		button_4.setFont(new Font("Consolas", Font.BOLD, 18));
		button_4.setBounds(227, 16, 135, 34);
		panel_2.add(button_4);
	}
}
