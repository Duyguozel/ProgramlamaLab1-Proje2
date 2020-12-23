import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Panel3 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Panel3 frame = new Panel3();
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
	public Panel3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 497, 361);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton((String) null);
		
	
		Image img1 = new ImageIcon(this.getClass().getResource("/pokemonkart.png.jpg")).getImage();
		btnNewButton.setIcon(new ImageIcon(img1));
		Image img11 = new ImageIcon(this.getClass().getResource("/pikachu.png.png")).getImage();
		
	
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				btnNewButton.setIcon(new ImageIcon(img11));
				btnNewButton.getClass().getResource("Pikachu");
				
				
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton.setIcon(new ImageIcon(img1));
			}
		});
		
			btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				
			}
		});
		btnNewButton.setBounds(0, 0, 68, 125);
		contentPane.add(btnNewButton);
		
		
		
		JButton btnNewButton_1 = new JButton("New button2");
		Image img2 = new ImageIcon(this.getClass().getResource("/pokemonkart.png.jpg")).getImage();
		Image img22 = new ImageIcon(this.getClass().getResource("/bulbasaur.png.png")).getImage();
		btnNewButton_1.setIcon(new ImageIcon(img2));
	/*	btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnNewButton_1.setIcon(new ImageIcon(img22));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				btnNewButton_1.setIcon(new ImageIcon(img2));
			}
		});
	
*/		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(84, 0, 68, 125);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button3");
		Image img3 = new ImageIcon(this.getClass().getResource("/pokemonkart.png.jpg")).getImage();
		btnNewButton_2.setIcon(new ImageIcon(img3));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(167, 0, 68, 125);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button3");
		Image img4 = new ImageIcon(this.getClass().getResource("/pokemonkart.png.jpg")).getImage();
		btnNewButton_3.setIcon(new ImageIcon(img4));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(250, 0,68 , 125);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("New button4");
		Image img5 = new ImageIcon(this.getClass().getResource("/pokemonkart.png.jpg")).getImage();
		btnNewButton_4.setIcon(new ImageIcon(img5));
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4.setBounds(333, 0, 68, 125);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("New button5");
		Image img6 = new ImageIcon(this.getClass().getResource("/pokemonkart.png.jpg")).getImage();
		btnNewButton_5.setIcon(new ImageIcon(img6));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_5.setBounds(0, 131, 68, 125);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("New button6");
		Image img7 = new ImageIcon(this.getClass().getResource("/pokemonkart.png.jpg")).getImage();
		btnNewButton_6.setIcon(new ImageIcon(img7));
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_6.setBounds(84, 131, 68, 125);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("New button7");
		Image img8 = new ImageIcon(this.getClass().getResource("/pokemonkart.png.jpg")).getImage();
		btnNewButton_7.setIcon(new ImageIcon(img8));
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_7.setBounds(167, 131, 68, 125);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("New button8");
		Image img9 = new ImageIcon(this.getClass().getResource("/pokemonkart.png.jpg")).getImage();
		btnNewButton_8.setIcon(new ImageIcon(img9));
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_8.setBounds(250, 131, 68, 125);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("New button9");
		Image img10 = new ImageIcon(this.getClass().getResource("/pokemonkart.png.jpg")).getImage();
		btnNewButton_9.setIcon(new ImageIcon(img10));
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_9.setBounds(333, 131, 68, 125);
		contentPane.add(btnNewButton_9);
		
		JButton btnKartlarDat = new JButton("KARTLARI DA\u011EIT");
		btnKartlarDat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Bilgisayar obj = new Bilgisayar();
				obj.setSize(900, 700);
				obj.setVisible(true);
				dispose();
				
			}
		});
		btnKartlarDat.setBounds(135, 267, 157, 38);
		contentPane.add(btnKartlarDat);
	}
	public Panel3(Oyuncu player1, Oyuncu player2) {
		this();
	}

}
