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
	
	@Override
	public void walk() {
		System.out.println("This bird cant walk");
	}
	
	@Override
	public void swim() {
		System.out.println("This bird cant swim");
	}
	
}