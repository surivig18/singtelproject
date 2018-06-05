package com.singtel.domain;

public interface Animal {
	 default void walk(){
		System.out.println("I am walking");
	}
	 default void fly(){
			System.out.println("I am flying");
		}
	 default void sing(){
			System.out.println("I am singing");
		}
}