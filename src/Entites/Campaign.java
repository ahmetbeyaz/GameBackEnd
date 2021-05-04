package Entites;

public class Campaign {
	String campaignname;
	double discount;
	double unitPrice;

	public Campaign(double discount,String campaignname,double unitPrice) {
		this.discount = discount;
		this.campaignname=campaignname;
		this.unitPrice=unitPrice;
	}
	public Campaign() {
		
	}
	public String getCampaignname() {
		return campaignname;
	}
	public void setCampaignname(String campaignname) {
		this.campaignname = campaignname;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public double getUnitPriceAfterDiscount() {   //Ýndirim hesaplamak için
		return this.unitPrice-(this.unitPrice * this.discount/100);
	}
	
	

	

}
