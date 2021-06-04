package com.javaex.ex04;

public class Base {
    
	// 필드
//	private String state;
	
	
	
	// 생성자
	
	
	
	// 메소드 게터세터
	
	
	
	// 메소드 일반
    public void service(String state) {
        //코드작성할것
    	if ( state.equals("낮") ) {
//    		System.out.println("낮에는 열심히 수업듣자");
    		this.day();
    	} else if ( state.equals("밤") ) {
//    		System.out.println("밤에는 숙면");
    		this.night();
    	} else {
//    		System.out.println("오후도 낮과 마찬가지로 공부해야 합니다.");
    		this.afternoon();
    	}
    }

    public void day() {
        System.out.println("낮에는 열심히 수업듣자");
    }

    public void night() {        
    	//코드작성할것
    	 System.out.println("밤에는 숙면");
    }
    
    public void afternoon(){
        System.out.println("오후도 낮과 마찬가지로 공부해야 합니다.");
    }
}

