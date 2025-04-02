package com.javastudy.ch05.inheritance;

public class Dog extends Animal {

	public Dog(String name, String species, int age, String sound) {
		// TODO Auto-generated constructor stub
		
		super(name, species, age, sound);
		
		
	}
	
	@Override
	public void eat(){
		System.out.println(getName() + "는 "+ getSpecies() + "로 사료를 먹습니다");
		
		super.eat();
	}
	
	@Override
	public void cry(){
		System.out.println(getName() + "는 "+ getSpecies() + "로 " + getSound() + " 짖습니다");
		
		super.eat();
	}
	
	@Override
	public String toString () {
		return getName() + "은(는) "+ getSpecies() + "로 " + getAge() + "살 입니다";
	}

}
