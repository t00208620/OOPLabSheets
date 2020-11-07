package labsheet5.exercise5;

public class BankAccount {

    private String owner;
    private int number;
    private double interestRate;
    private static int count;

    public BankAccount() {

    }
        public BankAccount(String owner, double interestRate){
        setOwner(owner);
        setInterestRate(interestRate);
        incrementCount();
        setNumber(count);
        }

    private static void incrementCount() {
        count=count+1;
    }

    private static void count(){
        count++;
            //OR
        //public static int getCount(){
          //  return count;
      //  }
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

