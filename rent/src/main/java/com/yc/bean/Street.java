package com.yc.bean;

import java.io.Serializable;

public class Street implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6056626762881298524L;
	private int id;
	private String name;
	private District district;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public District getDistrict() {
		return district;
	}

	public void setDistrict(District district) {
		this.district = district;
	}

	@Override
	public String toString() {
		return "Street [id=" + id + ", name=" + name + ", district=" + district
				+ "]";
	}
}
