package ProblemSolving.problemsolvingweek1;

//Qb.java
/*A program which reads in the condition of a potato. If it is good then the min/max diameter of the
 * potato is entered and the average diameter calculated and displayed. There is also some
 * fool-proofing code present*/

import javax.swing.*;

public class Qb {
    public static void main(String[] args) {
        String condition,grade;
        double minimiumDiameter, maximumDiameter, averageDiameter;

        String banner = "-----The Super-Duper Potato Grading Machine-----\n\n\n";


        condition = JOptionPane.showInputDialog(banner + "Please enter the condition of the potatoe (good or bad)");

        if (condition.equalsIgnoreCase("good")) {
            minimiumDiameter = Double.parseDouble(JOptionPane.showInputDialog(banner + "Please enter the minimum diameter of the potato"));

            if(minimiumDiameter>0) {
                maximumDiameter = Double.parseDouble(JOptionPane.showInputDialog(banner + "Please enter the maximum diameter of the potato"));

                if(maximumDiameter>0) {
                    averageDiameter = (maximumDiameter+minimiumDiameter)/2;

                    if(averageDiameter<25)
                        grade="D";
                    else if(averageDiameter<50)
                        grade="C";
                    else if(averageDiameter<75)
                        grade="B";
                    else
                        grade="A";

                    JOptionPane.showMessageDialog(null, "The average diameter of the potato is " + averageDiameter + "mm and so " +
                                                  "its grade is " + grade, "Potato Information",JOptionPane.INFORMATION_MESSAGE);

                }
                else
                    JOptionPane.showMessageDialog(null, "The maximum diameter value cannot be negative .... exiting program now"
                                                  , "Invalid Information",JOptionPane.ERROR_MESSAGE);
            }
            else
                JOptionPane.showMessageDialog(null, "The minimum diameter value cannot be negative .... exiting program now"
                        , "Invalid Information",JOptionPane.ERROR_MESSAGE);
        }
        else if(condition.equalsIgnoreCase("bad")){
            JOptionPane.showMessageDialog(null, "The condition of this potato is bad .... exiting program now"
                    , "Bad Potato",JOptionPane.WARNING_MESSAGE);
        }
        else
            JOptionPane.showMessageDialog(null, "You have entered an invalid potato condition .... exiting program now"
                    , "Invalid Information",JOptionPane.ERROR_MESSAGE);

        System.exit(0);
    }
}