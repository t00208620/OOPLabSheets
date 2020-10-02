package labsheet2;
import javax.swing.*;
import java.util.*;
public class ComputerData {
    public static void main(String[] args) {

        int hdspace=0,totalNo=0,avghds=0,i=0;
        String hdspaceAsString, serialNo,processor="";
        boolean valid;

        serialNo = JOptionPane.showInputDialog("Please enter the serial number (<CR> to exit)");

        while (!serialNo.equals("")) {

            hdspaceAsString = JOptionPane.showInputDialog("Please enter hard-disk space");
            hdspace = Integer.parseInt(hdspaceAsString);


            if (hdspace <= 50 && hdspace >= 5000) {
                JOptionPane.showInputDialog("Please enter the processor type");


            }


             else {JOptionPane.showInputDialog("Invalid! Please re-enter hard-disk space");

            }
             if(Character.isDigit(hdspace))

             totalNo += hdspace;
             i++;

             avghds = totalNo/i;

        }

        JOptionPane.showMessageDialog(null,"The average diskspace available on the computers processed is: " + avghds +
                "\nThe price range of the computers is from ");
    }
}



