package com.skilldistillery.foodtruck.app;

public class FoodTruck {
	private static int foodTruckCounter=1;
	private String name, type;
	private double rating;
	private int id;

	
	// no static methods
	// when object is created, static variable is passed to id then ++.   DONE
	// UP TO five food trucks		DONE
	// quit out by entering quit	DONE
	// menu after input is done  	DONE 
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
	
	public void getBestTruck(FoodTruck foodTrucksList[]) {
		FoodTruck best = new FoodTruck();
		double highestRating=0;
		
		for(FoodTruck ft : foodTrucksList) {
			if(ft==null) { break; }
			
			else if(ft.rating>highestRating) {
				highestRating = ft.rating;
				best = ft;
			} else { continue; }
		}
		System.out.println("\nHighest Rated Truck: "+best.name+" \tRating: "+best.rating+"\n");
	}
	
	public void calcAvgRating(FoodTruck foodTrucksList[]) { 
		double sum=0;
		int counter=0;
		for(FoodTruck ft : foodTrucksList) {
			/// YOU ARE WORKING HERE
			if(ft==null) { break; }
			sum+=ft.rating;
			counter++;
		} sum/=counter;
		System.out.println("\nAverage rating: " + sum + "\n");
	}

	public void listAllTrucks(FoodTruck foodTrucksList[]) {
		for(FoodTruck ft : foodTrucksList) {
			if(ft == null) { break; }
			else {
				System.out.println("Food Truck Name: "+ft.name+"\n"+
					"Food Truck Type: "+ft.type+"\n"+
					"Rating: "+ft.rating+"\n");
			}
			
		}
	}
	
}

