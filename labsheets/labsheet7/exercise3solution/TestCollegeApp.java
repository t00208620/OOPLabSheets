package labsheet7.exercise3solution;

//TestCollegeApp.java
/*A driver class to test out the functionality of the Institute, Student and Department
classes*/

public class TestCollegeApp {
    public static void main (String[] args) {

        Student s1 = new Student("Jake", 154345, "Computing");
        Student s2 = new Student("Mary", 234532, "Creative Media");
        Student s3 = new Student("Tommy", 453726, "Computing");
        Student s4 = new Student("Peter", 623456, "Creative Media");

        Student computingStudents[] = new Student[10];
        computingStudents[0] = s1;
        computingStudents[1] = s3;

        Student creativeMediaStudents[] = new Student[10];
        creativeMediaStudents[0] = s2;
        creativeMediaStudents[1] = s4;

        Department creativeMedia = new Department("Creative Media", creativeMediaStudents);
        Department computing = new Department("Computing", computingStudents);

        Department departments[] = new Department[5];
        departments[0] = creativeMedia;
        departments[1] = computing;

        Institute institute = new Institute("Insitute of Technology, Tralee", departments);

        System.out.println(institute);

        System.out.print("Total students in institute: ");
        System.out.print(institute.getTotalStudents());

        System.out.println("\n\nJake now moving from the Computing dept to the Creative Media dept");

        //The following code will move Jake the "easy" way :-)
        //creativeMediaStudents[2] = s1;
        //s1.setDept("Creative Media");
        //computingStudents[0] = null;

        //this does it the hard way!

        int creativeMediaSubscript=-1, computingSubscript=-1;

        for(int i=0;i<departments.length;i++) {
            if (departments[i] != null && departments[i].getName().equals("Creative Media"))
                creativeMediaSubscript = i;

            if (departments[i] != null && departments[i].getName().equals("Computing"))
                computingSubscript = i;

        }

        if (creativeMediaSubscript!=-1 && computingSubscript!=-1) {

            Student[] allDeptStudents = departments[computingSubscript].getStudents();

            int j;

            for (j = 0; j < allDeptStudents.length; j++) {
                if (allDeptStudents[j] != null) {
                    if (allDeptStudents[j].getId() == 154345) {
                        System.out.println("\nFound Jake!\n");

                        allDeptStudents[j].setDept("Creative Media");

                        departments[creativeMediaSubscript].getStudents()[2] = allDeptStudents[j];
                        allDeptStudents[j] = null;

                        break;
                    }
                }
            }

            if(j==allDeptStudents.length)
                System.out.println("\nCouldn't find Jake\n");
        }
        System.out.println(institute);
    }
}
