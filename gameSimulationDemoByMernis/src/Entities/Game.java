package Entities;

public class Game {
	int id;
	String gameName;
	double unitPrice;
	double unitPriceAfterDiscount;
	
	public Game() {
		
	}
	
	
	
	public Game(int id, String gameName, double unitPrice) {
		super();
		this.id = id;
		this.gameName = gameName;
		this.unitPrice = unitPrice;
	}



	public Game(int id, String gameName, double unitPrice, double unitPriceAfterDiscount) {
		super();
		this.id = id;
		this.gameName = gameName;
		this.unitPrice = unitPrice;
		this.unitPriceAfterDiscount = unitPriceAfterDiscount;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getGameName() {
		return gameName;
	}



	public void setGameName(String gameName) {
		this.gameName = gameName;
	}



	public double getUnitPrice() {
		return unitPrice;
	}



	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}



	public double getUnitPriceAfterDiscount(Campaign campaign) {
		return this.unitPrice- (this.unitPrice *campaign.getDiscountAmount() / 100);
	}
}
