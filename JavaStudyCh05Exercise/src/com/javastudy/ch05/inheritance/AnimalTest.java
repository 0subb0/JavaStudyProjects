package com.javastudy.ch05.inheritance;

public class AnimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human h = new Human("철수", "사람", 15, "엉엉", "독서");
		Cat c = new Cat("야옹이", "고양이", 3, "야옹");
		Dog d = new Dog("희망이", "강아지", 5, "멍멍");
		
	
		d.eat();
		d.cry();
		System.out.println(d.toString());
		System.out.println();
		
		c.eat();
		c.cry();
		System.out.println(c.toString());
		System.out.println();
		
		h.eat();
		h.cry();
		System.out.println(h.toString());
		
		
	}

}
