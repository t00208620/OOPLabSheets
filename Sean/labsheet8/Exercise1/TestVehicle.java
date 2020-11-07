package labsheet8.Exercise1;

//TestVehicle.java
/*A driver program that tests the functionality of the Vehicle, Car and
Bicycle classes*/


public class TestVehicle{
     public static void main(String args[])
     	{
     		System.out.println("\n\nTesting the Car no-arg constructor: ");
     		Car c1 = new Car();
     		System.out.println(c1);
     		
     		System.out.println("\n\nTesting the Car multi-arg constructor: ");
     		Car c2 = new Car(100000,4.5,1.25,2000,"Ferrari","F2",2,"05KY1");
     		System.out.println(c2);
     		
     	  	System.out.println("\n\nTesting the Bicycle no-arg constructor: ");
     		Bicycle b1 = new Bicycle();
     		System.out.println(b1);
     		
     		System.out.println("\n\nTesting the Bicycle multi-arg constructor: ");
     		Bicycle b2 = new Bicycle(500,1.5,1,50,"Raleigh","Mountainbike",true,4);
     		System.out.println(b2);

     	}	   
}