package com.javastudy.ch04.classdefinition;

public class ProductPrint {

	public static void main(String[] args) {
	
		//	아메리카노 1+1(2990), 제조사 : 스타벅스, 상품설명 : 스타벅스 오리지날 아메리카노 커피 1+1
		//	뉴그랜저(32500000), 제조사 : 현대자동차, 상품설명 : 3000cc 동급 최강 승용차
		//	데스크탑5(799000), 제조사 : 삼성전자, 상품설명 : CUP 6코어 i5 10400F 4.3GH
			
		Product p1 = new Product("아메리카노 1+1", 2990, "스타벅스", "스타벅스 오리지날 아메리카노 커피 1+1");
		Product p2 = new Product("뉴그랜저", 32500000, "현대자동차", "3000cc 동급 최강 승용차");
		Product p3 = new Product("데스크탑5", 799000, "삼성전자", "CUP 6코어 i5 10400F 4.3GH");
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
	}
	
}
