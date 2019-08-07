package jp.co.systena.tigerscave.springtest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ListService {
	private List<Item> itemList = new ArrayList<Item>();

	public ListService() {
		this.itemList.add(new Item(1, "商品A", 10000));
		this.itemList.add(new Item(2, "商品B", 20000));
		this.itemList.add(new Item(3, "商品C", 30000));
		this.itemList.add(new Item(4, "商品D", 40000));
		this.itemList.add(new Item(5, "商品E", 50000));
	}

    public List<Item> getItemList() {
        return this.itemList;
    }
}

