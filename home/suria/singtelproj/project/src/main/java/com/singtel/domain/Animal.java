package com.singtel.domain;

import com.singtel.helperinterfaces.FlyInterface;
import com.singtel.helperinterfaces.SingInterface;
import com.singtel.helperinterfaces.SwimInterface;

public interface Animal extends SingInterface,SwimInterface,FlyInterface {
	 default void walk(){
		System.out.println("I am walking");
	}
}