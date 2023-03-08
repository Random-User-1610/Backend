package com.example.demo;

import jakarta.persistence.Entity ;
import jakarta.persistence.Id;

@Entity
public class Model {

	@Id
	private int car_Id;
	private String car_name;
	private String car_no_Plate;
	private String is_available;
	private int price;
	
	public Model() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Model(int car_Id, String car_name, String car_no_Plate, String is_available, int price) {
		super();
		this.car_Id = car_Id;
		this.car_name = car_name;
		this.car_no_Plate = car_no_Plate;
		this.is_available = is_available;
		this.price = price;
	}
	public int getCar_Id() {
		return car_Id;
	}
	public void setCar_Id(int car_Id) {
		this.car_Id = car_Id;
	}
	public String getCar_name() {
		return car_name;
	}
	public void setCar_name(String car_name) {
		this.car_name = car_name;
	}
	public String getCar_no_Plate() {
		return car_no_Plate;
	}
	public void setCar_no_Plate(String car_no_Plate) {
		this.car_no_Plate = car_no_Plate;
	}
	public String getIs_availabel() {
		return is_available;
	}
	public void setIs_availabel(String is_available) {
		this.is_available = is_available;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
