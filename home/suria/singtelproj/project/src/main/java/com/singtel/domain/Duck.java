package com.singtel.domain;

public class Duck extends Bird{

	@Override
	public void sing(){
		System.out.println("Quack, quack");
	}
	
	@Override
	public void swim(){
		System.out.println("Duck does swim unlike other birds!");
	}
}
