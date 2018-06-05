package com.singtel.project;

import java.util.Scanner;

import com.singtel.constants.AnimalConstants;
import com.singtel.domain.Animal;
import com.singtel.domain.Bird;
import com.singtel.factory.AnimalFactory;
import com.singtel.factory.util.FactoryUtil;

public class Solution {
	public static void main(String[] args) { 
		Bird bird;
		String typeofanimal;
		
		System.out.println("Enter type of Animal:");
		Scanner sc = new Scanner(System.in);
		String inputAnimal = sc.next();
		if(AnimalConstants.BIRD.equalsIgnoreCase(inputAnimal)){
			System.out.println("Enter type of Bird:");
				 typeofanimal = sc.next();
			bird = (Bird) getAnimalInstance(inputAnimal,typeofanimal);
		}
	}
	
	public static Animal getAnimalInstance(String inputAnimal,String typeofanimal){
		AnimalFactory animalFactory =  FactoryUtil.getFactoryClass(inputAnimal);
		Animal animal = animalFactory.getInstance(typeofanimal);
		return animal;
	}
}