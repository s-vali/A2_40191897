/**
 * Part: I
 * @author Sofia Valiante (40191897)
 * Due: March 4th 2022
 * COMP 249
 * 
 * This java file is the first driver class and holds the method
 * to find the least and most expensive UAV flying object and output the result.
 * Additionally, this driver contains multiple initializations of flying objects of 
 * the classes Airplane, UAV, AgriculturalDrone, MAV, Helicopter, Quacopter and
 * Multirotor, in which these objects have been put into two arrays. Furthermore,
 * the equals and toString() of each class for flying objects has been tested. 
 */

import First.Airplane;
import Second.Helicopter;
import Second.Quadcopter;
import Third.Multirotor;
import Fourth.UAV;
import Fifth.AgriculturalDrone;
import Fifth.MAV;

public class Driver1 {
	
	/**
	 * The method takes as an argument an array of multiple flying objects
	 * of the classes. The method utilizes nested for loops: the exterior
	 * is meant to represent the current UAV being considered in the array
	 * and the second is meant to represent the next UAV. The for loop
	 * runs through all members of the array until it finds one that is of
	 * the class UAV by using Object method getClass(). Then, the nested for
	 * loop finds the next UAV within the array using the same conditional
	 * if statement. After both UAV's have been found, both objects are downcasted
	 * to be of type UAV (NOTE: both UAV objects are passed through the method
	 * as being of the type superclass Object, thus in order to access the 
	 * methods and variables of the UAV class, they need to be downcasted to 
	 * actually be of type UAV. This is allowed by Java because the objects
	 * reference a UAV.) A final conditional statement is used to compare the prices
	 * of the current UAV and the following UAV. If the following UAV has a higher 
	 * price, their references in the passed array are swapped. Finally, a for 
	 * loop is used to count the amount of UAV's in the passed array and is used
	 * to create a new local array containing solely UAV objects, though they're
	 * actually of type superclass Object. Given that the passed array (the parameter
	 * of the method) is already sorted in decreasing order, then a counter at the
	 * first position of the new UAV copied array will find the highest price UAV
	 * at the first index and the lowest priced at the last index. If the counter
	 * is zero, this means that the passed array as the method parameter contained
	 * no UAV's. 
	 * 
	 * @param flyingObjectsArray
	 * @return none;
	 */
	public static void findLeastAndMostExpensiveUAV(Object[] flyingObjectsArray) {
		
		//Variables
		int counter = 0;
		int uavNb = 0;
		UAV currentFlyingObj = null;
		UAV nextFlyingObj = null;
		final int TEMPO_INDEX = 0;
		final int TEMPO_ARRAY_SIZE = 1;
		
		for(int i = 0; i < flyingObjectsArray.length-1; i++) {
			if(flyingObjectsArray[i].getClass() == UAV.class || flyingObjectsArray[i].getClass() == MAV.class || flyingObjectsArray[i].getClass() == AgriculturalDrone.class) {
				for(int j = i+1; j < flyingObjectsArray.length; j++) {
					if(flyingObjectsArray[j].getClass() == UAV.class || flyingObjectsArray[j].getClass() == MAV.class || flyingObjectsArray[j].getClass() == AgriculturalDrone.class) {
						
						switch(flyingObjectsArray[i].getClass().getSimpleName()) {
							case "UAV": { currentFlyingObj = (UAV)flyingObjectsArray[i]; break; }
							case "MAV": { currentFlyingObj = (MAV)flyingObjectsArray[i]; break; }
							case "AgriculturalDrone": { currentFlyingObj = (AgriculturalDrone)flyingObjectsArray[i]; break; }
						}
						
						switch(flyingObjectsArray[j].getClass().getSimpleName()) {
							case "UAV": { nextFlyingObj = (UAV)flyingObjectsArray[j]; break; }
							case "MAV": { nextFlyingObj = (MAV)flyingObjectsArray[j]; break; }
							case "AgriculturalDrone": { nextFlyingObj = (AgriculturalDrone)flyingObjectsArray[j]; break; }
						}
						
						if(nextFlyingObj.getPrice() > currentFlyingObj.getPrice()) {
							Object[] tempoArr = new Object[TEMPO_ARRAY_SIZE];
							tempoArr[TEMPO_INDEX] = flyingObjectsArray[i];
							flyingObjectsArray[i] = flyingObjectsArray[j];
							flyingObjectsArray[j] = tempoArr[TEMPO_INDEX];
						}
					}
				}	
			}
	
			/*
			if((flyingObjectsArray[i].getClass().getSimpleName()).compareToIgnoreCase("UAV") == 0) {
				for(int j = i+1; j < flyingObjectsArray.length; j++) {
					if((flyingObjectsArray[j].getClass().getSimpleName()).compareToIgnoreCase("UAV") == 0) {
						UAV currentFlyingObj = (UAV)flyingObjectsArray[i];
						UAV nextFlyingObj = (UAV)flyingObjectsArray[j];
						
						if(nextFlyingObj.getPrice() > currentFlyingObj.getPrice()) {
							Object[] tempoArr = new Object[1];
							tempoArr[0] = flyingObjectsArray[i];
							flyingObjectsArray[i] = flyingObjectsArray[j];
							flyingObjectsArray[j] = tempoArr[0];
						}						
					}
						
				}	
					
			}
			*/
			
		}				
		for(int k = 0; k < flyingObjectsArray.length; k++) {
			if(flyingObjectsArray[k].getClass() == UAV.class || flyingObjectsArray[k].getClass() == MAV.class || flyingObjectsArray[k].getClass() == AgriculturalDrone.class) {
				counter++;
			}
		}
		//Object[] tempoUAVArray = new Object[counter];
		//boolean x = false;
		for(int l = 0; l < flyingObjectsArray.length; l++) {
			if(flyingObjectsArray[l].getClass() == UAV.class || flyingObjectsArray[l].getClass() == MAV.class || flyingObjectsArray[l].getClass() == AgriculturalDrone.class) {
				uavNb++;
				
				if(uavNb == 1) {
					System.out.println("The highest priced UAV: " + flyingObjectsArray[l].toString());
				}
				if(uavNb == counter) {
					System.out.println("The lowest priced UAV: " + flyingObjectsArray[l].toString());
				}
			}	
			
			//if highest price equals lowest price then all the ones in between must be equal
		}
		if(uavNb == 0) {
			System.out.println("There are no UAV's in this array.");
		}
	}//end of this static method
	
	/*
	 * MAIN() METHOD
	 */
	public static void main(String[] args) {
		
		/*
		 * WELCOME MESSAGE 
		 */
		System.out.println();
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("             WELCOME TO DRIVER1 PROGRAM           ");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println();
		
		/*
		 * 15 OBJECTS
		 */
		//Airplane Class
		Airplane airplane1 = new Airplane("airplaneBrand", 1, 2);
		Airplane airplane2 = new Airplane();
		//Helicopter Class
		Helicopter helicopter1 = new Helicopter();
		Helicopter helicopter2 = new Helicopter("helciopterBrand", 3, 4, 5, 2022, 6);
		//Quadcopter Class
		Quadcopter quadcopter1 = new Quadcopter("quadcopterBrand", 7, 8, 9,2021, 10, 11);
		Quadcopter quadcopter2 = new Quadcopter();
		Quadcopter quadcopter3 = new Quadcopter(quadcopter2);
		//Multirotor Class
		Multirotor multirotor1 = new Multirotor("MultirotorBrand", 12, 13, 14, 2022, 15, 16);
		Multirotor multirotor2 = new Multirotor();
	
		//UAV Class
		UAV uav1 = new UAV();
		UAV uav2 = new UAV();
		UAV uav3 = new UAV(340.0, 1500.0);
		//MAV Class
		MAV mav1 = new MAV();
		MAV mav2 = new MAV(100, 900, "DJI Mini", 20.0);
		//AgriculturalDrone Class
		AgriculturalDrone agriD1  = new AgriculturalDrone();
		AgriculturalDrone agriD2 = new AgriculturalDrone(89.0, 2000, "AgriDBrand", 30);
		
		/*
		 * ARRAY OF FLYING OBJECTS #1
		 */
		Object[] flyingObjectsArray1 = { airplane1, airplane2, 
				mav1, helicopter1, helicopter2, uav1,
				quadcopter1, quadcopter2, agriD2, quadcopter3, 
				multirotor1, multirotor2, 
				uav2, uav3,
				mav2,
				agriD1
				};
		
		/*
		 * ARRAY OF FLYING OBJECTS #2 - NO UAV CLASSES
		 */
		Object[] flyingObjectsArray2 = { airplane1, airplane2, 
				helicopter1, helicopter2, 
				quadcopter1, quadcopter2, quadcopter3, 
				multirotor1, multirotor2,
				new Airplane("Canada Dry Air", 4000000000.0, 50),
				new Helicopter("HeliAir", 380000.0, 25, 2, 2016, 6),
				new Quadcopter("QuadAir", 40000.0, 13, 1, 2020, 2, 80),
				new Multirotor("MultiRotorAir", 5460.0, 76, 4, 2017, 1, 4),
				new Multirotor("MultiRotorAir", 5460.0, 76, 4, 2017, 1, 4),
				new Airplane("Stellar Airlines", 5000.0, 28)
				};
		
		/*
		 * PRINT OBJECT INFO BY TOSTRING()
		 */
		for(int i = 0; i < flyingObjectsArray1.length; i++) {
			System.out.println(flyingObjectsArray1[i].toString());
			System.out.println();
		}
		
		/*
		 * TEST EQUALS() METHOD
		 */
		System.out.println();
		System.out.println("It is " + quadcopter2.equals(quadcopter3) + " that Quadcopter 2 equals Quadcopter 3? ");
		System.out.println("It is " + uav1.equals(uav2) + " that UAV 1 equals UAV 2? ");
		System.out.println("It is " + multirotor1.equals(multirotor2) + " that Multirotor 1 equals Multirotor 2? ");
		System.out.println("It is " + airplane2.equals(mav1) + " that Airplane 2 equals MAV 1? ");
		System.out.println("It is " + agriD1.equals(agriD2) + " that Agricultural Drone 1 equals Agricultural Drone 2? ");
		System.out.println("It is " + airplane1.equals(airplane1) + " that Airplane 1 equals Airplane 1? ");
		System.out.println("It is " + airplane1.equals(helicopter2) + " that Airplane 1 equals Helicopter 2? ");
		System.out.println();
		
		/*
		 * CALL FINDLEASTANDMOSTEXPENSIVEUAV() METHOD ON BOTH ARRAYS
		 */
		System.out.println();
		System.out.println("The result of finding the least and most expensive UAV in flyingObjectsArray1 is: ");
		findLeastAndMostExpensiveUAV(flyingObjectsArray1);
		System.out.println();
		System.out.println("The result of finding the least and most expensive UAV in flyingObjectsArray2 is: ");
		findLeastAndMostExpensiveUAV(flyingObjectsArray2);
		System.out.println();
		
		/*
		 * END OF PROGRAM
		 */
		System.out.println();
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("                  END OF PROGRAM                  ");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
	}
}