package com.singtel.factory;

import com.singtel.constants.AnimalConstants;
import com.singtel.domain.Bird;
import com.singtel.domain.Chicken;
import com.singtel.domain.Duck;

public class BirdFactory extends AnimalFactory{

	@Override
	public Bird  getInstance(String typeOfAnimal) {
		
		Bird bird = null;
		if(null != typeOfAnimal){
			if(typeOfAnimal.equalsIgnoreCase(AnimalConstants.CHICKEN)){
				bird =  new Chicken(false);
			}
			if(typeOfAnimal.equalsIgnoreCase(AnimalConstants.DUCK)){
				bird = new Duck(); 
			}
			if(typeOfAnimal.equalsIgnoreCase(AnimalConstants.ROOSTER)){
				bird = new Chicken(true); 
			}
		}
		else{
			bird =  new Bird();
		}
		return bird;
	}
	

}
