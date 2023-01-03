package Interface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cherecher_ese extends JFrame {

	private JPanel contentPane;
	private JTextField txtSaisirMatriculr;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cherecher_ese frame = new Cherecher_ese();
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
	public Cherecher_ese() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 397, 227);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtSaisirMatriculr = new JTextField();
		txtSaisirMatriculr.setText("Saisir matricule");
		txtSaisirMatriculr.setBounds(28, 75, 193, 20);
		contentPane.add(txtSaisirMatriculr);
		txtSaisirMatriculr.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Matricule de l'entreprise");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(28, 50, 154, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Rechercher");
		btnNewButton.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		btnNewButton.setBounds(127, 117, 110, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu info = new menu();
				menu.main(null);
			}
		});
		btnNewButton_1.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		btnNewButton_1.setBounds(247, 117, 106, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Menu principale");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu0 info = new menu0();
				menu0.main(null);
			}
		});
		btnNewButton_2.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		btnNewButton_2.setBounds(10, 154, 124, 23);
		contentPane.add(btnNewButton_2);
	}

}
