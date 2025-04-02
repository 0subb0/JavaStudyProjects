package com.javastudy.ch04.overloading;

public class Member {

	private String name;
	private int age;
	private String id;
	private String pw;
	private String gender;
	private String address;
	
	public Member (String name, int age) {
		// TODO Auto-generated constructor stub
		this(name, age, "hong", "1234", "남성", "서울 구로구 구로동 1번지");
			
	}
	
	public Member (String name, int age, String id, String pw) {
		// TODO Auto-generated constructor stub
		this(name, age, id, pw, "남성", "서울 강서구 화공동 3번지");
	}
	
	public Member(String name, int age, String id, String pw, String gender, String address) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.age = age;
		this.id = id;
		this.pw = pw;
		this.gender = gender;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	// 이름 : 홍길동, 나이 : 25, 아이디 : hong, 비밀번호 : 1234, 성별 : 남성, 주소 : 서울 구로구 구로동 1번지
	public String toString() {
		return "이름 : " + name + ", 나이 : " + age + ", 아이디 : " + id + ", 비밀번호 : " + pw + ", 성별 : " + gender + ", 주소 : " + address ;
	}
	
}
