package com.javastudy.ch02.operator;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//	 1. 정수형 변수 x, y를 선언과 동시에 각각 15와 7로 초기화 하시오.
//	 2. 실수형(float) 변수 f1, f2를 먼저 선언하고 그 아래에서 각각 15.0과 7.0으로 초기화 하시오.
//	 3. x, y를 사칙 연산한 결과와 나머지 연산한 결과를 출력하시오.
//	 4. f1, f2를 나눗셈, 곱셈한 결과와 나머지 연산한 결과를 출력하시오.
//	 5. [연습문제 2-1]과 같은 패키지에 새로운 클래스를 생성하여 작성하시오
		int x = 15;
		int y = 7;
		
		float f1 = 15.0f;
		float f2 = 7.0f;
		
//		사칙연산
		System.out.println("15 + 7 = " + (x + y)); 
		System.out.printf("%d + %d = %d \n ", x, y, x + y); 
		
		System.out.printf("%d - %d = %d \n", x, y, x - y);
		System.out.println("15 / 7 = " + (x / y));
		System.out.println("15 * 7 = " + (x * y));

		
		
		

	}

}
