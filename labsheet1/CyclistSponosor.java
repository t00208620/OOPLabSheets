import javax.swing.JOptionPane;
public class CyclistSponosor {
    public static void main(String[] args) {

        String name, kmAsString;
        int km, totalDistance = 0;
        final float kmRateOne = 1.75f, kmRateTwo = 2.50f;
        float moneyDue=0;

        name = JOptionPane.showInputDialog("Please enter your name");

        kmAsString = JOptionPane.showInputDialog("Please enter the number of km cycled");

        km = Integer.parseInt(kmAsString);


        if (km <= 10) {
            moneyDue += km * kmRateOne;
        }
            else{
            moneyDue += (km-10) * kmRateTwo + 10*kmRateOne;
    }


        JOptionPane.showMessageDialog(null,"Name: "+name+
                "\nDistance cycled: "+km+
                "\nSponsorship amount due: " + String.format("%.2f",moneyDue,"Receipt",JOptionPane.INFORMATION_MESSAGE));


    }
}
