package com.composite.all.CompositeKeyBean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CustomerBean")

public class CustomerBean implements Serializable {

	@Id
	private int pid;
	@Column(name = "pname")
	private String pname;
	@Id
	@Column(name = "price")
	private int price;

	public CustomerBean() {
		super();
	}

	public int getPid() {
		return pid;
	}

	public String getPname() {
		return pname;
	}

	public int getPrice() {
		return price;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}
