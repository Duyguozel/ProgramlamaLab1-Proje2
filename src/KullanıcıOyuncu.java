import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class KullanýcýOyuncu extends Oyuncu {
	
	int baslangic_puan=0;
	KullanýcýOyuncu( String oyuncuAdi , int skor)
	{
		super(oyuncuAdi,skor);
	}
	KullanýcýOyuncu()
	{
		
		super.kartDagýt();
		ArrayList<JButton> bilgisayar_butonlar = new ArrayList<JButton>();
		ArrayList<JButton> kalan_butonlar = new ArrayList<JButton>();
		
		
		int[][] matris ={{278,22},{372,22},{466,22}};
		 
		getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("");
		Image kalan1 = new ImageIcon(this.getClass().getResource("/pokemonkart.png.jpg")).getImage();
		btnNewButton.setIcon(new ImageIcon(kalan1));
		btnNewButton.setBounds(10, 11, 89, 120);
		getContentPane().add(btnNewButton);
		kalan_butonlar.add( btnNewButton);
		
	   JButton btnNewButton_1 = new JButton("");
		Image kalan2 = new ImageIcon(this.getClass().getResource("/pokemonkart.png.jpg")).getImage();
		btnNewButton_1.setIcon(new ImageIcon(kalan2));
		btnNewButton_1.setBounds(27, 11, 89, 120);
		getContentPane().add(btnNewButton_1);
		kalan_butonlar.add( btnNewButton_1);
		
		
		JButton button = new JButton("");
		Image kalan3 = new ImageIcon(this.getClass().getResource("/pokemonkart.png.jpg")).getImage();
		button.setIcon(new ImageIcon(kalan3));
		button.setBounds(44, 11, 89, 120);
		getContentPane().add(button);
		kalan_butonlar.add( button);
		
		JButton button_1 = new JButton("");
		Image kalan4 = new ImageIcon(this.getClass().getResource("/pokemonkart.png.jpg")).getImage();
		button_1.setIcon(new ImageIcon(kalan4));
		button_1.setBounds(61, 11, 89, 120);
		getContentPane().add(button_1);
		kalan_butonlar.add( button_1);
		
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
		bilgisayar_butonlar.add(button_3);
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
		bilgisayar_butonlar.add(button_4);
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
		bilgisayar_butonlar.add(button_5);
		
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
		
		JLabel lblComputer = new JLabel("COMPUTER");
		lblComputer.setBounds(282, 0, 85, 24);
		getContentPane().add(lblComputer);
		
		JButton button_6 = new JButton("");
		Image kullanici1= new ImageIcon(this.getClass().getResource("/pokemonkart.png.jpg")).getImage();
		button_6.setIcon(new ImageIcon(kullanici1));
		Image kullanici11 = new ImageIcon(this.getClass().getResource(kullanýcý_kartlar.get(0))).getImage();
	    button_6.addMouseListener((MouseListener) new MouseAdapter()
	    {
	    	/*public void mouseEntered(MouseEvent e)
	    	{
	    		button_6.setIcon(new ImageIcon(kullanici11));
	    	}
	    	public void mouseExited(MouseEvent e)
	    	{
	    		button_6.setIcon(new ImageIcon(kullanici1));
	    	}*/
	    	public void mouseClicked(MouseEvent e)
	    	{ 	System.out.println(kalan_butonlar.size());
	    		//int k_b_boyut=kalan_butonlar.size();
	    		button_6.setIcon(new ImageIcon(kullanici11));
	    		button_6.setLocation(30,180);
	    		int rann = (int)(Math.random()*10)%3;
	    		System.out.println("rann = " + rann);
	    		
	    		//System.out.println(rann);
	    		bilgisayar_butonlar.get(rann).setLocation(100, 180);
	    		
	    		//button_1.setLocation(278, 22);
	    		//button_3.setLocation(100, 180);		
	    		//button.setLocation(278,177 );
	    		//int rann2 = (int)(Math.random()*10)%4;
	    		while(true) {
	    			int rann2 = (int)(Math.random()*10)%kalan_butonlar.size();
	               kalan_butonlar.get(rann2).
	    		}
	    		int rann2 =1;
	    		int rann3 =0;
	    		//System.out.println("rann2 = " + rann2);
	    		
	    		//int rann3 = (int)(Math.random()*10)%4;
	    		
	    		//System.out.println(rann3);
	    		kalan_butonlar.get(rann2).setLocation(matris[rann][0], matris[rann][1]);
	    		kalan_butonlar.get(rann3).setLocation(278, 177);
	    		kalan_butonlar.remove(rann3);
	    		kalan_butonlar.remove(rann3);
	    		System.out.println(kalan_butonlar.size());
	    		
	    		
	    	}
	    	
	    	
	    });
	    
		
		button_6.setBounds(278, 177, 89, 120);
		getContentPane().add(button_6);
		
		JButton button_7 = new JButton("");
		Image kullanici2 = new ImageIcon(this.getClass().getResource("/pokemonkart.png.jpg")).getImage();
		button_7.setIcon(new ImageIcon(kullanici2));
		Image kullanici22 = new ImageIcon(this.getClass().getResource(kullanýcý_kartlar.get(1))).getImage();
	    button_7.addMouseListener((MouseListener) new MouseAdapter()
	    {
	    	/*public void mouseEntered(MouseEvent e)
	    	{
	    		button_7.setIcon(new ImageIcon(kullanici22));
	    	}
	    	public void mouseExited(MouseEvent e)
	    	{
	    		button_7.setIcon(new ImageIcon(kullanici2));
	    	}*/
	    	public void mouseClicked(MouseEvent e)
	    	{
	    		System.out.println(kalan_butonlar.size());
	    		button_7.setIcon(new ImageIcon(kullanici22));
	    		button_7.setLocation(30,300);
	    		
	    		
	    		int rann4 = (int)(Math.random()*10)%3;
	    		
	    		
	    	
	    		bilgisayar_butonlar.get(rann4).setLocation(100, 300);
	    		
	    		//int rann5 = (int)(Math.random()*10)%4;
	    	    int rann5=3;
	    	
	    		
	    		int rann6=2;
	    		//int rann6 = (int)(Math.random()*10)%3;
	    		
	    		
	    		kalan_butonlar.get(rann5).setLocation(matris[rann4][0], matris[rann4][1]);
	    		kalan_butonlar.get(rann6).setLocation(372, 177);
	    		kalan_butonlar.remove(rann5);
	    		kalan_butonlar.remove(rann6);
	    		System.out.println(kalan_butonlar.size());
	    	}
	    	
	    });
		
		button_7.setBounds(372, 177, 89, 120);
		getContentPane().add(button_7);
		
		JButton button_8 = new JButton("");
		Image kullanici3 = new ImageIcon(this.getClass().getResource("/pokemonkart.png.jpg")).getImage();
		button_8.setIcon(new ImageIcon(kullanici3));
		Image kullanici33 = new ImageIcon(this.getClass().getResource(kullanýcý_kartlar.get(2))).getImage();
	    button_8.addMouseListener((MouseListener) new MouseAdapter()
	    {
	    	/*public void mouseEntered(MouseEvent e)
	    	{
	    		button_8.setIcon(new ImageIcon(kullanici33));
	    	}
	    	public void mouseExited(MouseEvent e)
	    	{
	    		button_8.setIcon(new ImageIcon(kullanici3));
	    	}*/
	    	public void mouseClicked(MouseEvent e)
	    	{

	    		button_8.setIcon(new ImageIcon(kullanici22));
	    		button_8.setLocation(30,420);
	    		
	    		
	    		int rann7 = (int)(Math.random()*10)%3;
	    		
	    		
	    	
	    		bilgisayar_butonlar.get(rann7).setLocation(100, 420);
	    		
	    		int rann8 = (int)(Math.random()*10)%4;
	    		System.out.println(rann8);
	    		kalan_butonlar.remove(rann8);
	    		int rann9 = (int)(Math.random()*10)%3;
	    		System.out.println(rann9);
	    		kalan_butonlar.remove(rann9);
	    		
	    		kalan_butonlar.get(rann8).setLocation(matris[rann7][0], matris[rann7][1]);
	    		kalan_butonlar.get(rann9).setLocation(466, 177);
	    	}
	    	
	    });
		
		button_8.setBounds(466, 177, 89, 120);
		getContentPane().add(button_8);
		
		JLabel lblPlayer = new JLabel("PLAYER");
		lblPlayer.setBounds(278, 147, 89, 19);
		getContentPane().add(lblPlayer);
		
		
	}
	public int getBaslangic_puan() {
		return baslangic_puan;
	}
	public void setBaslangic_puan(int baslangic_puan) {
		this.baslangic_puan = baslangic_puan;
	}
	@Override
	void kartSec() {
		// TODO Auto-generated method stub
		
	}
  
	

}

	

