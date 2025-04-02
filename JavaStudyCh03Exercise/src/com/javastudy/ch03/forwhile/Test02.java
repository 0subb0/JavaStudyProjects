package com.javastudy.ch03.forwhile;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		100부터 ~ 150까지 정수에서 7의 배수와 7의 배수의 개수를 아래와 같이 출력하는 프로그램을 작
//		성해 보자. 단, 7의 배수를 출력할 때는 삼 항 연산자를 활용해 아래와 같이 쉼표(,)로 구분하여 출
//		력하고 맨 마지막 배수만 쉼표(,)를 생략해 출력해 보자.
	
		
		final int num = 7;
		int count = 0;
		String nums = "";
		
		for(int i = 100; i <= 150; i++) {

			if(i % num == 0) {
				
				nums += (150 - num >= i) ? i + ", " : i;

				count += 1; 
			}
		}
		
		System.out.println("100부터 ~ 150까지 7의 배수 : " + nums);
		System.out.println("100부터 ~ 150까지 7의 배수의 개수 : " + count);
	}

}
