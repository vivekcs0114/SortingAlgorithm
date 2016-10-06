package com.avalia.example;

public class OverLoadExample {
	public int add(int s, float f) {
		return 0;
	}

	public int add(Integer a, float f) {
		return 1;
	}
	public String add(float f, String a) {
		return a;
	}

}
