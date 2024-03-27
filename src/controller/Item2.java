package controller;

import java.util.HashMap;

import beans.ItemBean;
import view.ItemView;

public class Item2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//商品の作成
		ItemBean itemBean1 = new ItemBean("001", "商品名1", 1000, 100);
		ItemBean itemBean2 = new ItemBean("002", "商品名2", 2000, 200);
		ItemBean itemBean3 = new ItemBean("003", "商品名3", 3000, 300);
		
		// HashMapの作成
		HashMap<String, ItemBean> itemMap = new HashMap<String, ItemBean>();
		// 要素の追加
		itemMap.put(itemBean1.getItemID(), itemBean1);
		itemMap.put(itemBean2.getItemID(), itemBean2);
		itemMap.put(itemBean3.getItemID(), itemBean3);
		
		// ItemViewのHasuMapで使うため キー管理されたオブジェクトを渡す
		ItemView.itemView(itemMap);
		


	}

}
