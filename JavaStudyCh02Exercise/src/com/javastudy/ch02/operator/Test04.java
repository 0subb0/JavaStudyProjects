package com.javastudy.ch02.operator;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[실행결과]");
		System.out.printf("입력된 숫자는 : ");
		int input_num = scan.nextInt();
		
//		삼항연산자 
		System.out.printf(input_num % 9 == 0 ? "%d(으)로 9의 배수 입니다." : input_num % 9 != 0 ? "%d(으)로 9의 배수가 아닙니다." : "다시 입력해주세요", input_num, input_num);
		
		scan.close();
		
		
	}

}
