package ProblemSolving.problemsolvingweek3.exerciseb;

//Point.java
/*This class represents a point*/

public class Point {
    private int x;
    private int y;

    public Point() {
        this(0,0);
    }

    public Point(int x, int y) {
        setX(x);
        setY(y);
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String toString() {
        return "(" + getX() + "," + getY()+")";
    }

    public boolean equals(Point p) {
    	if(p.getX() == getX() && p.getY() == getY())
    		return true;

    	return false;
    }

    public void setPoint(Point p){
        setX(p.getX());
        setY(p.getY());
    }

    public void moveHorizontally(int units){
        setX(getX()+units);
    }

    public void moveVertically(int units){
        setY(getY()+units);
    }

}
