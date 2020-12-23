import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Panel4 extends JFrame {

	private JPanel contentPane;

	Bilgisayar cp1 = new Bilgisayar("Bilgisayar1",0);
	Bilgisayar cp2 = new Bilgisayar("Bilgisayar2",0);
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Panel4 frame = new Panel4();
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
	public Panel4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		dispose();
		Panel2 panel = new Panel2(cp1,cp2);
		panel.setVisible(true);
	}
	

}
