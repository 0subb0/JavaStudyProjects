package com.javastudy.ch03.forwhile;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		정수 33부터 ~ 235까지 홀수와 짝수의 개수를 구하여 아래와 같이 출력하는 프로그램을 작성하시오.
		
		int i = 0;
		int odd_count = 0;
		int even_count = 0;
	
		for(i = 33; i <= 235; i++) {
			if(i % 2 == 0) {
				even_count += 1;
			} 
//			합이 아닌 개수 누적
		
			else {
				odd_count += 1;
			}
		}
		
		System.out.println("33부터 ~ 235까지 홀수의 개수 : " + odd_count);
		System.out.println("33부터 ~ 235까지 짝수의 개수 : " + even_count);
		
		
	}

}
