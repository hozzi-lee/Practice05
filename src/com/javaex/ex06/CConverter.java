package com.javaex.ex06;

public class CConverter {
    
	// 필드
    public static double rate;
    public static double won;
    public static double dollar;
    
    
    
    // 메소드 게터세터
    public static void setRate(double rate){
        CConverter.rate = rate;
    }
    
    
    
    // 메소드 일반
    public static double toDollar(double won){
        return won / rate;
    }

    public static double toKWR(double dollar){
        return dollar * rate;
    }
    

}
