package labsheet6.exercise1;

import javax.swing.*;

public class TestPerson {

    public static void main(String[] args) {

        String fn,ln,output = "";

        Person NSname = new Person("Not supplied","Not supplied");

        fn=JOptionPane.showInputDialog("Please enter the first name of the second person");
        ln=JOptionPane.showInputDialog("Please enter the last name of the second person");

        output+="*****Person Class Tester*****" +
                "\n\nCalling the Person() constructor....." +
                "\nValue of first Person object is: " + NSname.toString() +
                "\n\nCalling the Person(String,String) constructor after getting user-supplied values..." +
                "\nValue of second Person object is: First name: " + fn + "  Last name: " + ln ;


        JOptionPane.showMessageDialog(null,output,"",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);

    }
}
