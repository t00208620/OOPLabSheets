package labsheet9.exercise2;

public class Triangle extends Shape {

    private double side1Length;
    private double side2Length;
    private double side3Length;

    public Triangle(){
        super("Triangle");
        setSide1Length(0);
        setSide2Length(0);
        setSide3Length(0);
    }

    public Triangle(double side1Length, double side2Length, double side3Length){
        super("Triangle");
        setSide1Length(side1Length);
        setSide2Length(side2Length);
        setSide3Length(side3Length);
    }

    public double getSide1Length() {
        return side1Length;
    }

    public void setSide1Length(double side1Length) {
        this.side1Length = side1Length;
    }

    public double getSide2Length() {
        return side2Length;
    }

    public void setSide2Length(double side2Length) {
        this.side2Length = side2Length;
    }

    public double getSide3Length() {
        return side3Length;
    }

    public void setSide3Length(double side3Length) {
        this.side3Length = side3Length;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1Length=" + side1Length +
                ", side2Length=" + side2Length +
                ", side3Length=" + side3Length +
                '}';
    }

    public double area(){

    }

    public double perimeter(){

    }


}
