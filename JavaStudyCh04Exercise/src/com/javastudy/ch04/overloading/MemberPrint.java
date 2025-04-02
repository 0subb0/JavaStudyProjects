package com.javastudy.ch04.overloading;

public class MemberPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Member m1 = new Member("홍길동", 25);
		Member m2 = new Member("이순신", 30, "leesunshin", "4321");
		Member m3 = new Member("유관순", 35, "midas", "1111", "여성", "경기도 부천시 오정구 고강동");
		
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println(m3.toString());
		
	}

}
