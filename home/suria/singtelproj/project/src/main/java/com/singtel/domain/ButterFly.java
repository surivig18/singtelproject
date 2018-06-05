package com.singtel.domain;

import com.singtel.helperinterfaces.FlyInterface;
import com.singtel.helperinterfaces.TransformedButterFly;

public class ButterFly implements Animal,TransformedButterFly,FlyInterface{

	
	@Override
	public void sing()
	{
		System.out.println("Butterfly cant sing or make sound");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		TransformedButterFly.super.walk();
	}
	
	
}
