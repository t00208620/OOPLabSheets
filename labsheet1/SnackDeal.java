import javax.swing.JOptionPane;
public class SnackDeal {

    public static void main(String[] args) {


        String name,course,snacksAsString;
        int snacks,cost=0;

        name = JOptionPane.showInputDialog("Please enter your name");

        course = JOptionPane.showInputDialog("Please enter your course");

        snacksAsString = JOptionPane.showInputDialog("How many snacks would you like?");

        snacks = Integer.parseInt(snacksAsString);

        snacks += cost;
        cost = snacks*2;

        JOptionPane.showMessageDialog(null,"Name: "+name+
                                      "\nCourse: "+course+
                                      "\nSnacks: "+snacksAsString+
                                      "\nCost: "+cost,"Receipt",JOptionPane.INFORMATION_MESSAGE);


    }
}
