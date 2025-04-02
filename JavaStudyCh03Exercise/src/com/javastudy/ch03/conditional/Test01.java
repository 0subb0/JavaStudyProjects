package com.javastudy.ch03.conditional;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 /* 6세 이하(미취학생), 7세 이하(유치원생), 13세 이하(초등학생), 
		* 16세 이하(중학생), 19세 이하(고등학생), 그 외(성인)
		 **/
		 int age = 20;
		 String msg = "";
//		 String은 문자열을 담는 자료형이라 쌍따옴표
//		 Char는 문자를 담는 자료형이라 홑따옴표
		 
		 if(age <= 6) { // 6세 이하
			 msg = "미취학생";
			 System.out.println("나이가" + age + "세로 " + msg + "입니다");
		 } 
		 else if(age <= 7) { // 7세 이하
			 msg = "유치원생";
			 System.out.println("나이가" + age + "세로 " + msg + "입니다");
		 } 
		 else if(age <= 13) { // 13세 이하
			 msg = "초등학생";
			 System.out.println("나이가" + age + "세로 " + msg + "입니다");
		 } 
		 else if(age <= 16) { // 16세 이하
			 msg = "중학생";
			 System.out.println("나이가" + age + "세로 " + msg + "입니다");
		 } 
		 else if(age <= 19) { // 19세 이하
			 msg = "고등학생";
			 System.out.println("나이가" + age + "세로 " + msg + "입니다");
		 }
		 else {
			 msg = "성인";
			 System.out.println("나이가" + age + "세로 " + msg + "입니다");
		 }
		 
	}
}
