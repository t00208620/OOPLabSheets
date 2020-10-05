package labsheet4.exercise3;

import javax.swing.*;

public class TestBook {
    public static void main(String[] args) {
        String output = "";

        Book b1 = new Book();

        output += "Calling the no-argument Book constructor." +
                "The first Book object details are:\n\n" + b1.toString();

        Book b2 = new Book(" The DaVinciCode", " 64564566",  19.99,  348);


        output += "\n\nCalling the multi-argument Computer constructor. " +
                "The second Book object details are: \n\n" + b2.toString();


        JOptionPane.showMessageDialog(null, output, "Book Object Data",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}