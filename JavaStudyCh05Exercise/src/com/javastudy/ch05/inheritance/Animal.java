package com.javastudy.ch05.inheritance;

public class Animal {

	private String name;
	private String species;
	private int age;
	private String sound;
	
	public Animal(String name, String species, int age, String sound) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.species = species;
		this.age = age;
		this.sound = sound;
		
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	
	public void eat(){
//		System.out.println("부모클래스 eat()");
		
		return ;
	}
	public void cry(){
//		System.out.println("부모클래스 cry()");
		
		return ;
	}
	
	@Override
	public String toString () {
		return "부모클래스";
	}

}
