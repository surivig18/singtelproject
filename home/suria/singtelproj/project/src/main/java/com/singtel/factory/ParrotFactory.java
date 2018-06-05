package com.singtel.factory;

import com.singtel.constants.AnimalConstants;
import com.singtel.domain.Cat;
import com.singtel.domain.Dog;
import com.singtel.domain.Parrot;
import com.singtel.domain.Rooster;

public class ParrotFactory {
	private Parrot parrot;

	public Parrot  getInstance(String houseOfParrot) {
		if(houseOfParrot.equalsIgnoreCase(AnimalConstants.DOG)){

			parrot = new Parrot(new Dog());
		}
		if(houseOfParrot.equalsIgnoreCase(AnimalConstants.CAT)){

			parrot = new Parrot(new Cat());
		}
		if(houseOfParrot.equalsIgnoreCase(AnimalConstants.ROOSTER)){

			parrot = new Parrot(new Rooster());
		}
		return parrot;
	}



}
