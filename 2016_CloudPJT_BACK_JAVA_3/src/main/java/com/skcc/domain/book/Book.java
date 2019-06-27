package com.skcc.domain.book;

import java.util.Date;

import javax.persistence.Column;
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
@Table(name="books")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@ApiModel(description = "예약에 대한 객체 정보입니다.")
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@ApiModelProperty(notes = "예약 ID입니다.")
	private int book_id;
	
	@ApiModelProperty(notes = "회원 ID입니다.")
	@Column (name="user_id",nullable = true)
	private String userId;
	
	@ApiModelProperty(notes = "공연장의 ID입니다.")
	@Column (nullable = true)
	private int concert_id;
	
	@ApiModelProperty(notes = "예약 시작 시간입니다.")
	private Date book_start_time;
	
	@ApiModelProperty(notes = "예약 종료 시간입니다.")
	private Date book_end_time;
	
	@ApiModelProperty(notes = "예약 상태 입니다. 예약신청, 예약완료, 예약취소가 있습니다.")
	@Enumerated(EnumType.STRING)
    private Status book_status;

	public int getBook_id() {
		return book_id;
	}

	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}

	public String getUser_id() {
		return userId;
	}

	public void setUser_id(String userId) {
		this.userId = userId;
	}

	public int getConcert_id() {
		return concert_id;
	}

	public void setConcert_id(int concert_id) {
		this.concert_id = concert_id;
	}

	public Date getBook_start_time() {
		return book_start_time;
	}

	public void setBook_start_time(Date book_start_time) {
		this.book_start_time = book_start_time;
	}

	public Date getBook_end_time() {
		return book_end_time;
	}

	public void setBook_end_time(Date book_end_time) {
		this.book_end_time = book_end_time;
	}

	public Status getBook_status() {
		return book_status;
	}

	public void setBook_status(Status book_status) {
		this.book_status = book_status;
	}

	@Override
	public String toString() {
		return "Book [book_id=" + book_id + ", user_id=" + userId + ", concert_id=" + concert_id + ", book_start_time="
				+ book_start_time + ", book_end_time=" + book_end_time + ", book_status=" + book_status + "]";
	}

}
