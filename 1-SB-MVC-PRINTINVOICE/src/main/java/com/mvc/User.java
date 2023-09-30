package com.mvc;

public class User {
	private int pid;
	private String pname;
	private int Quantity;
	private double total;
	private double price;
	public User() {
		super();
	}
	

	public User(int pid, String pname, int quantity, double total, double price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.Quantity = quantity;
		this.total = total;
		this.price = price;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}



	@Override
	public String toString() {
		return "User [pid=" + pid + ", pname=" + pname + ", Quantity=" + Quantity + ", total=" + total + ", price="
				+ price + "]";
	}
	

}
