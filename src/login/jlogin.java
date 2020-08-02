package login;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;

import java.awt.*;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class jlogin extends JFrame {
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField txtCancel;
	private JTextField txtLogin;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jlogin frame = new jlogin();
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
	public jlogin() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\project\\Practice\\java\\student database manager\\imgs\\businessman4.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(380, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 102, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(196, 179, 207, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		try {}catch(Exception e) {
			System.out.println(e);
		}
//		password p1=new password();
		passwordField = new JPasswordField();
		passwordField.setBounds(196, 244, 207, 30);
		contentPane.add(passwordField);
		
		txtLogin = new JTextField();
		txtLogin.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		txtLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String s=textField.getText();
				String value=passwordField.getText();
								
			     pass a=new pass();
	             desup x=new desup();
	             x.desUP();
	             boolean b= x.checkup(s, value);
			     
			
				if(b==true)
				{
					//to open the new page
					Mainpage second=new Mainpage();
					second.setVisible(true);
					setVisible(false);
				}
				else if(b==false)
				{
					JLabel l1=new JLabel("");
					l1.setForeground(Color.WHITE);
						l1.setFont(new Font("Tahoma", Font.BOLD, 18));
						l1.setHorizontalAlignment(SwingConstants.CENTER);
						l1.setBounds(135, 406, 350, 51);
						contentPane.add(l1);
						l1.setText("Username or Password is wrong");
				}
				else if(s.isEmpty())
				{
					JLabel l1=new JLabel(" ");
					l1.setForeground(Color.WHITE);
						l1.setFont(new Font("Tahoma", Font.BOLD, 18));
						l1.setHorizontalAlignment(SwingConstants.CENTER);
						l1.setBounds(135, 406, 350, 51);
						contentPane.add(l1);
						l1.setText("Please enter your email id");
				}
		
				else 
				{
		
					JLabel l1=new JLabel(" ");
		      		l1.setForeground(Color.WHITE);
					l1.setFont(new Font("Tahoma", Font.BOLD, 18));
					l1.setHorizontalAlignment(SwingConstants.CENTER);
					l1.setBounds(135, 406, 292, 51);
					contentPane.add(l1);
					l1.setText("Please enter your password");
				}
				
			}
		});
		txtLogin.setForeground(new Color(255, 255, 255));
		txtLogin.setBackground(new Color(51, 204, 153));
		txtLogin.setEditable(false);
		txtLogin.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtLogin.setHorizontalAlignment(SwingConstants.CENTER);
		txtLogin.setText("Login");
		txtLogin.setBounds(154, 324, 96, 30);
		contentPane.add(txtLogin);
		txtLogin.setColumns(10);
		
		txtCancel = new JTextField();
		txtCancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		txtCancel.setForeground(new Color(255, 255, 255));
		txtCancel.setBackground(new Color(255, 51, 51));
		txtCancel.setEditable(false);
		txtCancel.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtCancel.setHorizontalAlignment(SwingConstants.CENTER);
		txtCancel.setText("Close");
		txtCancel.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		txtCancel.setBounds(331, 324, 96, 30);
		contentPane.add(txtCancel);
		txtCancel.setColumns(10);
		
		JLabel lblPassword = new JLabel("");
		Image imgss=new ImageIcon(this.getClass().getResource("/lock.png")).getImage();
		lblPassword.setIcon(new ImageIcon(imgss));
		lblPassword.setBounds(154, 234, 74, 51);
		contentPane.add(lblPassword);
		
		JLabel lblUsername = new JLabel("");
		Image imgs=new ImageIcon(this.getClass().getResource("/businessman4.png")).getImage();
		lblUsername.setIcon(new ImageIcon(imgs));
		lblUsername.setBounds(154, 168, 74, 44);
		contentPane.add(lblUsername);
		
		JLabel lblLogin = new JLabel("");
		Image img=new ImageIcon(this.getClass().getResource("/businessman3.png")).getImage();
		lblLogin.setIcon(new ImageIcon(img));
		lblLogin.setBounds(240, 36, 128, 140);
		contentPane.add(lblLogin);
		
	
		setUndecorated(true);
	}
}
