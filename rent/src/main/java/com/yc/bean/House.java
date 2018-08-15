package com.yc.bean;

import java.io.Serializable;

public class House implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8057099341241970351L;
	private int id;
	private int user_id;
	private int type_id;
	private String title;
	private String description;
	private double price;
	private String pubDate;
	private String floorage;
	private String contact;
	private HouseType houseType;
	private Street street;

	private District district;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getType_id() {
		return type_id;
	}

	public void setType_id(int type_id) {
		this.type_id = type_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPubDate() {
		return pubDate;
	}

	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}

	public String getFloorage() {
		return floorage;
	}

	public void setFloorage(String floorage) {
		this.floorage = floorage;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public Street getStreet() {
		return street;
	}

	public void setStreet(Street street) {
		this.street = street;
	}

	public District getDistrict() {
		return district;
	}

	public void setDistrict(District district) {
		this.district = district;
	}

	@Override
	public String toString() {
		return "House [id=" + id + ", user_id=" + user_id + ", type_id="
				+ type_id + ", title=" + title + ", description=" + description
				+ ", price=" + price + ", pubDate=" + pubDate + ", floorage="
				+ floorage + ", contact=" + contact + ", houseType="
				+ houseType + ", street=" + street + ", district=" + district
				+ "]";
	}

	public HouseType getHouseType() {
		return houseType;
	}

	public void setHouseType(HouseType houseType) {
		this.houseType = houseType;
	}

}
