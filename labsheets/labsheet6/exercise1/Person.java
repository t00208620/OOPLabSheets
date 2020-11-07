package labsheet6.exercise1;

public class Person {

    private String firstname;
    private String lastname;

    public Person(){
    }
    public Person(String firstname, String lastname){
        setFirstname(firstname);
        setLastname(lastname);
    }

        public String getFirstname () {
            return firstname;
        }

        public void setFirstname (String firstname){
            this.firstname = firstname;
        }

        public String getLastname () {
            return lastname;
        }

        public void setLastname (String lastname){
            this.lastname = lastname;
        }

        public String toString () {
            return"First name:  " + getFirstname() + "  Last name:  " + getLastname();
        }
}

