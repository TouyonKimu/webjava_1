package jp.co.systena.tigerscave.springtest;


public class Item {

	private int itemid;
	private String name;
    private int price;

    public Item(int itemid, String name, int price) {
    	super();
		this.itemid = itemid;
    	this.name = name;
        this.price = price;
    }

    public void setItemId(int itemid) {
        this.itemid = itemid;
    }

    public int getItemId() {
        return itemid;
    }


	public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}