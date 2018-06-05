package com.singtel.factory;

import com.singtel.constants.AnimalConstants;
import com.singtel.domain.ButterFly;
import com.singtel.helperinterfaces.FlyInterface;
import com.singtel.helperinterfaces.TransformedButterFly;

public class ButterFlyFacory {

	
	public Object getInstance(String typeOfAnimal) {
		if(typeOfAnimal.equalsIgnoreCase(AnimalConstants.BUTTERFLLY))
		{
			FlyInterface flyInterface = new ButterFly();
			return flyInterface;
		}
		if(typeOfAnimal.equalsIgnoreCase(AnimalConstants.TRANSFROMEDFLY)){
			TransformedButterFly transformedButterFly = new ButterFly();
			return transformedButterFly;
		}
		return new ButterFly();
		
	}

}
