package labsheet1;

import javax.swing.*;
public class NumbersMenu {
    public static void main(String[] args) {
        int number,count=1,choice;
        double fact=1;
        do{
            String banner = "---------Iteration 1-------------";
            number = Integer.parseInt(JOptionPane.showInputDialog(banner + "Please enter any whole number: "));
            choice = Integer.parseInt(JOptionPane.showInputDialog("What would you like to do? " +
                    "\n\n1.Determine if the number is odd or even  \n2.Find the factorial of the number " +
                    "3.Quit the program"));
            switch (choice){
                case 1:
                    if(number % 2 == 0) {
                        System.out.println("The number you entered is even");
                    }else
                        System.out.println("The number you entered is odd");
                    break;
                case 2:
                    if(number<0)
                        System.out.println("Cannot get the factorial of a negative number!");
                    else
                        for(int i=1; i<=number;i++)
                            fact = fact *i;
                    System.out.println("The factorial of a number is \n" + fact );
                    break;
                case 3:
                    System.out.println("Quiting the program earlier than anticipated...goodbye");
                    break;
            }
            fact = 1;
        }while(count <=10);
    }
}


