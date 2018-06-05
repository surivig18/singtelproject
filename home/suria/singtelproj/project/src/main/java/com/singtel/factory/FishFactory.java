package com.singtel.factory;

import com.singtel.constants.AnimalConstants;
import com.singtel.domain.Animal;
import com.singtel.domain.ClownFish;
import com.singtel.domain.Fish;
import com.singtel.domain.Shark;

public class FishFactory extends AnimalFactory{

	private Fish fish;
	@Override
	public Fish  getInstance(String typeOfAnimal) {
		if(null != typeOfAnimal){
			if(AnimalConstants.SHARK.equalsIgnoreCase(typeOfAnimal))
			{
				fish = new Shark();
			}
			if(AnimalConstants.CLOWNFISH.equalsIgnoreCase(typeOfAnimal))
			{
				fish = new ClownFish();
			}
		}
		else
		{
			fish = new Fish();
		}
		return fish;
	}

}
