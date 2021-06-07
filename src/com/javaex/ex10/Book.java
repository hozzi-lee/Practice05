package com.javaex.ex10;

public class Book {

	// 필드
	private int bookNo;
	private String title;
	private String author;
	private int stateCode = 1;


	// 생성자
	public Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
	}

	public Book(int stateCode) {
		this.stateCode = stateCode;
	}



	// 메소드 게터세터
	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}

	public int getBookNo() {
		return bookNo;
	}

	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}



	// 메소드 일반
	/*
	public void displayBookInfo(Book[] books) {
		for ( int i = 0; i < books.length; i++ ) {
			System.out.println(books[i]);
		}
	}
	 */

	public void rent() {
		//		this.stateCode = 0;
		System.out.println(getTitle() + "이(가) 대여 됐습니다");
	}

	public void print() {
		if ( stateCode == 1 ) {
			System.out.println(getBookNo() + ", " + getTitle() + ", " + getAuthor() + "대여 유무: 재고있음");
		} else if ( stateCode == 0 ) {
			System.out.println(getBookNo() + ", " + getTitle() + ", " + getAuthor() + "대여 유무: 대여중");
		}
	}

}
