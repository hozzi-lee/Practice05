package com.javaex.ex07;

public class Friend {

    private String name;
    private String hp;
    private String school;

    
    // getter/setter 작성
    public void setName(String name) {
    	this.name = name;
    }
    public void setHp(String hp) {
    	this.hp = hp;
    }
    public void setSchool(String school) {
    	this.school = school;
    }
    
    public String getName() {
    	return name;
    }
    public String getHp() {
    	return hp;
    }
    public String getSchool() {
    	return school;
    }
    
    
    
    public void showInfo(){
        System.out.println("이름:"+name+"\t핸드폰:"+hp+"\t학교:"+school);
    }

}
