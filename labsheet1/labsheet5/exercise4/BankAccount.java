package labsheet5.exercise4;

public class BankAccount {

    private String owner;
    private int number;
    private double interestRate;

    public BankAccount() {

    }
        public BankAccount(String owner,int number,double interestRate){
        setOwner(owner);
        setNumber(number);
        setInterestRate(interestRate);
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public String toString () {
        return "Owner:  " + getOwner() + "  Account Number:  " + getNumber() + "  Interest Rate  " + getInterestRate();
    }
}

