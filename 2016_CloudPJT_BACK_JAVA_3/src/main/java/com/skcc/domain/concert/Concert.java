package com.skcc.domain.concert;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@Entity
@Table(name="concerts")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Concert {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int concert_id;
	
	private String concert_name;
	
	private String place;
	
	private int price;
	
	private Date reg_dt;
	
	private Date upd_dt;

	public int getConcert_id() {
		return concert_id;
	}

	public void setConcert_id(int concert_id) {
		this.concert_id = concert_id;
	}

	public String getConcert_name() {
		return concert_name;
	}

	public void setConcert_name(String concert_name) {
		this.concert_name = concert_name;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Date getReg_dt() {
		return reg_dt;
	}

	public void setReg_dt(Date reg_dt) {
		this.reg_dt = reg_dt;
	}

	public Date getUpd_dt() {
		return upd_dt;
	}

	public void setUpd_dt(Date upd_dt) {
		this.upd_dt = upd_dt;
	}

	@Override
	public String toString() {
		return "Concert [concert_id=" + concert_id + ", concert_name=" + concert_name + ", place=" + place + ", price="
				+ price + ", reg_dt=" + reg_dt + ", upd_dt=" + upd_dt + "]";
	}
	
	
	
}
