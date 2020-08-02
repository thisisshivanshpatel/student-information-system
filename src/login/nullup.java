package login;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class nullup extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			nullup dialog = new nullup();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public nullup() {
		setTitle("STUDENT INFORMATION CENTER");
		setIconImage(Toolkit.getDefaultToolkit().getImage("E:\\project\\Practice\\java\\student database manager\\imgs\\businessman4.png"));
		setBounds(450, 180, 403, 216);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(218, 165, 32));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JLabel lblUsernameAndPassword_1 = new JLabel("Username and Password should not be null");
		lblUsernameAndPassword_1.setForeground(Color.WHITE);
		lblUsernameAndPassword_1.setFont(new Font("Dialog", Font.BOLD, 16));
		lblUsernameAndPassword_1.setBounds(33, 35, 344, 47);
		contentPanel.add(lblUsernameAndPassword_1);
		
		textField = new JTextField();
		textField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		textField.setText("OK");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setForeground(Color.WHITE);
		textField.setFont(new Font("Tahoma", Font.BOLD, 15));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		textField.setBackground(new Color(0, 204, 102));
		textField.setBounds(140, 105, 96, 30);
		contentPanel.add(textField);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(218, 165, 32));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
		}
	}

}
