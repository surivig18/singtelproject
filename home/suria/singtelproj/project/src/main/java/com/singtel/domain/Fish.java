package com.singtel.domain;

public class Fish implements Animal {
	 	protected String size = "";
	 	protected String color = "";
		
		@Override
		public void walk(){
			System.out.println("Fishes can't walk");
		}
		
		
		 @Override
		 public void sing(){
				System.out.println("Fishes can sing");
			}
		 @Override
		 public void swim(){
			 System.out.println("Fishes can swim");
		 }


		/**
		 * @return the size
		 */
		public String getSize() {
			return size;
		}


		/**
		 * @param size the size to set
		 */
		public void setSize(String size) {
			this.size = size;
		}


		/**
		 * @return the color
		 */
		public String getColor() {
			return color;
		}


		/**
		 * @param color the color to set
		 */
		public void setColor(String color) {
			this.color = color;
		}
		 
		 

}
