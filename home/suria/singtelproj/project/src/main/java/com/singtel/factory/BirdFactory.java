package com.singtel.factory;

import com.singtel.domain.Bird;

public class BirdFactory extends AnimalFactory{

	@Override
	public Bird  getInstance() {
		// TODO Auto-generated method stub
		return new Bird();
	}
	

}
