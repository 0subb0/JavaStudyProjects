package com.javastudy.ch03.forwhile;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		아래와 같이 50부터 ~ 100까지 3의 배수이면서 6의 배수가 아닌 정수와 그 배수의 개수 그리고 그
//		배수의 합계를 출력하는 프로그램을 작성하시오.
	
		System.out.println("### 50부터 ~ 100까지 3의 배수 이면서 6의 배수가 아닌 수 구하기 ###");
		
		final int n = 3;
		final int n2 = 6;
		int count = 0;
		int sum = 0;
		String nums = "";
		
		for(int i = 50; i <= 100; i++) {

			if(i % n == 0) {
				if(i % n2 != 0) {
				
					nums += (100 - n >= i) ? i + ", " : i;
					
					sum += i;

					count += 1;
				}

			}
		}
		
		System.out.println("3의 배수이면서 6의 배수가 아닌 수 :" + nums);
		System.out.printf("3의 배수이면서 6의 배수가 아닌 정수의 개수 : %d\n" , count);
		System.out.printf("3의 배수이면서 6의 배수가 아닌 정수의 합 : %d" , sum);

	}

}
