package com.javastudy.ch05.inheritance;

public class Human extends Animal {
	
	private String hobby;

	public Human(String name, String species, int age, String sound, String hobby) {
		// TODO Auto-generated constructor stub
		
		super(name, species, age, sound);
		
		this.hobby = hobby;
		
	}
	
	public void eat(){
		System.out.println(getName() + "는 "+ getSpecies() + "으로 아침을 먹습니다");  
	}
	public void cry(){
		System.out.println(getName() + "는 "+ getSpecies() + "으로 " + getSound() + " 웁니다");
	}
	
	public String toString () {
		return getName() + "는"+ getSpecies() + "으로 " + getAge() +"살 이며 " + hobby +  "입니다";
	}
}
