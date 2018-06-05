package com.singtel.domain;

public class Shark extends Fish{

	public Shark(){
		this.color = "Gray";
		this.size = "Large";
	}
	
	public void eat(Fish fish){
		System.out.println("Shark is eating" + fish.getClass());
	}
}
