package com.javastudy.ch03.conditional;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 7세 이하(미취학생) : 0원, 13세 이하(초등학생) : 500원
		* 19세 이하(중 고등학생) : 1000원, 그 외(일반인) : 2000원
		**/
		 int age = 9;
		 int charge = 0;
		 String msg = "";
		 
		 
		 if(age <= 7) { // 7세 이하
			 msg = "미취학생";
			 charge = 0;
		 } 
		 else if(age <= 13) { // 7세 이하
			 msg = "유치원생";
			 charge = 500;
		 } 
		 else if(age <= 19) { // 13세 이하
			 msg = "초등학생";
			 charge = 1000;
		 } 
		 else {
			 msg = "성인";
			 charge = 2000;
		 }
		 
		 System.out.println( age + "살로 " + msg + "이며, " + "입장료는" + charge + "원 입니다.");	
	}
	
}
