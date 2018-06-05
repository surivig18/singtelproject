package com.singtel.factory.util;

import com.singtel.constants.AnimalConstants;
import com.singtel.factory.AnimalFactory;
import com.singtel.factory.BirdFactory;

public class FactoryUtil {
	
	private static AnimalFactory animalFactory;
	
	public static AnimalFactory getFactoryClass(String typeOfAnimal){
		
		if(AnimalConstants.BIRD.equalsIgnoreCase(typeOfAnimal)){
			animalFactory = new BirdFactory();
			
		}
		
		return animalFactory;
	}

}
