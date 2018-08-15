package com.yc.bean;

import java.util.ArrayList;
import java.util.List;

public class District {

	private int id;
	private String name;
	private List<Street> streets = new ArrayList<Street>();
	public District() {
		// TODO Auto-generated constructor stub
	}
	
	public District(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

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

	public List<Street> getStreets() {
		return streets;
	}

	public void setStreets(List<Street> streets) {
		this.streets = streets;
	}

	@Override
	public String toString() {
		return "District [id=" + id + ", name=" + name + ", streets=" + streets
				+ "]";
	}

}
