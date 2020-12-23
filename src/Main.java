import java.awt.EventQueue;

public class Main  {
	public static void main(String[] args)
	{
	    
	   Oyuncu player1= new KullanýcýOyuncu("Duygu",0);
	   Oyuncu computer1 = new Bilgisayar("Bilgisayar",0);
	  //  player1.kartDagýt();
	    
	
		Pikachu p = new Pikachu("Pikachu","Elektrik",40,"pikachu.png.png");
		p.hasarPuaniGoster();
		
		Bulbasaur bull = new Bulbasaur("Bulbasaur" ,"Çim",50,"bulbasaur.png.png");
		bull.hasarPuaniGoster();
		
		Butterfree but = new Butterfree("Butterfree","Hava",10,"Butterfree.png.png");
		but.hasarPuaniGoster();
		
		Charmander c = new Charmander("Charmander" , "Ateþ",60,"charmander.png.jpg");
		c.hasarPuaniGoster();
		
		Squirtle s = new Squirtle("Squirtle","Su",30,"squirtle.png.png");
		s.hasarPuaniGoster();
		
		Zubat z = new Zubat("Zubat","Hava",50, "zubat.png.png");
		z.hasarPuaniGoster();
		
		Psyduck psy = new Psyduck("Psyduck" , "Su",50,"psyduck.png.jpg");
		psy.hasarPuaniGoster();
		
		Snorlax sn = new Snorlax("snorlax","Normal",30,"snorlax.png.png");
		sn.hasarPuaniGoster();
		
		Jigglypuff j = new Jigglypuff("Jigglypuff","Ses",70,"jigglypuff.png.jpg");
		j.hasarPuaniGoster();
		
		Meowth m = new Meowth("Meowth","Normal",40,"Meowth.png.png");
		m.hasarPuaniGoster();
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Panel1 frame = new Panel1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
	}
}
