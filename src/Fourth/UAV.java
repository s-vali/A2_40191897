/**
 * Part: I & II
 * Written by: Sofia Valiante (40191897)
 */

package Fourth;

import Fifth.AgriculturalDrone;

public class UAV {

	/**
	 * Variables
	 */
	protected double weight;
	protected double price;
	
	/**
	 * Constructor
	 */
	//default
	public UAV() {
		this.weight = 150;
		this.price = 10000.0;
	}
	//parameterized
	public UAV(double weight, double price) {
		this.weight = weight;
		this.price = price;
	}
	//copy
	public UAV(UAV copy) {
		this.weight = copy.weight;
		this.price = copy.price;
	}
	
	/**
	 * Getters and Setters
	 */
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	/**
	 * toString() method that prints all of the attributes of the class
	 * @return String
	 */
	public String toString() {
		return "This " + getClass().getSimpleName() + " has a weight of " + weight 
				+ " pounds and costs " + price + "$. ";
	}
	
	/**
	 * Equals() method tests if two objects are of the same class,
	 * if not then false is returned, if so then both objects are 
	 * compared. The expected result is outputted. 
	 * @return boolean
	 */
	public boolean equals(Object o) {
		if(o == null) { 
			return false;
		} else if(this.getClass() != o.getClass()){ //or (this.getClass() == o.getClass()
			return false;
		}
		else { //object is of the class and not null
			UAV obj = (UAV) o;
			if(this.weight == obj.weight & this.price == obj.price) {
				return true;
			} else
				return false;
		}
	}
	
	public static UAV uavForArray(Object o) {
		UAV currentFlyingObj = (UAV)o;
		return currentFlyingObj;
	}
}