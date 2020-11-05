package ProblemSolving.problemsolvingweek6;

//Employee.java
/*An instantiable Employee class that contains nested Address and Insurance  objects*/

public class Employee {

    private String name;
    private int id;
    private Address address;
    private Insurance insurance;

    public Employee(String name, int id, Address address, Insurance insurance) {
        setName(name);
        setId(id);
        setAddress(address);
        setInsurance(insurance);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    public String toString(){

        String insuranceText="";

        if(getInsurance()==null)
            insuranceText += "No insurance details";
        else
            insuranceText += getInsurance();

        return "Name:  " + getName() + "\nID: " + getId() + "\nAddress: " + getAddress() + "\nInsurance Details: " + insuranceText;
    }
}
