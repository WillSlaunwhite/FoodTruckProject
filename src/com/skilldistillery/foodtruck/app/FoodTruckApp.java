package com.skilldistillery.foodtruck.app;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FoodTruck[] listOfTrucks = new FoodTruck[5];
		System.out.println(
				"Please give the name, food type, and rating of up to five food trucks. Type quit to break input.");
		for (int i = 0; i < 5; i++) {
//				String truckName, foodType;
//				double rating;
			
			FoodTruck truck = new FoodTruck();
			
			System.out.println("Truck name: ");
			String truckName = sc.nextLine();
			if (truckName.equals("quit")) {
//				System.out.println(listOfTrucks[0].getName());
//				truck.listAllTrucks(listOfTrucks);
				break;
			} else {
				truck.setName(truckName);
			}
			
			System.out.println("Food type: ");
			truck.setType(sc.nextLine());
			
			System.out.println("Rating (on a scale of 0.0 to 5.0): ");
			truck.setRating(sc.nextDouble());
			sc.nextLine(); // extra nextline to clear feed
			
			listOfTrucks[i] = truck;
//			truck.listAllTrucks(listOfTrucks);
		}
		while (true) {
			int userChoice;
			FoodTruck ft = new FoodTruck();


			System.out.println("What would you like to do?");
			System.out.println("1: Print all trucks");
			System.out.println("2: See average rating of food trucks");
			System.out.println("3: Display the highest-rated food truck");
			System.out.println("4: Quit");
			
			userChoice = sc.nextInt();
			switch(userChoice) {
				case(1):
					ft.listAllTrucks(listOfTrucks);
					break;
				case(2):
//					System.out.println("2: See average rating of food trucks");
					ft.calcAvgRating(listOfTrucks);
					break;
				case(3):
//					System.out.println("3: Display the highest-rated food truck");
					ft.getBestTruck(listOfTrucks);
					break;
				case(4):
					System.out.println("4: Quit");
					break;

			}
			
			
		}

//		public void listAllTrucks(FoodTruck foodTrucksList[]) {
//			for(int i=0; i<foodTrucksList.length; i++) {
//				FoodTruck truck = foodTrucksList[i];
//				if(truck.getName() == null) {
//					break;
//				}
//				else {
//					System.out.println("Food Truck Name: "+truck.getName()+
//						"Food Truck Type: "+truck.getType()+
//						"Rating: "+truck.getRating());
//				}
//				
//			}
//		}

	}
}
