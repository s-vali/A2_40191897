/**
 * Part: I & II
 * Written by: Sofia Valiante (40191897)
 */

package First;

import Fifth.MAV;

public class Airplane {

	/**
	 * Variables
	 */
	protected String brand; 
	protected double price;
	protected int horsepower;
	
	/**
	 * Constructors
	 */
	//default constructor
	public Airplane() {
		brand = "Canada Air";
		price = 1000000.0;
		horsepower = 308;
	}
	//parameterized constructor
	public Airplane(String brand, double price, int horsepower) { 
		this.brand = brand;
		this.price = price;
		this.horsepower = horsepower;
	}
	//copy constructor
	public Airplane(Airplane copy) { 
		//Airplane copy = (Airplane)o;
		this.brand = copy.brand;
		this.price = copy.price;
		this.horsepower = copy.horsepower;
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getHorsepower() {
		return horsepower;
	}
	public void setHorsepower(int horsepower) {
		this.horsepower = horsepower;
	}
	
	/**
	 * toString() method that prints all of the attributes of the class
	 * @return String
	 */
	public String toString() {
		return "This " + getClass().getSimpleName() 
				+ " is manufactured by " + brand + ". "
				+ "It costs " + price + "$ and "
				+ "has " + horsepower + " horsepower. ";
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
		} else if(this.getClass() != o.getClass()){ //or this.getClass() == o.getClass()
			return false;
		}
		else { //object is of the class and not null
			Airplane obj = (Airplane) o;
			if((this.brand.compareToIgnoreCase(obj.brand)) == 0 & this.price == obj.price & this.horsepower == obj.horsepower) {
				return true;
			} else
				return false;
		}
	}
}