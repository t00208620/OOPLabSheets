package ProblemSolving.problemsolvingweek3.exercisec;

//TestFraction.java
/*This driver program tests out the class Fraction fully*/

import javax.swing.*;

public class TestFraction {
    public static void main(String[] args) {
        int numerator,denominator;
        String output="";

        Fraction fraction1 = new Fraction();
        output += "Just called the Fraction() constructor - value of first Fraction object is " + fraction1;

        numerator = Integer.parseInt(JOptionPane.showInputDialog("Please enter the numerator of the fraction"));
        denominator = Integer.parseInt(JOptionPane.showInputDialog("Please enter the denominator of the fraction"));

        Fraction fraction2 = new Fraction(numerator,denominator);
        output += "\n\nJust called the Fraction(int,int) constructor - value of second Fraction object is " + fraction2;

        output += "\n\nJust called the equals() method to check whether the Fraction objects \nare numerically equivalent. The result" +
                " is that the fractions are ";

        if(fraction1.equals(fraction2))
            output += "equal in value";
        else
            output += "different in value";

        Fraction fraction3 = new Fraction(13,-28);

        output += "\n\nJust created a 3rd Fraction object with the values (13,-28)";

        fraction2 = fraction3.copy();

        output += "\n\nJust called the copy() method to change the state of the 2nd Fraction\nobject to that of the 3rd Fraction Object. " +
                " The value of the 2nd Fraction object is now " + fraction2;

        Fraction sum = fraction2.add(fraction3);

        output += "\n\nJust called the add() method to add the 2nd and 3rd fraction objects.\n" +
                "The value of the " + fraction2 + " + " + fraction3 + " is " + sum;

        Fraction difference = fraction2.subtract(fraction3);

        output += "\n\nJust called the subtract() method to subtract the 3rd fraction from the 2nd one.\n" +
                "The value of the " + fraction2 + " - " + fraction3 + " is " + difference;

        Fraction product = fraction2.multiply(fraction3);

        output += "\n\nJust called the multiply() method to multiply the 3rd fraction by the 2nd one.\n" +
                "The value of the " + fraction2 + " x " + fraction3 + " is " + product;

        Fraction quotient = fraction2.divide(fraction3);

        output += "\n\nJust called the divide() method to divide the 2nd fraction by the 3rd one.\n" +
                "The value of the " + fraction2 + " / " + fraction3 + " is " + quotient;

        JOptionPane.showMessageDialog(null,"The Results of Testing the Fraction Class are as follows:\n\n" + output,
                "Fraction Class Test Results", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}