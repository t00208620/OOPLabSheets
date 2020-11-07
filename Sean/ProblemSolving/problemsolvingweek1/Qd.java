package ProblemSolving.problemsolvingweek1;

//Qd.java
/*This program reads in an arbitrary number of country names and determines a number of pieces
 *of information about them*/

import javax.swing.JOptionPane;

public class Qd{
	public static void main(String args[]) {
			String country,shortest="",atLeast2es="";
			char ch;
			int i=0,between10And15=0,beginWithN=0,j=0,eCount=0;
			
			do{
				 country = JOptionPane.showInputDialog("Please enter a country name (x to exit): ");

				 if(!country.equals("x")) {

					 if (i == 0)
						 shortest = country;
					 else if (country.length() < shortest.length())
						 shortest = country;

					 if (country.length() >= 10 && country.length() <= 15)
						 between10And15++;

					 if (country.charAt(0) == 'N')
						 beginWithN++;

					 while (j < country.length()) {
						 if (country.charAt(j) == 'e' || country.charAt(j) == 'E')
							 eCount++;
						 j++;
					 }

					 if (eCount >= 2)
						 atLeast2es += country + " ";

					 i++;

					 j = 0;
					 eCount = 0;
				 }
			}while(!country.equals("x"));
			
			if(i==0)
				JOptionPane.showMessageDialog(null,"\n\nYou entered no country names .... thanks for using the program","No Countries Entered",JOptionPane.WARNING_MESSAGE);
			else
				JOptionPane.showMessageDialog(null,"\n\n\n\t\t-------Country Statistics------" +
					             "\n\nNumber of countries entered: " + i +
					             "\nCountry with shortest name: " + shortest +
					             "\n% of countries with between 10 and 15 characters inclusive: " + 
					             	   String.format("%.2f",(float)between10And15/i*100) + "%" +
					             "\nNumber of countries beginning with 'N': " +  beginWithN +
					             "\nList of countries containing at least 2 'e'/'E' characters: " + atLeast2es,
								"Country Stats",JOptionPane.INFORMATION_MESSAGE);

			System.exit(0);
		}
}

