/**
 * Part: I & II
 * Written by: Sofia Valiante (40191897)
 */

package Third;

import Second.Helicopter;
import Second.Quadcopter;

public class Multirotor extends Helicopter {

	/**
	 * Variables
	 */
	private int nbOfRotors;
	
	/**
	 * Constructors
	 */
	//default
	public Multirotor() {
		this.brand = "G5 Plus";
		this.price = 500.0;
		this.horsepower = 7;
		this.nbOfCylinders = 2;
		this.creationYear = 2022;
		this.passengerCapacity = 0;
		this.nbOfRotors = 6;
	}
	//parameterized
	public Multirotor(String brand, double price, int horsepower, int nbOfCylinders, int creationYear, int passengerCapacity, int nbOfRotors) {
		super(brand, price, horsepower, nbOfCylinders, creationYear, passengerCapacity);
		this.nbOfRotors = nbOfRotors;
	}
	//copy
	public Multirotor(Multirotor copy) {
		this.brand = copy.brand;
		this.price = copy.price;
		this.horsepower = copy.horsepower;
		this.nbOfCylinders = copy.nbOfCylinders;
		this.creationYear = copy.creationYear;
		this.passengerCapacity = copy.passengerCapacity;
		this.nbOfRotors = copy.nbOfRotors;
	}
	
	/**
	 * Getters and Setters
	 */
	public int getNbOfRotors() {
		return nbOfRotors;
	}
	public void setNbOfRotors(int nbOfRotors) {
		this.nbOfRotors = nbOfRotors;
	}
	
	/**
	 * toString() method that prints all of the attributes of the class.
	 * @return String
	 */
	@Override
	public String toString() {
		return super.toString()
				+ "It also has " + nbOfRotors + " rotors. ";
	}
	
	/**
	 * Equals() method tests if two objects are of the same class,
	 * if not then false is returned, if so then both objects are 
	 * compared. The expected result is outputted. 
	 * @return boolean
	 */
	@Override
	public boolean equals(Object o) {
		Multirotor obj = (Multirotor) o; //obj should have all the attributes of o
		if(super.equals(obj) & this.nbOfRotors == obj.nbOfRotors)
			return true;
		else
			return false;
	}

}