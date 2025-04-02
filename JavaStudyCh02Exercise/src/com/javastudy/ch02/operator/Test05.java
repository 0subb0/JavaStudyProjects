package com.javastudy.ch02.operator;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Scanner scan = new Scanner(System.in);
		
		System.out.println("[실행결과]");
		System.out.printf("알파벳 한 자를 입력해주세요 : ");
		String input = scan.next();
		
		char ch = input.charAt(0);
		
		System.out.println(ch >= 'A' && ch <= 'Z' ? "첫 번째 입력된 문자는 영문 대문자 입니다." : "첫 번째 입력된 문자는 영문 소문자 입니다.");
		
		scan.close();
		
	}

}
