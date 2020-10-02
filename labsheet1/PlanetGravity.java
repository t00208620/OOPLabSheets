import java.util.Scanner;
public class PlanetGravity {
    public static void main(String[] args) {

        final float g=9.81f;
        double mp=0,me=0,re=0,rp=0;
        double gp,tl,bl;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the mass of planet Earth: ");
        me = input.nextDouble();
        System.out.print("Please enter the radius of planet earth: ");
        re = input.nextDouble();
        System.out.print("Please enter the mass of the other planet: ");
        mp = input.nextDouble();
        System.out.print("Please enter the radius of the other planet: ");
        rp = input.nextDouble();

        tl=g*mp*re*re;
        bl=me*rp*rp;
        gp=tl/bl;

        System.out.println("The acceleration due to gravity on the other planet is " + String.format("%.2f",gp) + " m/s/s");
    }
}
