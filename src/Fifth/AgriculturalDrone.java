/**
 * Part: I & II
 * Written by: Sofia Valiante (40191897)
 */

package Fifth;

import Fourth.UAV;
import java.util.Objects;

public class AgriculturalDrone extends UAV {

	/**
	 * Variables
	 */
	private String brand;
	private int carryCapacity;
	
	/**
	 * Constructors
	 */
	//default
	public AgriculturalDrone() {
		this.weight = 340.0;
		this.price = 98000.0;
		this.brand = "AgriDrones";
		this.carryCapacity = 25;	
	}
	//parameterized
	public AgriculturalDrone(double weight, double price, String brand, int carryCapacity) {
		super(weight, price);
		this.brand = brand;
		this.carryCapacity = carryCapacity;	
	}
	//copy
	public AgriculturalDrone(AgriculturalDrone copy) {
		this.weight = copy.weight;
		this.price = copy.price;
		this.brand = copy.brand;
		this.carryCapacity = copy.carryCapacity;	
	}
	
	/**
	 * Getters and Setters
	 */
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getCarryCapacity() {
		return carryCapacity;
	}
	public void setCarryCapacity(int carryCapacity) {
		this.carryCapacity = carryCapacity;
	}
	
	/**
	 * toString() method that prints all of the attributes of the class
	 * @return String
	 */
	@Override
	public String toString() {
		return "This " + getClass().getSimpleName() + " is manufactured by " + this.brand 
				+ ". It weighs " + this.weight 
				+ " pounds, and costs " + this.price 
				+ "$. It can carry " + this.carryCapacity + " kg. ";
	}
	
	/**
	 * Equals() method tests if two objects are of the same class,
	 * if not then false is returned, if so then both objects are 
	 * compared. The expected result is outputted. 
	 * @return boolean
	 */
	@Override
	public boolean equals(Object o) {
		if(o == null) {
			return false;
		} else if(this.getClass() != o.getClass()){ //or (this.getClass() == o.getClass()
			return false;
		}
		else { //object is of the class and not null
			AgriculturalDrone obj = (AgriculturalDrone) o;
			if(this.weight == obj.weight & this.price == obj.price & this.carryCapacity == obj.carryCapacity & (this.brand.compareToIgnoreCase(obj.brand)) == 0) {
				return true;
			} else
				return false;
		}
	}
}
