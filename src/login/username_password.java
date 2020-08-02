package login;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class username_password extends JFrame {

	private JPanel contentPane;
	private JPasswordField pass;
	private JTextField user;
	private JTextField txtSet;
	private JTextField textField_2;
	private JTextField txtBack;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					username_password frame = new username_password();
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
	public username_password() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\project\\Practice\\java\\student database manager\\imgs\\businessman4.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(230, 100, 840, 499);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSetUsernameAnd = new JLabel("Set Username and Password");
		lblSetUsernameAnd.setForeground(Color.WHITE);
		lblSetUsernameAnd.setFont(new Font("Consolas", Font.BOLD, 26));
		lblSetUsernameAnd.setBounds(210, 65, 386, 34);
		contentPane.add(lblSetUsernameAnd);
		
		JLabel lblUsername = new JLabel("");
		Image imgs=new ImageIcon(this.getClass().getResource("/businessman4.png")).getImage();
		lblUsername.setIcon(new ImageIcon(imgs));
		lblUsername.setBounds(249, 164, 74, 44);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("");
		Image imgss=new ImageIcon(this.getClass().getResource("/lock.png")).getImage();
		lblPassword.setIcon(new ImageIcon(imgss));
		lblPassword.setBounds(249, 230, 74, 51);
		contentPane.add(lblPassword);
		
		pass = new JPasswordField();
		pass.setBounds(291, 240, 207, 30);
		contentPane.add(pass);
		
		user = new JTextField();
		user.setColumns(10);
		user.setBounds(291, 175, 207, 30);
		contentPane.add(user);
		
		txtSet = new JTextField();
		txtSet.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				up s=new up();
				
				String u=user.getText();
				String p=pass.getText();
				
				if(u.isEmpty()==true || p.isEmpty()==true)
        		{
				//JOptionPane.showMessageDialog(this,"Username and Password must be filled");
					nullup n=new nullup();
					n.setVisible(true);
				}
				else {
				s.setup(u, p);
				userpass n=new userpass();
				n.setVisible(true);
			    setVisible(false);
			}
			}
		});
		txtSet.setText("Set");
		txtSet.setHorizontalAlignment(SwingConstants.CENTER);
		txtSet.setForeground(Color.WHITE);
		txtSet.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtSet.setEditable(false);
		txtSet.setColumns(10);
		txtSet.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		txtSet.setBackground(new Color(51, 204, 153));
		txtSet.setBounds(249, 320, 96, 30);
		contentPane.add(txtSet);
		
		textField_2 = new JTextField();
		textField_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		textField_2.setText("Close");
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setForeground(Color.WHITE);
		textField_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		textField_2.setBackground(new Color(255, 51, 51));
		textField_2.setBounds(426, 320, 96, 30);
		contentPane.add(textField_2);
		
		txtBack = new JTextField();
		txtBack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Mainpage p=new Mainpage();
				p.setVisible(true);
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
		txtBack.setBackground(new Color(0, 191, 255));
		txtBack.setBounds(340, 389, 96, 30);
		contentPane.add(txtBack);
	    setUndecorated(true);
	}
}
