package com.javastudy.ch04.member;

public class Calculator {

	public int result;
	
//	다른 곳에서도 쓸 수 있게 퍼블릭 접근제어자 사용
	public int add(int num1, int num2) {
		result = num1 + num2;
		return result;
	}
	
	public int minus(int num3, int num4) {
		result = num3 - num4;
		return result;
	}
	
	public int mul(int num5, int num6) {
		result = num5 * num6;
		return result;
	}
	
	public int divide(int num7, int num8) {
		result = num7 / num8;
		return result;
	}
}
