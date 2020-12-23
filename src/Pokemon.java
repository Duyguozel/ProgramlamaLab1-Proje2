public class Pokemon {

	private String pokemonAdi;
	private String pokemonTip;
	private int hasarPuani;
	boolean kullanildiMi=false;
	private String pokemon_resimler;
	
	public Pokemon(String pokemonAdi, String pokemonTip, int hasarPuani, String pokemon_resimler) {
		super();
		this.pokemonAdi = pokemonAdi;
		this.pokemonTip = pokemonTip;
		this.hasarPuani = hasarPuani;
		this.pokemon_resimler = pokemon_resimler;
	}

	public Pokemon(String pokemonAdi, String pokemonTip, int hasarPuani, boolean kullanildiMi,
			String pokemon_resimler) {
		super();
		this.pokemonAdi = pokemonAdi;
		this.pokemonTip = pokemonTip;
		this.hasarPuani = hasarPuani;
		this.kullanildiMi = kullanildiMi;
		this.pokemon_resimler = pokemon_resimler;
	}

	Pokemon(String pokemonAdi , String pokemonTip, int hasarPuani)
	{
		this.pokemonAdi=pokemonAdi;
		this.pokemonTip=pokemonTip;
		this.hasarPuani = hasarPuani;
	}
	
	Pokemon()
	{
		
	}
	
	public String getPokemonAdi() {
		return pokemonAdi;
	}

	public void setPokemonAdi(String pokemonAdi) {
		this.pokemonAdi = pokemonAdi;
	}

	public String getPokemonTip() {
		return pokemonTip;
	}

	public void setPokemonTip(String pokemonTip) {
		this.pokemonTip = pokemonTip;
	}
	public int getHasarPuani() {
		return hasarPuani;
	}

	public void setHasarPuani(int hasarPuani) {
		this.hasarPuani = hasarPuani;
	}

	public boolean isKullanildiMi() {
		return kullanildiMi;
	}

	public void setKullanildiMi(boolean kullanildiMi) {
		this.kullanildiMi = kullanildiMi;
	}

	public void hasarPuaniGoster()
	{
		System.out.println(this.pokemonAdi + "Tipi =" + this.pokemonTip + "Hasar puaný = "+ this.hasarPuani );
	}
}
