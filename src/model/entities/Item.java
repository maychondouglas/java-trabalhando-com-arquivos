package model.entities;

public class Item {
	private String name;
	private Double unitPrice;
	private Integer amount;
	
	public Item(String name, Double unitPrice, Integer amount) {
		this.name=name;
		this.unitPrice=unitPrice;
		this.amount=amount;
	}
	
	public Item() {
		
	}
	
	public String toString() {
		StringBuilder sb=new StringBuilder();
		sb.append(name);
		sb.append(", Total Price: ");
		sb.append(String.format("%.2f", amount*unitPrice));
		return sb.toString();
	}

}
