package Interface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.UIManager;

public class Cnx extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JLabel lblNewLabel_1;
	private JButton btnResert;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cnx frame = new Cnx();
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
	public Cnx() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 448, 258);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(29, 68, 83, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPassword.setBounds(29, 112, 71, 14);
		contentPane.add(lblPassword);
		
		textField = new JTextField();
		textField.setBounds(122, 69, 165, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(122, 111, 165, 20);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Connexion");
		btnNewButton.setBackground(UIManager.getColor("InternalFrame.inactiveTitleGradient"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						String password = passwordField.getText();
						String username = textField.getText();
						
						if(password.contains("123") && username.contains("erij")) {
							passwordField.setText(null);
							textField.setText(null);
							
							menu0 info = new menu0();
							menu0.main(null);
							
					}
						else
						{JOptionPane.showMessageDialog(null, "Invalid login details","Login Error",JOptionPane.ERROR_MESSAGE);
						passwordField.setText(null);
						textField.setText(null);}
			}

				
			});
		btnNewButton.setBounds(168, 177, 95, 31);
		contentPane.add(btnNewButton);
		
		lblNewLabel_1 = new JLabel("Administrateur");
		lblNewLabel_1.setForeground(new Color(100, 149, 237));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(136, 21, 151, 14);
		contentPane.add(lblNewLabel_1);
		
		btnResert = new JButton("Reset");
		btnResert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
				passwordField.setText(null);
			}
		});
		btnResert.setBackground(UIManager.getColor("InternalFrame.inactiveTitleGradient"));
		btnResert.setBounds(279, 177, 95, 31);
		contentPane.add(btnResert);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(47, 162, 349, 4);
		contentPane.add(separator);
		
		
	}
}
