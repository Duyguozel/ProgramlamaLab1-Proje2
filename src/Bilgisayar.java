import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Bilgisayar  extends Oyuncu{
	int baslangic_puaný=0;
	Bilgisayar(String oyuncuAdi , int skor)
	{
		super(oyuncuAdi,skor);
	}
	Bilgisayar()
	{
		super.kartDagýt();
		
getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("");
		Image kalan1 = new ImageIcon(this.getClass().getResource("/pokemonkart.png.jpg")).getImage();
		btnNewButton.setIcon(new ImageIcon(kalan1));
		btnNewButton.setBounds(10, 11, 89, 120);
		Image kalan11 = new ImageIcon(this.getClass().getResource(kalan_kartlar.get(0))).getImage();
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		Image kalan2 = new ImageIcon(this.getClass().getResource("/pokemonkart.png.jpg")).getImage();
		btnNewButton_1.setIcon(new ImageIcon(kalan2));
		btnNewButton_1.setBounds(27, 11, 89, 120);
		Image kalan22 = new ImageIcon(this.getClass().getResource(kalan_kartlar.get(1))).getImage();
		getContentPane().add(btnNewButton_1);
		
		JButton button = new JButton("");
		Image kalan3 = new ImageIcon(this.getClass().getResource("/pokemonkart.png.jpg")).getImage();
		button.setIcon(new ImageIcon(kalan3));
		button.setBounds(44, 11, 89, 120);
		Image kalan33 = new ImageIcon(this.getClass().getResource(kalan_kartlar.get(2))).getImage();
		getContentPane().add(button);
		
		JButton button_1 = new JButton("");
		Image kalan4 = new ImageIcon(this.getClass().getResource("/pokemonkart.png.jpg")).getImage();
		button_1.setIcon(new ImageIcon(kalan4));
		button_1.setBounds(61, 11, 89, 120);
		Image kalan44 = new ImageIcon(this.getClass().getResource(kalan_kartlar.get(3))).getImage();
		getContentPane().add(button_1);
		
		JLabel lblSrkleyin = new JLabel("S\u00DCR\u00DCKLEY\u0130N");
		lblSrkleyin.setBounds(37, 142, 89, 24);
		getContentPane().add(lblSrkleyin);
	/*	
		JButton button_2 = new JButton("");
		button_2.setBounds(27, 177, 89, 120);
		getContentPane().add(button_2);
	*/	
		JButton button_3 = new JButton("");
		Image bilgisayar1 = new ImageIcon(this.getClass().getResource("/pokemonkart.png.jpg")).getImage();
		button_3.setIcon(new ImageIcon(bilgisayar1));
		Image bilgisayar11 = new ImageIcon(this.getClass().getResource(bilgisayar_kartlar.get(0))).getImage();
	    button_3.addMouseListener((MouseListener) new MouseAdapter()
	    {
	    	public void mouseEntered(MouseEvent e)
	    	{
	    		button_3.setIcon(new ImageIcon(bilgisayar11));
	    	}
	    	public void mouseExited(MouseEvent e)
	    	{
	    		button_3.setIcon(new ImageIcon(bilgisayar1));
	    	}
	    	
	    });
		button_3.setBounds(278, 22, 89, 120);
		getContentPane().add(button_3);
		
		JButton button_4 = new JButton("");
		
		Image bilgisayar2 = new ImageIcon(this.getClass().getResource("/pokemonkart.png.jpg")).getImage();
		button_4.setIcon(new ImageIcon(bilgisayar2));
		Image bilgisayar22 = new ImageIcon(this.getClass().getResource(bilgisayar_kartlar.get(1))).getImage();
	    button_4.addMouseListener((MouseListener) new MouseAdapter()
	    {
	    	public void mouseEntered(MouseEvent e)
	    	{
	    		button_4.setIcon(new ImageIcon(bilgisayar22));
	    	}
	    	public void mouseExited(MouseEvent e)
	    	{
	    		button_4.setIcon(new ImageIcon(bilgisayar2));
	    	}
	    	
	    });
		
		button_4.setBounds(372, 22, 89, 120);
		getContentPane().add(button_4);
		
		JButton button_5 = new JButton("");
		Image bilgisayar3 = new ImageIcon(this.getClass().getResource("/pokemonkart.png.jpg")).getImage();
		button_5.setIcon(new ImageIcon(bilgisayar3));
		Image bilgisayar33 = new ImageIcon(this.getClass().getResource(bilgisayar_kartlar.get(2))).getImage();
	    button_5.addMouseListener((MouseListener) new MouseAdapter()
	    {
	    	public void mouseEntered(MouseEvent e)
	    	{
	    		button_5.setIcon(new ImageIcon(bilgisayar33));
	    	}
	    	public void mouseExited(MouseEvent e)
	    	{
	    		button_5.setIcon(new ImageIcon(bilgisayar3));
	    	}
	    	
	    });
		
		button_5.setBounds(466, 22, 89, 120);
		getContentPane().add(button_5);
		
		JLabel lblComputer = new JLabel("COMPUTER 1");
		lblComputer.setBounds(282, 0, 85, 24);
		getContentPane().add(lblComputer);
		
		JButton button_6 = new JButton("");
		Image computer1= new ImageIcon(this.getClass().getResource("/pokemonkart.png.jpg")).getImage();
		button_6.setIcon(new ImageIcon(computer1));
		Image computer11 = new ImageIcon(this.getClass().getResource(kullanýcý_kartlar.get(0))).getImage();
	    button_6.addMouseListener((MouseListener) new MouseAdapter()
	    {
	    	/*public void mouseEntered(MouseEvent e)
	    	{
	    		button_6.setIcon(new ImageIcon(computer11));
	    	}
	    	public void mouseExited(MouseEvent e)
	    	{
	    		button_6.setIcon(new ImageIcon(computer1));
	    	}*/
	    	public void mouseClicked(MouseEvent e)
	    	{ 
	    		
	    		button_6.setIcon(new ImageIcon(computer11));
	    		
	    		button_6.setLocation(30,180);
	    		kullanici_hasar_puanlari[0]= pokemon_cards.get(1).getHasarPuani();
	    		button_1.setLocation(278, 22);
	    		button_3.setLocation(130, 180);
	    		button_3.setIcon(new ImageIcon(bilgisayar11));
	    		bilgisayar_hasar_puanlari[0]= pokemon_cards.get(0).getHasarPuani();
	    		button.setLocation(278,177 );
	    		hasarPuanýkiyasla();
	    		SkorGoster();

	    	}
	    	
	    });
		
		button_6.setBounds(278, 177, 89, 120);
		getContentPane().add(button_6);
		
		JButton button_7 = new JButton("");
		Image computer2 = new ImageIcon(this.getClass().getResource("/pokemonkart.png.jpg")).getImage();
		button_7.setIcon(new ImageIcon(computer2));
		Image computer22 = new ImageIcon(this.getClass().getResource(kullanýcý_kartlar.get(1))).getImage();
	    button_7.addMouseListener((MouseListener) new MouseAdapter()
	    {
	    	/*public void mouseEntered(MouseEvent e)
	    	{
	    		button_7.setIcon(new ImageIcon(computer22));
	    	}
	    	public void mouseExited(MouseEvent e)
	    	{
	    		button_7.setIcon(new ImageIcon(computer2));
	    	}*/
	    	public void mouseClicked(MouseEvent e)
	    	{
	    		
	    		button_7.setIcon(new ImageIcon(computer22));
	    		button_7.setLocation(30,300);
	    		kullanici_hasar_puanlari[1]= pokemon_cards.get(3).getHasarPuani();
	    		button_4.setLocation(130,300);
	    		button_4.setIcon(new ImageIcon(bilgisayar22));
	    		bilgisayar_hasar_puanlari[1]= pokemon_cards.get(2).getHasarPuani();
	    		btnNewButton_1.setLocation(377 ,22);
	    		btnNewButton.setLocation(372,177 );
	    		hasarPuanýkiyasla();
	    		SkorGoster();
	    		
	    	}
	    });
		
		button_7.setBounds(372, 177, 89, 120);
		getContentPane().add(button_7);
		
		JButton button_8 = new JButton("");
		Image computer3 = new ImageIcon(this.getClass().getResource("/pokemonkart.png.jpg")).getImage();
		button_8.setIcon(new ImageIcon(computer3));
		Image computer33 = new ImageIcon(this.getClass().getResource(kullanýcý_kartlar.get(2))).getImage();
	    button_8.addMouseListener((MouseListener) new MouseAdapter()
	    {
	    	/*public void mouseEntered(MouseEvent e)
	    	{
	    		button_8.setIcon(new ImageIcon(computer33));
	    	}
	    	public void mouseExited(MouseEvent e)
	    	{
	    		button_8.setIcon(new ImageIcon(computer3));
	    	}
	    	*/
	    	public void mouseClicked(MouseEvent e)
	    	{
	    		button_8.setIcon(new ImageIcon(computer33));
	    		button_8.setLocation(30,420);
	    		kullanici_hasar_puanlari[2]= pokemon_cards.get(5).getHasarPuani();
	    		button_5.setLocation(130,420);
	    		button_5.setIcon(new ImageIcon(bilgisayar33));
	    		bilgisayar_hasar_puanlari[2]= pokemon_cards.get(4).getHasarPuani();
	    		button_1.setLocation(30, 540);
	    		button_1.setIcon(new ImageIcon(kalan44));
	    		button.setLocation(130, 540);
	    		button.setIcon(new ImageIcon(kalan33));
	    		btnNewButton_1.setLocation(250, 540);
	    		btnNewButton_1.setIcon(new ImageIcon(kalan22));
	    		btnNewButton.setLocation(350, 540);
	    		btnNewButton.setIcon(new ImageIcon(kalan11));
	    		
	    		hasarPuanýkiyasla();
	    		SkorGoster();
	    	}
	    });
		
		button_8.setBounds(466, 177, 89, 120);
		getContentPane().add(button_8);
		
		JLabel lblPlayer = new JLabel("COMPUTER 2");
		lblPlayer.setBounds(278, 147, 89, 19);
		getContentPane().add(lblPlayer);
		
	}
	
	public int getBaslangic_puaný() {
		return baslangic_puaný;
	}
	public void setBaslangic_puaný(int baslangic_puaný) {
		this.baslangic_puaný = baslangic_puaný;
	}
	@Override
	void kartSec() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void SkorGoster() {
		// TODO Auto-generated method stub
		
	}
	

	

}
