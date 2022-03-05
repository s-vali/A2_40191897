/**
 * Part: I & II
 * Written by: Sofia Valiante (40191897)
 */

package Second;

public class Quadcopter extends Helicopter {

	/**
	 * Variables
	 */
	private int maxFlyingSpeed;
	
	/**
	 * Constructors
	 */	
	//default
	public Quadcopter() {
		this.brand = "Parrot Anafi";
		this.price = 449.0;
		this.horsepower = 20;
		this.nbOfCylinders = 4;
		this.creationYear = 2021;
		this.passengerCapacity = 4;
		this.maxFlyingSpeed = 60;
	}
	//parameterized
	public Quadcopter(String brand, double price, int horsepower, int nbOfCylinders, int creationYear, int passengerCapacity, int maxFlyingSpeed) {
		super(brand, price, horsepower, nbOfCylinders, creationYear, passengerCapacity);
		this.maxFlyingSpeed = maxFlyingSpeed;
	}
	//copy
	public Quadcopter(Quadcopter copy) {
		this.brand = copy.brand;
		this.price = copy.price;
		this.horsepower = copy.horsepower;
		this.nbOfCylinders = copy.nbOfCylinders;
		this.creationYear = copy.creationYear;
		this.passengerCapacity = copy.passengerCapacity;
		this.maxFlyingSpeed = copy.maxFlyingSpeed;
	}
	/**
	 * Getters and Setters
	 */
	public int getMaxFlyingSpeed() {
		return maxFlyingSpeed;
	}
	public void setMaxFlyingSpeed(int maxFlyingSpeed) {
		this.maxFlyingSpeed = maxFlyingSpeed;
	}
	
	/**
	 * toString() method that prints all of the attributes of the class
	 * @return String
	 */
	public String toString() {
		return super.toString()
				+ "Its maximum flying speed is " + maxFlyingSpeed + "km/h. ";
	}
	
	/**
	 * Equals() method tests if two objects are of the same class,
	 * if not then false is returned, if so then both objects are 
	 * compared. The expected result is outputted. 
	 * @return boolean
	 */
	@Override
	public boolean equals(Object o) {
		Quadcopter obj = (Quadcopter) o; //obj should have all the attributes of o
		if(super.equals(obj) & this.maxFlyingSpeed == obj.maxFlyingSpeed)
			return true;
		else
			return false;
	}
	
}