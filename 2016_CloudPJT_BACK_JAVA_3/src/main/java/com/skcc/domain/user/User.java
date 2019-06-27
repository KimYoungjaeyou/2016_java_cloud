package com.skcc.domain.user;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@Entity
@Table(name="users")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@ApiModel(description = "공연장 정보에 대한 정보입니다.")
public class User {
	
	@ApiModelProperty(notes = "회원 ID입니다.")
	@Id
	private String user_id;
	
	@ApiModelProperty(notes = "회원 PW입니다.")
	@Column (nullable = true)
	private String user_password;
	
	@ApiModelProperty(notes = "회원 명 입니다.")
	private String user_name;
	
	@ApiModelProperty(notes = "회원의 휴대폰 정보입니다.")
	private String phone_num;
	
	@ApiModelProperty(notes = "해당 정보가 등록 된 시간입니다.")
	private Date reg_dt;
	
	@ApiModelProperty(notes = "해당 정보가 수정 된 시간입니다.")
	private Date upd_dt;

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getPhone_num() {
		return phone_num;
	}

	public void setPhone_num(String phone_num) {
		this.phone_num = phone_num;
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
	
	
}
