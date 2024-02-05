package com.example.otorepair.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="serviceparts")
public class ServicePart {
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	@Column(name="id")
	private int id;
	@ManyToOne()
	@JoinColumn(name="servicecart")
	private ServiceCart serviceCart;
	@Column(name="otopartname")
	private String otoPartName;
	@Column(name="quantity")
	private double quantity;
	@Column(name="price")
	private double price;
	public ServicePart() {
		super();
	}
	public ServicePart(int id, ServiceCart serviceCart, String otoPartName, int quantity, double price) {
		super();
		this.id = id;
		this.serviceCart = serviceCart;
		this.otoPartName = otoPartName;
		this.quantity = quantity;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ServiceCart getServiceCart() {
		return serviceCart;
	}
	public void setServiceCart(ServiceCart serviceCart) {
		this.serviceCart = serviceCart;
	}
	public String getOtoPartName() {
		return otoPartName;
	}
	public void setOtoPartName(String otoPartName) {
		this.otoPartName = otoPartName;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
