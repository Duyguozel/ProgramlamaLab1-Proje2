import java.awt.Image;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public abstract  class Oyuncu extends JFrame{

    int i=0;
	String kartlar[] = {"bulbasaur.png.png","Butterfree.png.png","charmander.png.jpg","jigglypuff.png.jpg","Meowth.png.png","pikachu.png.png","psyduck.png.jpg","snorlax.png.png","squirtle.png.png","zubat.png.png"};
	
	int boyut = kartlar.length;
	
	ArrayList <String> kart=new ArrayList();
	ArrayList <String> bilgisayar_kartlar = new ArrayList();
	ArrayList <String> kullanýcý_kartlar = new ArrayList();
	ArrayList <String> kalan_kartlar = new ArrayList();
	ArrayList<Pokemon> pokemon = new ArrayList();
	ArrayList<JButton> butonlar = new ArrayList<JButton>();
	ArrayList<Pokemon> pokemon_cards = new ArrayList();
	int[] bilgisayar_hasar_puanlari = new int[5];
	int[] kullanici_hasar_puanlari = new int[5];
	int b_toplam=0;
	int k_toplam=0;
	private String oyuncuAdi;
	private int skor;
	Oyuncu( String oyuncuAdi , int skor){
		
		this.oyuncuAdi=oyuncuAdi;
		this.skor=skor;
		
		
     }
	Oyuncu()
	{
		
	}

	abstract void kartSec();


	public String[] getKartlar() {
		return kartlar;
	}

	public void setKartlar(String[] kartlar) {
		this.kartlar = kartlar;
	}

	public int getBoyut() {
		return boyut;
	}

	public void setBoyut(int boyut) {
		this.boyut = boyut;
	}

	public ArrayList<String> getKart() {
		return kart;
	}

	public void setKart(ArrayList<String> kart) {
		this.kart = kart;
	}

	public ArrayList<String> getBilgisayar_kartlar() {
		return bilgisayar_kartlar;
	}

	public void setBilgisayar_kartlar(ArrayList<String> bilgisayar_kartlar) {
		this.bilgisayar_kartlar = bilgisayar_kartlar;
	}

	public ArrayList<String> getKullanýcý_kartlar() {
		return kullanýcý_kartlar;
	}

	public void setKullanýcý_kartlar(ArrayList<String> kullanýcý_kartlar) {
		this.kullanýcý_kartlar = kullanýcý_kartlar;
	}

	public ArrayList<String> getKalan_kartlar() {
		return kalan_kartlar;
	}

	public void setKalan_kartlar(ArrayList<String> kalan_kartlar) {
		this.kalan_kartlar = kalan_kartlar;
	}

	public String getOyuncuAdi() {
		return oyuncuAdi;
	}

	public void setOyuncuAdi(String oyuncuAdi) {
		this.oyuncuAdi = oyuncuAdi;
	}

	public int getSkor() {
		return skor;
	}

	public void setSkor(int skor) {
		this.skor = skor;
	}

	public void kartDagýt()
	{
		
		for(i=0;i<10;i++)
		{
			 kart.add(kartlar[i]);
		   
		}
		Random r = new Random();
	
		ArrayList<String> kalan = new ArrayList<String>();
		pokemon.add(new Pikachu());
		pokemon.add(new Bulbasaur());
		pokemon.add(new Charmander());
		pokemon.add(new Squirtle());
		pokemon.add(new Zubat());
		pokemon.add(new Psyduck());
		pokemon.add(new Snorlax());
		pokemon.add(new Butterfree());
		pokemon.add(new Jigglypuff());
		pokemon.add(new Meowth());
		
		int j=0,k=0,b=0,ran,ran1,m=0,n=0;
		while(b<3 && k<3)
		{
			
				
			ran=(int)(Math.random()*boyut);
			System.out.println("ran "+ran);
		    bilgisayar_kartlar.add(kart.get(ran));
		     pokemon_cards.add(pokemon.get(ran));
		    //pokemon.get(ran).getHasarPuani();
		  //  bilgisayar_hasar_puanlari[m]=pokemon.get(ran).getHasarPuani();
		   // System.out.println("grflþ"+bilgisayar_hasar_puanlari[m]);
		    pokemon.remove(ran);
			kart.remove(ran);
			b++;
			boyut--;
			m++;
			
			
			ran1=(int)(Math.random()*boyut);
			kullanýcý_kartlar.add(kart.get(ran1));
			  pokemon_cards.add(pokemon.get(ran1));
			//pokemon.get(ran1).getHasarPuani();
			// kullanici_hasar_puanlari[n]=pokemon.get(ran1).getHasarPuani();
		     pokemon.remove(ran1);
			kart.remove(ran1);
			k++;
			boyut--;
			n++;
			
			
			
				
		}
		System.out.println("BÝLGÝSAYARA VERÝLEN KARTLAR");
		System.out.println(bilgisayar_kartlar);
		System.out.println("Kullanýcýcya verilen kartlar");
		System.out.println(kullanýcý_kartlar);
		
		//System.out.println("pokemon cards "+pokemon_cards);
		

		
		
		kalan=(ArrayList<String>) kart.clone();
		while(j<4)
		{
			kalan_kartlar.add(kart.get(j));
			pokemon_cards.add(pokemon.get(j));
			j++;
					
		}
		System.out.println("Kalan  kartlar");
		System.out.println(kalan_kartlar);
		
		int boyutKalan = kalan.size();
		 
		 
		 
		   
			
	}
	
	
	public void hasarPuanýkiyasla()
	{
		for(i=0; i<3; i++)
		{
			System.out.println("bilgisayar kartlar puan "+bilgisayar_hasar_puanlari[i]);
		}
		
		 if(bilgisayar_hasar_puanlari[0]>kullanici_hasar_puanlari[0])
		   {
			 
			   b_toplam+=5;
			   System.out.println("bilgisayar +5");
			   
		   }
		   if(bilgisayar_hasar_puanlari[0]<kullanici_hasar_puanlari[0])
		   {
			   k_toplam+=5;
			   System.out.println("oyuncu +5");
			 
		   }
		   if(bilgisayar_hasar_puanlari[0]==kullanici_hasar_puanlari[0])
		   {
			   System.out.println("berabere");
		   }
		 if(bilgisayar_hasar_puanlari[1]>kullanici_hasar_puanlari[1])
		   {
			 
			   b_toplam+=5;
			   System.out.println("bilgisayar +5");
			   
		   }
		   if(bilgisayar_hasar_puanlari[1]<kullanici_hasar_puanlari[1])
		   {
			   k_toplam+=5;
			   System.out.println("oyuncu +5");
			 
		   }
		   if(bilgisayar_hasar_puanlari[1]==kullanici_hasar_puanlari[1])
		   {
			   System.out.println("berabere");
		   }
		 if(bilgisayar_hasar_puanlari[2]>kullanici_hasar_puanlari[2])
		   {
			 
			   b_toplam+=5;
			   System.out.println("bilgisayar +5");
			   
		   }
		   if(bilgisayar_hasar_puanlari[2]<kullanici_hasar_puanlari[2])
		   {
			   k_toplam+=5;
			   System.out.println("oyuncu +5");
			 
		   }
		   if(bilgisayar_hasar_puanlari[2]==kullanici_hasar_puanlari[2])
		   {
			   System.out.println("berabere");
		   }
		
		 
		 
		  	 

	}
	
	public  void SkorGoster()
	{
		  System.out.println("Bilgisayar : " + b_toplam);
		   System.out.println("Kullanýcý : " + k_toplam);
		
		  
}
	
	
}
