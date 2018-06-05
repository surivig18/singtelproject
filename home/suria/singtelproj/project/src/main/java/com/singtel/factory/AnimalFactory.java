package com.singtel.factory;

import com.singtel.domain.Animal;

public abstract class AnimalFactory {

	public  abstract <T extends Animal> T  getInstance();
}
