package labsheet8.Exercise2;

//Car.java
/*An instantiable class that inherits from the Vehicle class and adds a few
of its own customisations*/


public class Car extends Vehicle {
     private int maxPassengers;
     private String registrationNumber; 

	   public Car() {
	   		setMaxPassengers(0);
	   		setRegistrationNumber("No registration number specified");
	   	}
	   	
	   public Car(double pr, double len, double hgt, double wgt, String mft, String mod, int passnum, String reg) {
	   		super(pr,len,hgt,wgt,mft,mod);
	   		setMaxPassengers(passnum);
	   		setRegistrationNumber(reg);
	   	}
	   	
	   public void setMaxPassengers(int num) {
	   		maxPassengers=num;
	   	}

	   public void setRegistrationNumber(String reg) {
	   	if(Validator.isValidRegistrationNumber(reg))
	   		registrationNumber=reg;
	   	else
			registrationNumber="Invalid Registration Number";
	   	}
	   
	   public int getMaxPassengers() {
	   		return maxPassengers;
	   }

	   public String getRegistrationNumber() {
	   		return registrationNumber;
	   }
	   
	   public String toString(){
	   		return super.toString() + "\nMax passengers: " + getMaxPassengers() + "\nRegistration Number: " + getRegistrationNumber();
	   	}
	   
}