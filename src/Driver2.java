/**
 * Part: II
 * @author Sofia Valiante (40191897)
 * Due: March 4th 2022
 * COMP 249
 * 
 * This java file is the second driver that contains the copyFlyingObjects()
 * method and a main() to create an array of multiple flying objects from
 * each class and apply the copyFlyingObjects() method, which is a static 
 * method that can be called by the class and which takes the array to copy
 * as its argument.
 */

import First.Airplane;
import Second.Helicopter;
import Second.Quadcopter;
import Third.Multirotor;
import Fourth.UAV;
import Fifth.AgriculturalDrone;
import Fifth.MAV;

public class Driver2 {
	
	
	/**
	 * The method is static and serves to copy the contents of
	 * the array passed to it through the use of a copy constructor
	 * of each class type within its array of type Object. The method
	 * utilizes a switch statement which confirms the class type of the
	 * current indexed object of the array and then uses the respective
	 * copy constructor to copy the current indexed object to the new
	 * array of the size of the passed array as argument. 
	 * 
	 * @param arrayToCopy
	 * @return Object[]
	 */
	public static Object[] copyFlyingObjects(Object[] arrayToCopy) {
		
		Object[] copyArray = new Object[arrayToCopy.length];
		
		for (int i = 0; i < arrayToCopy.length; i++) {
			String className = arrayToCopy[i].getClass().getSimpleName();
			switch(className) {
				case "Airplane": {
					Airplane copy = (Airplane)arrayToCopy[i]; 
					copyArray[i] = new Airplane(copy); 
					break;
				}
				case "Helicopter": {
					Helicopter copy = (Helicopter)arrayToCopy[i]; 
					copyArray[i] = new Helicopter(copy); 
					break;
				}
				case "Quadcopter": {
					Quadcopter copy = (Quadcopter)arrayToCopy[i];
					copyArray[i] = new Quadcopter(copy); 
					break; 
				}
				case "Multirotor": {
					Multirotor copy = (Multirotor)arrayToCopy[i];
					copyArray[i] = new Multirotor(copy); 
					break; 
				}
				case "UAV": {
					UAV copy = (UAV)arrayToCopy[i];
					copyArray[i] = new UAV(copy); 
					break;
				}
				case "MAV": {
					MAV copy = (MAV)arrayToCopy[i];
					copyArray[i] = new MAV(copy); 
					break;
				}
				case "AgriculturalDrone": {
					AgriculturalDrone copy = (AgriculturalDrone)arrayToCopy[i];
					copyArray[i] = new AgriculturalDrone(copy); 
					break;
				}
				default: {
					System.out.println("No such flying object exists. Program will terminate. "); 
					System.exit(0); 
					break;
				}
			}//end of switch
		}//end of for loop
		System.out.println("AFTER COPYING THE ARRAY: ");
		for(int i = 0; i < copyArray.length; i++) {
			System.out.println(copyArray[i].toString());
		}
		return copyArray;
	}
	
	public static void main(String[] args) {

		/*
		 * WELCOME MESSAGE 
		 */
		System.out.println();
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("             WELCOME TO DRIVER2 PROGRAM           ");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println();
		
		/*
		 * COPY AN ARRAY USING COPYFLYINGOBJECTS()
		 */
		//Create the array to copy
		Object[] flyingObjectsArrayToCopy = { 
				new Airplane("Canada Air", 4000000000.0, 50),
				new Helicopter("HeliAir", 380000.0, 25, 2, 2016, 6),
				new Quadcopter("QuadAir", 40000.0, 13, 1, 2020, 2, 80),
				new Multirotor("MultiRotorAir", 5460.0, 76, 4, 2017, 1, 4),
				new Multirotor("MultiRotorAir", 5460.0, 76, 4, 2017, 1, 4),
				new Airplane("Stellar Airlines", 5000.0, 28),
				new UAV(), 
				new MAV(79.8, 2450, "MAV Model", 67),
				new AgriculturalDrone(57.5, 609, "Drone Farms", 60),
				new MAV(65.98, 54, "M Brand", 78),
				new AgriculturalDrone(),
				new UAV(565, 7000),
				new Airplane("American ExpressWay", 54830202.05, 100),
				new Quadcopter(),
				new AgriculturalDrone(109, 800, "MX-240", 50),
				new UAV(67, 15000)
				};
		
		//Print information of array
		System.out.println("BEFORE COPYING THE ARRAY: ");
		for(int i = 0; i < flyingObjectsArrayToCopy.length; i++) {
			System.out.println(flyingObjectsArrayToCopy[i].toString());
		}System.out.println();
		
		//Call copyFlyingObjects method
		copyFlyingObjects(flyingObjectsArrayToCopy);
		
		/*
		 * END OF PROGRAM
		 */
		System.out.println();
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
		System.out.println("                  END OF PROGRAM                  ");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
	}

}