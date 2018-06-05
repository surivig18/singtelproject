package com.singtel.factory.util;

import com.singtel.constants.AnimalConstants;
import com.singtel.domain.Dolphin;
import com.singtel.factory.AnimalFactory;
import com.singtel.factory.BirdFactory;
import com.singtel.factory.FishFactory;

public class FactoryUtil {
	
	private static AnimalFactory animalFactory;
	
	public static AnimalFactory getFactoryClass(String typeOfAnimal){
		
		if(AnimalConstants.BIRD.equalsIgnoreCase(typeOfAnimal)){
			animalFactory = new BirdFactory();
			
		}
		if(AnimalConstants.FISH.equalsIgnoreCase(typeOfAnimal)){
			animalFactory = new FishFactory();
			
		}
		
		return animalFactory;
	}
	
	public static Dolphin returnDolphinInstance(){
		return new Dolphin();
	}

}
