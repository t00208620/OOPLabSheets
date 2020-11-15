package labsheet10.exercise1;

import labsheet7.exercise3.Department;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;

public abstract class Lecturer implements Person {

    private String name;
    private String address;
    private GregorianCalendar dateOfBirth;
    private String staffID;
    private String [] courseTaught;
    private GregorianCalendar dateOfAppointment;

    public Lecturer(String name, String address, GregorianCalendar dateOfBirth,
                    String staffID, String[] courseTaught,
                    GregorianCalendar dateOfAppointment) {
        setName(name);
        setAddress(address);
        setDateOfBirth(dateOfBirth);
        setStaffID(staffID);
        setCourseTaught(courseTaught);
        setDateOfAppointment(dateOfAppointment);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public GregorianCalendar getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(GregorianCalendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getStaffID() {
        return staffID;
    }

    public void setStaffID(String staffID) {
        this.staffID = staffID;
    }

    public String[] getCourseTaught() {
        return courseTaught;
    }

    public void setCourseTaught(String[] courseTaught) {
        this.courseTaught = courseTaught;
    }

    public GregorianCalendar getDateOfAppointment() {
        return dateOfAppointment;
    }

    public void setDateOfAppointment(GregorianCalendar dateOfAppointment) {
        this.dateOfAppointment = dateOfAppointment;
    }

    public abstract String getStatus();


    public abstract int getPointOnScale();

    public String toString() {

        String str = "\n\nLecturer name is" + getName() +
                "\nLecturer Address is" + getAddress() +
                "\nLecturer DateOfBirth is";

        SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy");
        if(getDateOfBirth()!=null)
        {
            //Need to get the date of birth as a Date for display purposes.
            //The toString() method from the GregorianCalendar class inherits
            //that from its superclass Calendar but this only displays the
            //calendar data in a non-friendly format like the default
            //toString() from the Object class

            Date dob = getDateOfBirth().getTime();

            //Need to use get the date of birth out on screen in a particular
            //way i.e. DD-MM-YYYY format. The SimpleDateFormat class in
            //java.text does the job. Interestingly, "MM" has to be in capitals
            //or else you would be displaying milliseconds rather than month

            String strDob = formatDate.format(dob);
            str+=strDob;
        }
        else
            str+="Undefined";

        str+=   "\nLecturer StaffID is:" + getStaffID() +
                "\nLecturer course Taught is:" + Arrays.toString(getCourseTaught()) +
                "\nLecturer Date Of Appointment is:" + formatDate.format(getDateOfAppointment().getTime()) +
                "\nLecturer Status is" + getStatus() +
                "\nLecturer Point on Scale is" + getPointOnScale();

            return str;
    }
}
