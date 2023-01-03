package Interface;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class Ese extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ese frame = new Ese();
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
	public Ese() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 536, 374);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
contentPane.setLayout(null);
		
		JFormattedTextField frmtdtxtfldSaisirLePrnon = new JFormattedTextField();
		frmtdtxtfldSaisirLePrnon.setText("saisir le prénom");
		frmtdtxtfldSaisirLePrnon.setBounds(94, 67, 137, 20);
		contentPane.add(frmtdtxtfldSaisirLePrnon);
		
		JLabel lblNewLabel = new JLabel("Prénom :");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(10, 65, 74, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nom :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(10, 111, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JFormattedTextField frmtdtxtfldSaisirLeNom = new JFormattedTextField();
		frmtdtxtfldSaisirLeNom.setText("saisir le nom");
		frmtdtxtfldSaisirLeNom.setBounds(94, 110, 137, 20);
		contentPane.add(frmtdtxtfldSaisirLeNom);
		
		JLabel lblNewLabel_2 = new JLabel("Email :");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(10, 155, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JFormattedTextField frmtdtxtfldSaisirLemail = new JFormattedTextField();
		frmtdtxtfldSaisirLemail.setText("saisir l'email");
		frmtdtxtfldSaisirLemail.setBounds(94, 154, 137, 20);
		contentPane.add(frmtdtxtfldSaisirLemail);
		
		JLabel lblNewLabel_2_1 = new JLabel("Tel :");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_1.setBounds(10, 198, 46, 14);
		contentPane.add(lblNewLabel_2_1);
		
		JFormattedTextField frmtdtxtfldSaisirLeNumro = new JFormattedTextField();
		frmtdtxtfldSaisirLeNumro.setText("saisir le numéro");
		frmtdtxtfldSaisirLeNumro.setBounds(94, 197, 137, 20);
		contentPane.add(frmtdtxtfldSaisirLeNumro);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Registre fiscale :");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_1_1.setBounds(264, 177, 103, 31);
		contentPane.add(lblNewLabel_2_1_1);
		
		JFormattedTextField frmtdtxtfldSaisirCin = new JFormattedTextField();
		frmtdtxtfldSaisirCin.setText("saisir registre fiscale");
		frmtdtxtfldSaisirCin.setBounds(365, 184, 137, 20);
		contentPane.add(frmtdtxtfldSaisirCin);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel(" Adresse:");
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_1_1_1.setBounds(262, 119, 94, 31);
		contentPane.add(lblNewLabel_2_1_1_1);
		
		JFormattedTextField frmtdtxtfldSaisirLadresse = new JFormattedTextField();
		frmtdtxtfldSaisirLadresse.setText("saisir l'adresse");
		frmtdtxtfldSaisirLadresse.setBounds(365, 111, 137, 51);
		contentPane.add(frmtdtxtfldSaisirLadresse);
		
		JButton btnNewButton_2 = new JButton("Ajouter");
		btnNewButton_2.setBackground(UIManager.getColor("InternalFrame.inactiveTitleGradient"));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Ajout avec succés");
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2.setBounds(239, 258, 118, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_3 = new JLabel("                Entreprise");
		lblNewLabel_3.setForeground(new Color(100, 149, 237));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setBounds(132, 11, 223, 29);
		contentPane.add(lblNewLabel_3);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(43, 239, 434, 8);
		contentPane.add(separator);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Matricule :");
		lblNewLabel_2_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_1_1_1_1.setBounds(262, 60, 94, 31);
		contentPane.add(lblNewLabel_2_1_1_1_1);
		
		JFormattedTextField frmtdtxtfldSaisirMatricule = new JFormattedTextField();
		frmtdtxtfldSaisirMatricule.setText("saisir matricule");
		frmtdtxtfldSaisirMatricule.setBounds(365, 71, 137, 20);
		contentPane.add(frmtdtxtfldSaisirMatricule);
		
		JButton btnNewButton_2_1 = new JButton("Back");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu info = new menu();
				menu.main(null);
			}
		});
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2_1.setBackground(UIManager.getColor("InternalFrame.inactiveTitleGradient"));
		btnNewButton_2_1.setBounds(370, 258, 118, 23);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton = new JButton("Menu principale");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu0 info = new menu0();
				menu0.main(null);
			}
		});
		btnNewButton.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		btnNewButton.setBounds(43, 301, 124, 23);
		contentPane.add(btnNewButton);
	}
	}


