package labsheet2;
import javax.swing.JOptionPane;
public class NumbersArray {
    public static void main(String[] args) {

        double[] numbers = {22.3d, 45.6d, 27.4d, 56.6d, 73.2d, 11.5d, 87.4d, 23.8d};

        String output;

        output = "The largest value in the array is " + largest(numbers) +
                "\nThe average value in the array is " + String.format("%.3f",verage(numbers)) +
                "\nThe list of values above the average is: " + aboveAverage(numbers,verage(numbers));

        JOptionPane.showMessageDialog(null,output,"Array Stats",JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }

    public static double largest(double[] numbers) {
        double largest = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }

        }
        return largest;
    }

    public static double verage(double[] numbers){
        double total=0,avg=0;
        for(int i = 0;i<numbers.length;i++){
            total+=numbers[i];
            avg=total/numbers.length;
        }
        return avg;
    }

    public static String aboveAverage(double[] numbers,double average)
    {
        String listAboveAverage="";

        for(int i=0; i<numbers.length; i++)
            if(numbers[i]>average)
                listAboveAverage += numbers[i] + " ";

        return listAboveAverage;
    }
}


