package com.singtel.project;

import java.util.Scanner;

import com.singtel.constants.AnimalConstants;
import com.singtel.domain.Animal;
import com.singtel.domain.Bird;
import com.singtel.domain.Dolphin;
import com.singtel.domain.Fish;
import com.singtel.domain.Parrot;
import com.singtel.factory.AnimalFactory;
import com.singtel.factory.ButterFlyFacory;
import com.singtel.factory.ParrotFactory;
import com.singtel.factory.util.FactoryUtil;
import com.singtel.helperinterfaces.FlyInterface;
import com.singtel.helperinterfaces.TransformedButterFly;

public class Solution {
	public static void main(String[] args) { 
		Bird bird;
		Fish fish;
		Dolphin dolphin;
		Parrot parrot;
		FlyInterface flyInterface;
		TransformedButterFly transformedButterFly;
		String typeofanimal;
		String houseOfParrot;
		
		System.out.println("Enter type of Animal:");
		Scanner sc = new Scanner(System.in);
		String inputAnimal = sc.next();
		if(AnimalConstants.BIRD.equalsIgnoreCase(inputAnimal)){
			System.out.println("Enter type of Bird:");
				 typeofanimal = sc.next();
			if(!typeofanimal.equalsIgnoreCase(AnimalConstants.PARROT)){
				bird = (Bird) getAnimalInstance(inputAnimal,typeofanimal);
			}
			else{
				System.out.println("Where does parrot live ? ");
				houseOfParrot = sc.next();
				parrot = getParrotInstance(houseOfParrot);
				
			}
		}
		if(AnimalConstants.FISH.equalsIgnoreCase(inputAnimal)){
			System.out.println("Enter type of Fish:");
				 typeofanimal = sc.next();
			fish = (Fish) getAnimalInstance(inputAnimal,typeofanimal);
		}
		
		if(AnimalConstants.DOLPHIN.equalsIgnoreCase(inputAnimal)){
			dolphin = returnDolphinInstance();
		}
		if(AnimalConstants.BUTTERFLLY.equalsIgnoreCase(inputAnimal)){
			System.out.println("Is it a transformed buttefly");
			String answer = sc.next();
			ButterFlyFacory butterFlyFacory = new ButterFlyFacory();
			if("Yes".equalsIgnoreCase(answer))
				transformedButterFly= 	(TransformedButterFly) butterFlyFacory.getInstance(AnimalConstants.TRANSFROMEDFLY);
			else
				flyInterface = 	(FlyInterface) butterFlyFacory.getInstance(AnimalConstants.BUTTERFLLY);
		}
		
		
	}
	
	public static Animal getAnimalInstance(String inputAnimal,String typeofanimal){
		AnimalFactory animalFactory =  FactoryUtil.getFactoryClass(inputAnimal);
		Animal animal = animalFactory.getInstance(typeofanimal);
		return animal;
	}
	
	public static Parrot getParrotInstance(String houseOfParrot){
		ParrotFactory parrotFactory = new ParrotFactory();
		Parrot parrot = parrotFactory.getInstance(houseOfParrot);
		return parrot;
	}
	
	public static Dolphin returnDolphinInstance(){
		Dolphin dolphin = FactoryUtil.returnDolphinInstance();
		return dolphin;
	}
}