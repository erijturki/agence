package Interface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.SystemColor;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JFormattedTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JEditorPane;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import java.awt.Checkbox;
import java.awt.Font;
import java.awt.Button;
import java.awt.Color;
import javax.swing.JSeparator;

public class C extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					C frame = new C();
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
	public C() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 376);
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
		
		JLabel lblNewLabel_2_1_1 = new JLabel(" CIN/Passeport :");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_1_1.setBounds(252, 60, 103, 31);
		contentPane.add(lblNewLabel_2_1_1);
		
		JFormattedTextField frmtdtxtfldSaisirCin = new JFormattedTextField();
		frmtdtxtfldSaisirCin.setText("saisir cin");
		frmtdtxtfldSaisirCin.setBounds(365, 67, 137, 20);
		contentPane.add(frmtdtxtfldSaisirCin);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel(" Adresse:");
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2_1_1_1.setBounds(252, 117, 94, 31);
		contentPane.add(lblNewLabel_2_1_1_1);
		
		JFormattedTextField frmtdtxtfldSaisirLadresse = new JFormattedTextField();
		frmtdtxtfldSaisirLadresse.setText("saisir l'adresse");
		frmtdtxtfldSaisirLadresse.setBounds(365, 117, 137, 51);
		contentPane.add(frmtdtxtfldSaisirLadresse);
		
		JButton btnNewButton_2 = new JButton("Ajouter");
		btnNewButton_2.setBackground(UIManager.getColor("InternalFrame.inactiveTitleGradient"));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Ajout avec succés");
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2.setBounds(237, 260, 118, 23);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_3 = new JLabel("                Client");
		lblNewLabel_3.setForeground(new Color(100, 149, 237));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setBounds(132, 11, 223, 29);
		contentPane.add(lblNewLabel_3);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(43, 239, 434, 8);
		contentPane.add(separator);
		
		JButton btnNewButton_2_1 = new JButton("Back");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu info = new menu();
				menu.main(null);
			}
		});
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton_2_1.setBackground(UIManager.getColor("InternalFrame.inactiveTitleGradient"));
		btnNewButton_2_1.setBounds(365, 260, 118, 23);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton = new JButton("Menu principale");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu0 info = new menu0();
				menu0.main(null);
			}
		});
		btnNewButton.setBackground(UIManager.getColor("InternalFrame.activeTitleGradient"));
		btnNewButton.setBounds(42, 303, 124, 23);
		contentPane.add(btnNewButton);
	}
}
