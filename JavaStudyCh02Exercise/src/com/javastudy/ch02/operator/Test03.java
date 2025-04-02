package com.javastudy.ch02.operator;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		★☆ 키보드 입력을 받는 역할 ★☆
		Scanner scan = new Scanner(System.in);
		
		System.out.println("[실행결과]");
		System.out.printf("입력된 숫자는 : ");
		int input_num = scan.nextInt();
		
		System.out.printf(input_num % 2 == 0 ? "%d(으)로 짝수 입니다." : input_num % 2 != 0 ? "%d(으)로 홀수 입니다." : "다시 입력해주세요", input_num, input_num);
		
		scan.close();
		
		
	}

}
