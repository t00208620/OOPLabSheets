package ProblemSolving.problemsolvingweek3.exercisec;

//Fraction.java
/*This instantiable class represents a mathematical fraction*/

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {
        this(0,1);
    }

    public Fraction(int numerator, int denominator) {
        setNumerator(numerator);
        setDenominator(denominator);
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public String toString() {
        return  + getNumerator() + "/" + getDenominator();
    }

    public boolean equals(Fraction f) {
    	if(getNumerator()/getDenominator() == f.getNumerator()/f.getDenominator())
    		return true;

    	return false;
    }

    public Fraction copy(){
       return new Fraction(getNumerator(),getDenominator());
    }

    public Fraction add(Fraction f){
        int newNumerator = getNumerator()*f.getDenominator()+getDenominator()*f.getNumerator();
        int newDenominator = getDenominator()*f.getDenominator();

        return new Fraction(newNumerator,newDenominator);
    }

    public Fraction subtract(Fraction f){
        int newNumerator = getNumerator()*f.getDenominator()-getDenominator()*f.getNumerator();
        int newDenominator = getDenominator()*f.getDenominator();

        return new Fraction(newNumerator,newDenominator);
    }

    public Fraction multiply(Fraction f){
        int newNumerator = getNumerator()*f.getNumerator();
        int newDenominator = getDenominator()*f.getDenominator();

        return new Fraction(newNumerator,newDenominator);
    }

    public Fraction divide(Fraction f){
        int newNumerator = getNumerator()*f.getDenominator();
        int newDenominator = getDenominator()*f.getNumerator();

        return new Fraction(newNumerator,newDenominator);
    }
}
