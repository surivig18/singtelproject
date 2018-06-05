package com.singtel.domain;

public class Mammal implements Animal {

	@Override
	public void swim(){
		System.out.println("Mammals dont swim");
	}
	
	@Override
	public void fly(){
		System.out.println("Mammals dont fly");

	}
}
