package Interface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class chercher_c extends JFrame {

	private JPanel contentPane;
	private JTextField txtSaisirCinDu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					chercher_c frame = new chercher_c();
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
	public chercher_c() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 427, 240);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CIN");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(41, 40, 46, 14);
		contentPane.add(lblNewLabel);
		
		txtSaisirCinDu = new JTextField();
		txtSaisirCinDu.setText("saisir cin du client");
		txtSaisirCinDu.setBounds(30, 65, 207, 26);
		contentPane.add(txtSaisirCinDu);
		txtSaisirCinDu.setColumns(10);
		
		JButton btnNewButton = new JButton("Rechercher");
		btnNewButton.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		btnNewButton.setBounds(169, 115, 110, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu info = new menu();
				menu.main(null);
			}
		});
		btnNewButton_1.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		btnNewButton_1.setBounds(297, 115, 106, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Menu principale");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu0 info = new menu0();
				menu0.main(null);
			}
		});
		btnNewButton_2.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		btnNewButton_2.setBounds(30, 156, 124, 23);
		contentPane.add(btnNewButton_2);
	}

}
