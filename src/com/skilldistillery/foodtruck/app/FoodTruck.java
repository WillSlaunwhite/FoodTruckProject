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
	public FoodTruck() {
		this.id = foodTruckCounter;
		foodTruckCounter++;
		
	}

	public FoodTruck(String foodTruckName, String foodType, double rating) {
		this.name = foodTruckName;
		this.type = foodType;
		this.rating = rating;
		this.id = foodTruckCounter;
		foodTruckCounter++;
	
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public void listAllTrucks(FoodTruck foodTrucksList[]) {
		for(int i=0; i<foodTrucksList.length; i++) {
			FoodTruck truck = foodTrucksList[i];
			
			if(truck.getName() == null) {
				break;
			}
			else {
				System.out.println("Food Truck Name: "+truck.getName()+
					"Food Truck Type: "+truck.getType()+
					"Rating: "+truck.getRating());
			}
			
		}
	}
	
}

