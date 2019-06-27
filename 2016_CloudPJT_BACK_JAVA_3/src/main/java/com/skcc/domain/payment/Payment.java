package com.skcc.domain.payment;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Entity
@Data
@Table(name="payments")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@ApiModel(description = "공연장 정보에 대한 정보입니다.")
public class Payment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@ApiModelProperty(notes = "결제 ID입니다.")
	private int payment_id;
	
	@ApiModelProperty(notes = "예약 ID입니다.")
	private int book_id;
	
	@ApiModelProperty(notes = "결제 상태입니다. 결제중, 결제완료, 결제취소가 있습니다.")
	@Enumerated(EnumType.STRING)
	private PaymentStatus payment_status;
	
	@ApiModelProperty(notes = "결제 방법입니다. 카드, 소액결제, 실시간계좌이체가 있습니다.")
	@Enumerated(EnumType.STRING)
	private PaymentMethod payment_method;
	
	@ApiModelProperty(notes = "공연장정보에 정의된 금액과 예약시간으로 결제 될 금액입니다.")
	private int payment_amount;
	
	@ApiModelProperty(notes = "해당 정보가 등록 된 시간입니다.")
	private Date reg_dt;
	
	@ApiModelProperty(notes = "해당 정보가 수정 된 시간입니다.")
	private Date upd_dt;

	public int getPayment_id() {
		return payment_id;
	}

	public void setPayment_id(int payment_id) {
		this.payment_id = payment_id;
	}

	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}

	public PaymentStatus getPayment_status() {
		return payment_status;
	}

	public void setPayment_status(PaymentStatus payment_status) {
		this.payment_status = payment_status;
	}

	public PaymentMethod getPayment_method() {
		return payment_method;
	}

	public void setPayment_method(PaymentMethod payment_method) {
		this.payment_method = payment_method;
	}

	public int getPayment_amount() {
		return payment_amount;
	}

	public void setPayment_amount(int payment_amount) {
		this.payment_amount = payment_amount;
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
