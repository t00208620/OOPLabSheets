package labsheet9.exercise2;

//Ellipse.java
/*A instantiable class definition for an Ellipse, that directly
inherits from the abstract class Shape*/

public class Ellipse extends Shape {
    private double majorAxis;
    private double minorAxis;

    public Ellipse() {
        super("Ellipse");
        setMajorAxis(0);
        setMinorAxis(0);
    }

    public Ellipse(double majorAxis, double minorAxis) {
        super("Ellipse");
        setMajorAxis(majorAxis);
        setMinorAxis(minorAxis);
    }

    public void setMajorAxis(double majorAxis) {
        if (majorAxis>0)
            this.majorAxis = majorAxis;
        else
            this.majorAxis = 0;
    }

    public void setMinorAxis(double minorAxis) {
        if (minorAxis>0)
            this.minorAxis = minorAxis;
        else
            this.minorAxis = 0;
    }

    public double getMajorAxis() {
        return majorAxis;
    }

    public double getMinorAxis() {
        return minorAxis;
    }

    public double area() {
        return Math.PI*getMajorAxis()*getMinorAxis();
    }

    public double perimeter() {
        return 2*Math.PI*Math.sqrt((getMajorAxis()*getMajorAxis()+getMinorAxis()*getMinorAxis())/2);
    }

    public String toString() {
        return "Shape type: " + type + "\nArea: " + area() + "\nPerimeter: " + perimeter();
    }

}
