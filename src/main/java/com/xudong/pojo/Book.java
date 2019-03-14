package com.xudong.pojo;

import java.util.Date;

public class Book {

	private int bookId;
	private String bookName;
	private double price;
	private Date bookTime;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getBookTime() {
		return bookTime;
	}
	public void setBookTime(Date bookTime) {
		this.bookTime = bookTime;
	}
	public Book(int bookId, String bookName, double price, Date bookTime) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.price = price;
		this.bookTime = bookTime;
	}
	public Book() {
		super();
	}
	
	
}
