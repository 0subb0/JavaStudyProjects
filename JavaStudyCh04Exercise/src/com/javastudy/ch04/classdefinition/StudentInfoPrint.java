package com.javastudy.ch04.classdefinition;

public class StudentInfoPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student stu1 = new Student();
		Student stu2 = new Student();
		Student stu3 = new Student();
		
		stu1.name = "강바람";
		stu1.age = 20;
		stu1.gender = "남성";
		stu1.address = "인천시 부평구 부개동";
		
		stu2.name = "오빛나";
		stu2.age = 21;
		stu2.gender = "여성";
		stu2.address = "서울시 영등포구 당산동";
		
		stu3.name = "어머나";
		stu3.age = 25;
		stu3.gender = "여성";
		stu3.address = "부산시 해운대구 반여동";
		
		System.out.printf("이름 : %s, 나이 : %d, 성별 : %s, 주소 : %s", stu1.name, stu1.age, stu1.gender, stu1.address);
		System.out.println();
		System.out.printf("이름 : %s, 나이 : %d, 성별 : %s, 주소 : %s", stu2.name, stu2.age, stu2.gender, stu2.address);
		System.out.println();
		System.out.printf("이름 : %s, 나이 : %d, 성별 : %s, 주소 : %s", stu3.name, stu3.age, stu3.gender, stu3.address);

	}

}
