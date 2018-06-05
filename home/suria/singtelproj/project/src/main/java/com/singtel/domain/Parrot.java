package com.singtel.domain;

public class Parrot extends Bird {
	
	private Animal animal;
	private Rooster rooster;
	 private boolean isRooster = false;
	
	public Parrot(Animal animal){
		this.animal = animal;
	}
	
	public Parrot(Rooster rooster){
		this.rooster=rooster;
		this.isRooster = true;
	}
	@Override
	public void sing(){
		if(this.isRooster){
			this.rooster.sing();
		}
		else{
			this.animal.sing();
		}
	}
	

}
