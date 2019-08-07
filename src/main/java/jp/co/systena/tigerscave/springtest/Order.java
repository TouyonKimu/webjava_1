package jp.co.systena.tigerscave.springtest;

public class Order {
	private int itemid;
	private int num;

    public Order(int itemid,int num) {
		this.itemid = itemid;
    	this.num = num;
    }

    public void setItemId(int itemid) {
        this.itemid = itemid;
    }

    public int getItemId() {
        return itemid;
    }

    public void setNum(int num) {
        this.num = num;
      }

    public int getNum() {
        return num;
    }

}
