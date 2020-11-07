package labsheet7.exercise3;

public class Student {

    private int id;
    private String name;
    private String department;


    public Student (int id, String name, String department){
        setName(name);
        setId(id);
        setDepartment(department);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public String toString() {
        return "Name: " + name + "  ID: " + id + "  Department: " + department;
    }
}
