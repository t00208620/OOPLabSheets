package labsheet9.exercise2;

//Triangle.java
/*A instantiable class definition for a Triangle, that directly
inherits from the abstract class Shape*/

public class Triangle extends Shape {
    private double side1Length;
    private double side2Length;
    private double side3Length;

    public Triangle() {
        super("Triangle");
        setSide1Length(0);
        setSide2Length(0);
        setSide3Length(0);
    }

    public Triangle(double side1Length, double side2Length, double side3Length) {
        super("Triangle");
        setSide1Length(side1Length);
        setSide2Length(side2Length);
        setSide3Length(side3Length);
    }

    public void setSide1Length(double side1Length) {
        if (side1Length>0)
            this.side1Length = side1Length;
        else
            this.side1Length = 0;
    }

    public void setSide2Length(double side2Length) {
        if (side2Length>0)
            this.side2Length = side2Length;
        else
            this.side2Length = 0;
    }

    public void setSide3Length(double side3Length) {
        if (side3Length>0)
            this.side3Length = side3Length;
        else
            this.side3Length = 0;
    }

    public double getSide1Length() {
        return side1Length;
    }

    public double getSide2Length() {
        return side2Length;
    }

    public double getSide3Length() {
        return side3Length;
    }

    public double area() {
        double s = (getSide1Length()+getSide2Length()+getSide3Length())/2;

        return Math.sqrt(s*(s-side1Length)*(s-side2Length)*(s-side3Length)); //use length attributes directly now as the accessors are already tested
    }

    public double perimeter() {
        return getSide1Length()+getSide2Length()+getSide3Length();
    }

    public String toString() {
        return "Shape type: " + type + "\nArea: " + area() + "\nPerimeter: " + perimeter();
    }
}
