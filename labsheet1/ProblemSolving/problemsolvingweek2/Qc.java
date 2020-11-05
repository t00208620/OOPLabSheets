package ProblemSolving.problemsolvingweek2;

//Qc.java
/*This program populates 2 parallel arrays containing names and phone-numbers respectively.
 *It then asks the user to enter a name and does a linear search on the names array for the name
 *If the name is found then the corresponding phone-number is displayed*/

import javax.swing.JOptionPane;

public class Qc {
    public static void main(String args[]) {
         String names[] = new String[10], phonenumbers[] = new String[10];
         String name;
         int subscript;        
         
      	 for (int i = 0; i < 10; i++) {
	      		names[i] = JOptionPane.showInputDialog("Please enter the name of person " + (i+1));
	      		phonenumbers[i] = JOptionPane.showInputDialog("Please enter the phone-number of person " + (i+1));
      	 }
      	 
      	 name = JOptionPane.showInputDialog("Whose phone number do you seek?"); 
      	 subscript = linearSearch(names,name);
      	 
      	 if(subscript!=-1)  
      	 	JOptionPane.showMessageDialog(null,"The phone number is " + phonenumbers[subscript],
      	 	                             "Phone Number",JOptionPane.INFORMATION_MESSAGE);
      	 else
      	 	JOptionPane.showMessageDialog(null,"Name not found!",
      	 	                             "Phone Number",JOptionPane.INFORMATION_MESSAGE);
      	
         System.exit(0);	  	 
	    }

	public static int linearSearch(String names[],String name) {
	      for (int i = 0; i < names.length; i++)
	      	 if(name.equals(names[i]))
	      	 	return i;
	      	 	
	      return -1;
    }
}

       	
       	
       	
       	
       