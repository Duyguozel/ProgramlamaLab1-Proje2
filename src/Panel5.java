import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Panel5 extends JFrame {

	private JPanel contentPane;

	Bilgisayar cp1 = new Bilgisayar("Bilgisayar1",0);
	KullanýcýOyuncu insanOyuncu = new KullanýcýOyuncu();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Panel5 frame = new Panel5();
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
	public Panel5() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JTextField txtKullaniciAdi = new JTextField();
		txtKullaniciAdi.setBounds(125, 150, 100, 40);
		contentPane.add(txtKullaniciAdi);
		insanOyuncu.setOyuncuAdi(txtKullaniciAdi.getText());
		JLabel lblName = new JLabel("Ýsminizi Giriniz");
		lblName.setBounds(125, 115, 100, 30);
		contentPane.add(lblName);
		
		JButton btnGiris = new JButton("OYNA");
		btnGiris.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
				Panel2 pane = new Panel2(cp1,insanOyuncu);
				pane.setVisible(true);
				
			}
		});
		btnGiris.setBounds(235, 150, 150, 40);
		contentPane.add(btnGiris);
		
		
		
		
		
		

	}

}
