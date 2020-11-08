package labsheet9.exercise1;

//TestPolymorphism.java
/*A driver class to test out the Employee, Boss and HourlyWorker classes*/

public class TestPolymorphism {
    public static void main(String args[])
    {
        Employee[] employees = new Employee[3]; //a reference to the Employee superclass

        Boss b1 = new Boss("Joe","Smith",750.50);
        
        HourlyWorker hw1 = new HourlyWorker("Mary","O'Neill", 8.5,49.5);
        
       
        employees[0]=b1;
        
        employees[1]=hw1;//recall a Boss "is a" Employee so this assignment is allowed
        
        
        SelfEmployedWorker s1 = new SelfEmployedWorker("Sean", "Courtney");
        //will now use the Employee reference object to display the correct information via polymorphism


        employees[2]=s1; //recall that an HourlyWorker "is a" Employee so this is okay too

        //will now use the Employee reference object to display the correct information via polymorphism

        //note the generic nature of the code here
        for(int i=0;i<employees.length;i++)
        System.out.println(employees[i].toString() + " and the earnings were €" + String.format("%.2f",employees[i].earnings()) +"\n");
    }
}