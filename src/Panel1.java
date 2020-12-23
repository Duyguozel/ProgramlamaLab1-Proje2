import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
public class Panel1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Panel1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,600,400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		Image imgLabel = new ImageIcon(this.getClass().getResource("/pok.png.jpg")).getImage();
	
		JLabel lblNewLabel = new JLabel("New Label");
		lblNewLabel.setIcon(new ImageIcon(imgLabel));
		lblNewLabel.setBounds(0, 0, 478, 261);
		
		
	
		contentPane.add(lblNewLabel);

       JButton btnPcPc = new JButton(" PC - PC");
		btnPcPc.setBackground(Color.BLUE);
		btnPcPc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panel3 obj = new Panel3();
				obj.setVisible(true);
				dispose();
				
			}
		});
		btnPcPc.setBounds(86, 191, 103, 33);
		contentPane.add(btnPcPc);
		
		JButton btnPcPerson = new JButton("PC - PERSON");
		btnPcPerson.setBackground(Color.BLUE);
		btnPcPerson.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Panel5 obj = new Panel5();
				obj.setVisible(true);
				dispose();
			}
		});
		btnPcPerson.setBounds(248, 191, 103, 33);
		contentPane.add(btnPcPerson);
	
	}
	
	
	
}

