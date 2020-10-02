import java.util.Scanner;
public class HeightStats {

    public static void main(String[] args) {


        final float GLOBAL_AVERAGE_HEIGHT = 1.665f;
        float height = 0,totalheight=0, smallheight = 0, percentGAH = 0;
        int inbetween = 0;

        Scanner input = new Scanner(System.in);

        for (int i=1;i<=6;i++) {

            System.out.print("Loop " + i +  " - Please enter height: ");
            height = input.nextFloat();


            while (height < 0.5464 || height > 2.72) {
                System.out.print("Loop " + i +  " - Height value invalid!!! Please re-enter height: ");
                height = input.nextFloat();


            }
            totalheight += height;



            if(height > 1.3 && height <1.9)
                inbetween+=height;


            if(height > GLOBAL_AVERAGE_HEIGHT)
                percentGAH++;

        }

        if(height > smallheight)
            smallheight += height;

        System.out.print("\n-------------------------" +
                "\n    Height Statistics    " +
                "\n-------------------------" +
                "\n\n\nThe average of the heights entered is " + String.format("%.1f",totalheight/6) + "m" + "" +
                "\nThe smallest height value entered is " + String.format("%.2f",smallheight) + " " +
                "\nThe number of height values between 1.3m and 1.9m inclusive is " + String.format("%.0f",(float)inbetween) + "" +
                "\nThe percentage of height values exceeding the global average height is " + String.format("%.2f",percentGAH/6*100) + "%" + " ");
    }
}
