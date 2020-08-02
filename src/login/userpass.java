package login;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class userpass extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtOk;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			userpass dialog = new userpass();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public userpass() {
		setTitle("STUDENT INFORMATION CENTER");
		setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\project\\Practice\\java\\student database manager\\imgs\\businessman4.png"));
		setBounds(450, 180, 403, 216);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(204, 153, 0));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblUsernameAndPassword = new JLabel("username and password setted sucessfully");
	//	lblUsernameAndPassword.setBackground(Color.WHITE);
		lblUsernameAndPassword.setForeground(Color.WHITE);
		lblUsernameAndPassword.setFont(new Font("Dialog", Font.BOLD, 16));
		lblUsernameAndPassword.setBounds(33, 24, 344, 47);
		contentPanel.add(lblUsernameAndPassword);
		
		txtOk = new JTextField();
		txtOk.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Mainpage p=new Mainpage();
				p.setVisible(true);
				setVisible(false);
			}
		});
		txtOk.setText("OK");
		txtOk.setHorizontalAlignment(SwingConstants.CENTER);
		txtOk.setForeground(Color.WHITE);
		txtOk.setFont(new Font("Tahoma", Font.BOLD, 15));
		txtOk.setEditable(false);
		txtOk.setColumns(10);
		txtOk.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		txtOk.setBackground(new Color(0, 204, 102));
		txtOk.setBounds(137, 93, 96, 30);
		contentPanel.add(txtOk);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(204, 153, 0));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
		}
	}
}
