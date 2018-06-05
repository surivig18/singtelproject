package com.singtel.domain;
public class Bird implements Animal {
	
	@Override
	public void fly() {
		System.out.println("Bird flying");
	}
	@Override
	public void sing() {
		System.out.println("Bird singing");
	}
}