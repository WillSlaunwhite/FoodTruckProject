package com.skilldistillery.foodtruck.app;

public class FoodTruck {
	private static int foodTruckCounter=1;
	private String name, type;
	private double rating;
	private int id;

	
	// no static methods
	// when object is created, static variable is passed to id then ++.   DONE
	// UP TO five food trucks
	// quit out by entering quit
	// menu after input is done
	// option to display all trucks. if input < 5 show correct number of trucks
	// option to get average 
	

	public FoodTruck(String foodTruckName, String foodType, int rating) {
		this.name = foodTruckName;
		this.type = foodType;
		this.rating = rating;
		this.id = foodTruckCounter;
		foodTruckCounter++;
		
	
	}
	
	public void addTruck(FoodTruck truck) {
		
	}
	
}

