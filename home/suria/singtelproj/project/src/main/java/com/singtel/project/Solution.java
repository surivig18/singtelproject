package com.singtel.project;

import java.util.Scanner;

import com.singtel.constants.AnimalConstants;
import com.singtel.domain.Animal;
import com.singtel.factory.AnimalFactory;
import com.singtel.factory.util.FactoryUtil;

public class Solution {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		String inputAnimal = sc.next();
		if(AnimalConstants.BIRD.equalsIgnoreCase(inputAnimal))
			getAnimalInstance(inputAnimal);
	}
	
	public static Animal getAnimalInstance(String inputAnimal){
		AnimalFactory animalFactory =  FactoryUtil.getFactoryClass(inputAnimal);
		Animal animal = animalFactory.getInstance();
		return animal;
	}
}