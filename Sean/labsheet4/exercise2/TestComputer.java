package labsheet4.exercise2;

import javax.swing.*;

public class TestComputer {
    public static void main(String[] args) {
        String output="";

        Computer c1 = new Computer();

            output += "Calling the no-argument Computer constructor." +
                    "The first Computer object details are:\n\n" + c1.toString();

          /*  Computer c2 = new Computer("Dell","Laptop",3.25,16,550.99);

            c2.setSpeed(-3.15);

        output += "\n\nCalling the multi-argument Computer constructor. " +
                "The second Computer object details are: \n\n" + c2.toString();

        Computer c3 = new Computer("Apple","Tablet",3.65,-10,-10);



        output += "\n\nCalling the multi-argument Computer constructor. " +
                "The third Computer object details are: \n\n" + c3.toString();*/


        JOptionPane.showMessageDialog(null,output,"Compter Object Data",
                JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);


    }
}
