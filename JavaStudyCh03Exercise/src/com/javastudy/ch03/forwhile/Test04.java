package com.javastudy.ch03.forwhile;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		반복문을 사용해 아래와 같이 1부터 ~ 60까지의 수를 한 줄에 10단위씩 출력하는 프로그램을 작성	하시오.

		int i = 0;
		String nums = "";
		

		for(i = 1; i <= 60; i++) {
			if(i % 10 == 0) {
				nums += i + "\n";
			}
			
			else {
				nums += (120 - i >= i) ?  i + ", " : i;
			}
		}
		
		System.out.println("[실행결과]");
		System.out.println(nums);
		
		
	}

}
