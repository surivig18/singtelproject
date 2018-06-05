package com.singtel.domain;

import com.singtel.helperinterfaces.SingInterface;

public interface Animal extends SingInterface {
	 default void walk(){
		System.out.println("I am walking");
	}
	 default void fly(){
			System.out.println("I am flying");
		}
	 @Override
	 default void sing(){
			System.out.println("I am singing");
		}
	 default void swim(){
		 System.out.println("I am swimming");
	 }
}