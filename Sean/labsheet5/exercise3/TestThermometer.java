package labsheet5.exercise3;

import javax.swing.*;

public class TestThermometer {
    public static void main(String[] args) {

        String output="";

        Thermometer t1 = new Thermometer(35);

        output += "******Thermometer Testing******\n\nCalling the single-argument constructor.....setting the temperature of " +
                "first thermometer to 35C \nFirst Thermometer: " + t1.toString();

        Thermometer t2 = new Thermometer();

        output += "\n\nCalling the no-argument constructor.....setting the temperature of second " +
                "thermometer to 0C \nSecond Thermometer: " + t2.toString();

        Thermometer t3 = new Thermometer(25);

        output += "\n\nCalling setTemperature().....setting the temperature of second " +
                "thermometer to 25C \nSecond Thermometer: " + t3.toString();

       JOptionPane.showMessageDialog(null,output,"",
                JOptionPane.INFORMATION_MESSAGE);

        int currentTemp = Integer.parseInt(JOptionPane.showInputDialog("Please enter the current temperature of the first thermometer to 48C"));

        Thermometer t4 = new Thermometer(currentTemp);
        t4.setTemperature(currentTemp);
        t4.setTemperature(35);



        JOptionPane.showMessageDialog(null,"******Thermometer Testing******\n\nCalling setTemperature()....setting " +
                "the temperature of first thermometer to " + currentTemp + "\nFirst Thermometer: " + t4.toString());


        System.exit(0);
    }
}
