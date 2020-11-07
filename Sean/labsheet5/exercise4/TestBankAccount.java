package labsheet5.exercise4;

import javax.swing.*;

public class TestBankAccount {
    public static void main(String[] args) {

        String output="";

        BankAccount NA = new BankAccount("Owner not Available", 0, 0);

        output+= "Calling the no-argument BankAccount constructor. The first BankAccount details are: " +
                 "\n\n " + NA.toString();


        BankAccount MA = new BankAccount("Richy Rich", 2343243, 0.75);

        output+= "\n\nCalling the multi-argument BankAccount constructor. The second BankAccount details are: " +
                "\n\n " + MA.toString();


        BankAccount B1 = new BankAccount("Owner not Available", 0, 0.5);

        output+= "\n\nNow calling the setInterestRate() method to change the interest rate to 0.5." +
                "\n\nThe first BankAccount object details are:" +
                "\n\n" + B1.toString();


        BankAccount B2 = new BankAccount("Richy Rich", 2343243, 0.5);

        output+= "\n\nThe second BankAccount object details are:" + "\n\n" + B2.toString();

        JOptionPane.showMessageDialog(null,output,"BankAccount Object Data",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
