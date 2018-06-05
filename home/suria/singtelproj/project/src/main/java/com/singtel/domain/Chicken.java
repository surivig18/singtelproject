package com.singtel.domain;

public class Chicken extends Bird{
	boolean isMale = false; 
	Rooster rooster;
	public Chicken(boolean isMale){
		this.isMale = isMale;
		if(isMale){
			rooster = new Rooster();
		}
	}
	@Override
	public void sing(){
		if(this.isMale){
			this.rooster.sing();
		}
		else{
			System.out.println("Cluck, cluck");
		}

	}
	@Override
	public void fly(){
		System.out.println("Chicken cant fly");
	}
}


