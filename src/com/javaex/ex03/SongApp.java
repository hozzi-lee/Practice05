package com.javaex.ex03;

public class SongApp {

	public static void main(String[] args){
		
		Song s1 = new Song("좋은날", "아이유", "Real", "이민수", "2010", 3);
		// "좋은날", "아이유", "Real", "이민수", "2010" --> 피라미터 5개 생성자
		// 피라미터 5개 생성자this(adasdasd) + 3 --> 피라미터 6개 생성자
		s1.showInfo(); // System.out.println(title + artist + album + composer + year + track);
		
	}

}


