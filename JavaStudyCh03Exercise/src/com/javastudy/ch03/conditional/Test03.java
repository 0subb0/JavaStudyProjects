package com.javastudy.ch03.conditional;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 75;
		String str = "";
		
		switch(score / 10) {


		 case 9 : 
			 str = "A";
			 break;
		 case 8 :
			 str = "B";
			 break;
		 case 7 :
			 str = "C";
			 break;
		 case 6 :
			 str = "D";
			 break;
		 default :
			 str = "F";
			 break;
		 }
		 System.out.printf("당신의 점수는 %d점으로 %s 학점 입니다.", score, str);
	}
}
