package com.ustglobal.finalproject.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Order_Info")
public class OrderInfo {
	@Id
	@Column
	private int oid;
	@Column
	private double total_price;
	@Column
	private double total_price_with_gst;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "Order_history_info", joinColumns = @JoinColumn(name = "oid"), inverseJoinColumns = @JoinColumn(name = "id"))
	private List<Product> product;

	public int getOid() {
		return oid;
	}

	public void setOid(int oid) {
		this.oid = oid;
	}

	public double getTotal_price() {
		return total_price;
	}

	public void setTotal_price(double total_price) {
		this.total_price = total_price;
	}

	public double getTotal_price_with_gst() {
		return total_price_with_gst;
	}

	public void setTotal_price_with_gst(double total_price_with_gst) {
		this.total_price_with_gst = total_price_with_gst;
	}
}
