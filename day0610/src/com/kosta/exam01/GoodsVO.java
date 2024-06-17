package com.kosta.exam01;

public class GoodsVO {
	
	private int no;
	private String item;
	private int sqt;
	private int price;
	
	
	public GoodsVO() {
		super();
	}
	public GoodsVO(int no, String item, int sqt, int price) {
		super();
		this.no = no;
		this.item = item;
		this.sqt = sqt;
		this.price = price;
	}
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getSqt() {
		return sqt;
	}
	public void setSqt(int sqt) {
		this.sqt = sqt;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "GoodsVO [no=" + no + ", item=" + item + ", sqt=" + sqt + ", price=" + price + "]";
	}

	
	
}
