package güneşbank;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTabbedPane;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Toolkit;

public class Login extends veritabanı {

	private JFrame frmGneBankGiri;
	private JTextField textField;
	private JPasswordField passwordField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmGneBankGiri.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		super("root","","beyza_database","alperen");
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmGneBankGiri = new JFrame();
		frmGneBankGiri.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\29alp\\Desktop\\seçilerzan.jpg"));
		frmGneBankGiri.setTitle("SEÇİL ERZAN BANK GİRİŞ EKRANI\r\n");
		frmGneBankGiri.setBounds(100, 100, 700, 600);
		frmGneBankGiri.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		frmGneBankGiri.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\29alp\\Desktop\\seçilerzan.jpg"));
		lblNewLabel.setBounds(205, 94, 242, 207);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("SEÇİL ERZAN BANK GİRİŞ EKRANI");
		lblNewLabel_1.setForeground(Color.ORANGE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(145, 41, 364, 31);
		panel.add(lblNewLabel_1);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(22, 311, 643, 242);
		panel.add(tabbedPane);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.BLACK);
		tabbedPane.addTab("Kayıt Ol", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("SEÇİL ERZAN BANK'A HOŞ GELDİNİZ\r\n");
		lblNewLabel_5.setForeground(Color.ORANGE);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_5.setBounds(132, 23, 369, 33);
		panel_2.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Kısa Vadeli Hesap Açmak için...");
		lblNewLabel_6.setForeground(Color.ORANGE);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_6.setBounds(88, 75, 292, 33);
		panel_2.add(lblNewLabel_6);
		
		JButton btnNewButton_1 = new JButton("TIKLAYINIZ");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBounds(414, 81, 160, 21);
		panel_2.add(btnNewButton_1);
		
		JLabel lblNewLabel_7 = new JLabel("Uzun Vadeli Hesap Açmak için...");
		lblNewLabel_7.setForeground(Color.ORANGE);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_7.setBounds(82, 118, 298, 21);
		panel_2.add(lblNewLabel_7);
		
		JButton btnNewButton_2 = new JButton("TIKLAYINIZ");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2.setBounds(414, 118, 160, 21);
		panel_2.add(btnNewButton_2);
		
		JLabel lblNewLabel_8 = new JLabel("Vadesiz Hesap Açmak için...");
		lblNewLabel_8.setForeground(Color.ORANGE);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_8.setBounds(121, 157, 258, 21);
		panel_2.add(lblNewLabel_8);
		
		JButton btnNewButton_3 = new JButton("TIKLAYINIZ");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_3.setBounds(414, 157, 160, 21);
		panel_2.add(btnNewButton_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLACK);
		tabbedPane.addTab("Giriş", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("HESAP ID : \r\n");
		lblNewLabel_2.setForeground(Color.ORANGE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(107, 62, 124, 51);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("SEÇİL ERZAN BANK 'A HOŞ GELDİNİZ");
		lblNewLabel_3.setForeground(Color.ORANGE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(153, 20, 396, 32);
		panel_1.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("ŞİFRE :");
		lblNewLabel_4.setForeground(Color.ORANGE);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4.setBounds(139, 123, 84, 25);
		panel_1.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(255, 76, 294, 32);
		panel_1.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setEchoChar('$');
		passwordField.setBounds(255, 124, 294, 32);
		panel_1.add(passwordField);
		
		JButton btnNewButton = new JButton("GİRİŞ");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(448, 166, 101, 39);
		panel_1.add(btnNewButton);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.BLACK);
		tabbedPane.addTab("Menü", null, panel_3, null);
		panel_3.setLayout(null);
		
		JButton btnNewButton_4 = new JButton("PARA YATIR");
		btnNewButton_4.setForeground(Color.ORANGE);
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_4.setBounds(90, 68, 177, 65);
		panel_3.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("PARA ÇEK");
		btnNewButton_5.setForeground(Color.ORANGE);
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_5.setBounds(333, 68, 177, 65);
		panel_3.add(btnNewButton_5);
		
		JLabel lblNewLabel_9 = new JLabel("BAKİYENİZ :");
		lblNewLabel_9.setForeground(Color.ORANGE);
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_9.setBounds(162, 19, 146, 25);
		panel_3.add(lblNewLabel_9);
		
		textField_1 = new JTextField();
		textField_1.setBounds(299, 19, 146, 25);
		panel_3.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton_6 = new JButton("KÂR");
		btnNewButton_6.setForeground(Color.ORANGE);
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_6.setBounds(90, 145, 177, 60);
		panel_3.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("ÇIKIŞ");
		btnNewButton_7.setForeground(Color.ORANGE);
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_7.setBounds(333, 147, 177, 58);
		panel_3.add(btnNewButton_7);
	}
}
