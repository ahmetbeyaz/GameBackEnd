package Entites;

public class Game {
	String _gamename;
	int star;
	double  price;
	public Game(String _gamename,int star, double price) {
		super();
		this._gamename = _gamename;
		this.price = price;
		this.star=star;
	}
	public Game() {
		
	}
	public String get_gamename() {
		return _gamename;
	}
	public void set_gamename(String _gamename) {
		this._gamename = _gamename;
	}

	public int getStar() {
		return star;
	}
	public void setStar(int star) {
		this.star = star;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	

}
