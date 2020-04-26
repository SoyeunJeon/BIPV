package ia;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Signup extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField email;
	private JTextField password1;
	private JLabel Passward;
	private JTextField password2;
	private JLabel Passward2;
	private JButton btnRegister;
	private JButton btnCancel;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Signup frame = new Signup();
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
	public Signup() {
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 350);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(new Color(176, 196, 222)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Username = new JLabel("Username");
		Username.setFont(new Font("Trebuchet MS", Font.PLAIN, 15));
		Username.setBounds(302, 33, 74, 18);
		contentPane.add(Username);
		
		JLabel Email = new JLabel("Email");
		Email.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Email.setBounds(302, 94, 74, 18);
		contentPane.add(Email);
		
		Passward = new JLabel("Passward");
		Passward.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Passward.setBounds(302, 153, 74, 18);
		contentPane.add(Passward);
		
		Passward2 = new JLabel("Re-enter password");
		Passward2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Passward2.setBounds(302, 212, 132, 18);
		contentPane.add(Passward2);
		
		username = new JTextField();
		username.setBounds(302, 57, 251, 27);
		contentPane.add(username);
		username.setColumns(10);
		
		email = new JTextField();
		email.setColumns(10);
		email.setBounds(302, 116, 251, 27);
		contentPane.add(email);
		
		password1 = new JTextField();
		password1.setColumns(10);
		password1.setBounds(302, 175, 251, 27);
		contentPane.add(password1);
		
		password2 = new JTextField();
		password2.setColumns(10);
		password2.setBounds(302, 234, 251, 27);
		contentPane.add(password2);
		
		btnRegister = new JButton("Register");
		btnRegister.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// signup completed, back to login page
				Login login = new Login();
				login.main(null);
			}
		});
		btnRegister.setBackground(new Color(176, 196, 222));
		btnRegister.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnRegister.setBounds(435, 281, 118, 34);
		contentPane.add(btnRegister);
		
		btnCancel = new JButton("Cancel");
		btnCancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// signup cancelled, back to login page
				Login login = new Login();
				login.main(null);
			}
		});
		btnCancel.setBackground(new Color(176, 196, 222));
		btnCancel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCancel.setBounds(307, 281, 118, 34);
		contentPane.add(btnCancel);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Login.class.getResource("/logo.png")));
		lblNewLabel.setBounds(41, 39, 226, 268);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("X");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(560, 10, 30, 27);
		contentPane.add(lblNewLabel_1);
		
		setUndecorated(true);
	}
}
