package com.javaex.ex09;

public class StringUtil {

	private static String concatString = "";

	// 메소드
	public static String concatString(String[] strArray) {


		//메소드 내용작성
		for ( int i = 0; i < strArray.length; i++ ) {
			concatString += strArray[i];
		}

		return concatString;
	}

}
