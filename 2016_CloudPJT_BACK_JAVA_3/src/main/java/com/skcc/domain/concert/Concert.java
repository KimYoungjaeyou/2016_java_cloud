package com.skcc.domain.concert;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@Entity
@Table(name="concerts")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@ApiModel(description = "공연장 정보에 대한 정보입니다.")
public class Concert {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@ApiModelProperty(notes = "공연장 ID입니다.")
	private int concert_id;
	
	@ApiModelProperty(notes = "공연장 명 입니다.")
	private String concert_name;
	
	@ApiModelProperty(notes = "장소에 대한 정보입니다.")
	private String place;
	
	@ApiModelProperty(notes = "시간당 대여 금액입니다.")
	private int price;
	
	@ApiModelProperty(notes = "해당 정보가 등록 된 시간입니다.")
	private Date reg_dt;
	
	@ApiModelProperty(notes = "해당 정보가 수정 된 시간입니다.")
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
