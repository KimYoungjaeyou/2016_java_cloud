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

import lombok.Data;

@Entity
@Data
@Table(name="books")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int book_id;
	
	@Column (name="user_id",nullable = true)
	private String userId;
	
	@Column (nullable = true)
	private int concert_id;
	
	private Date book_start_time;
	
	private Date book_end_time;
	
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
