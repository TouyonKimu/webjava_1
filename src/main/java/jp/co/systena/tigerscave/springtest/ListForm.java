package jp.co.systena.tigerscave.springtest;

public class ListForm{
	  private Item  item;
	  private int  num,price,itemid;
	  private String name;

	  public void setItem(Item item){
	    this.item = item;
	  }
	  public Item getItem(){
	    return this.item;
	  }

	  public void setNum(int num){
	    this.num = num;
	  }
	  public int  getNum(){
	    return this.num;
	  }

	  public void setPrice(int price){
	    this.price = price;
	  }
	  public int  getPrice(){
	    return this.price;
	  }

	  public void setItemid(int itemid){
	    this.itemid = itemid;
	  }
	  public int  getItemid(){
	    return this.itemid;
	  }

	  public void setName(String name){
	    this.name = name;
	  }
	  public String  getName(){
	    return this.name;
	  }

	}