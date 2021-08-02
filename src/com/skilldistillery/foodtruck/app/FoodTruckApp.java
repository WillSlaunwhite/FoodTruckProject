package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

public class FoodTruckApp {

		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			FoodTruck[] listOfTrucks = new FoodTruck[5];
			
			for(int i=0; i<5; i++) {
				String truckName, foodType;
				double rating;
				
				System.out.println("Please give the name, food type, and rating of up to five food trucks. Type quit to break input.");
				
				System.out.println("Truck name: ");
				truckName = sc.nextLine();
				if(truckName.equals("quit")) {
					break;
				}
				
				System.out.println("Food type: ");
				foodType = sc.nextLine();
				if(foodType.equals("quit")) {
					break;
				}
				
				System.out.println("Rating (on a scale of 0.0 to 5.0): ");
				String temprating = sc.nextLine();
				if(temprating.equals("quit")) {
					break;
				} else { rating = Double.parseDouble(temprating);  }
				
				
				
				
			}
					
			
		}
}
