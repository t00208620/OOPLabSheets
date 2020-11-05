package ProblemSolving.problemsolvingweek3.exerciseb;

//TestFraction.java
/*This driver program tests out the class Point fully*/

import javax.swing.*;

public class TestPoint {
    public static void main(String[] args) {
        int x,y;
        String output="";

        Point point1 = new Point();
        output += "Just called the Point() constructor - value of first Point object is " + point1;

        x = Integer.parseInt(JOptionPane.showInputDialog("Please enter the x-coordinate of the point"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Please enter the y-coordinate of the point"));

        Point point2 = new Point(x,y);
        output += "\n\nJust called the Point(int,int) constructor - value of second Point object is " + point2;

        output += "\n\nJust called the equals() method to check whether the Point objects \nhold the same values. The result" +
                " is that the points are ";

        if(point1.equals(point2))
            output += "the same";
        else
            output += "different";

        Point point3 = new Point(-4,11);

        output += "\n\nJust created a 3rd Point object with the values (-4,11)";

        point2.setPoint(point3);

        output += "\n\nJust called the setPoint() method to change the state of the 2nd Point\nobject to that of the 3rd Point Object. " +
                " The value of the 2nd Point object is now " + point2;

        point3.moveHorizontally(-5);

        output += "\n\nJust called the moveHorizontally() method to change the x value of the 3rd Point\nby -5 units " +
                " The value of the 3rd Point object is now " + point3;

        point1.moveVertically(6);

        output += "\n\nJust called the moveVertically() method to change the y value of the 1st Point\nby 6 units " +
                " The value of the 1st Point object is now " + point1;

        JOptionPane.showMessageDialog(null,"The Results of Testing the Point Class are as follows:\n\n" + output,
                "Point Class Test Results", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}