package com.javastudy.ch02.operator;

import java.util.Scanner;

public class AgeClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("태어난 년도를 4자리로 입력해주세요 : ");
		int birthYear = scan.nextInt();
		
		// 현재 연도 가져오기
        int currentYear = 2025; 
        
        // 나이 계산
        int age = (currentYear - birthYear) + 1;

		
		// 포맷팅 문자열 출력
		System.out.printf("당신은 %d년 생으로 현재 %d세 입니다", birthYear, age);
		
		// Scanner 사용이 끝나면 자원을 해제한다.
		scan.close();

	}

}
