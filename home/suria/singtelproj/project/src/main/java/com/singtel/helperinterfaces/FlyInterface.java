package com.singtel.helperinterfaces;

public interface FlyInterface {
	default void fly(){
		System.out.println("I am flying");
	}

}
