package com.avalia.example;

class Parant {
	String name;
	int age;

	public Parant(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println(this.hashCode());
	}
}

class Child extends Parant {
	int rollno;
	int marks;

	public Child(String name, int age, int rollno, int marks) {
		super(name, age);
		this.rollno = rollno;
		this.marks = marks;
		System.out.println(this.hashCode());
	}
	public String toString(){
		return name+"/"+age+"/"+rollno+"/"+marks;
	}
}

 class Constructor {
	public static void main(String[] args) {
		Child c = new Child("vivek", 22, 114, 76);
		System.out.println(c);
		System.out.println(c.hashCode());
	}
}