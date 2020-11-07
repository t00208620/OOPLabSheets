package labsheet7.exercise3;

public class TestCollegeApp {
    public static void main(String[] args) {

        Student s1 = new Student(154345, "Jake", "Computing");
        Student s2 = new Student(234532, "Mary", "Creative Media");
        Student s3 = new Student(453726, "Tommy", "Computing");
        Student s4 = new Student(623456, "Peter", "Creative Media");

        Student computingStudents[] = new Student[10];
        computingStudents[0] = s1;
        computingStudents[1] = s3;

        Student creativeMediaStudents[] = new Student[10];
        creativeMediaStudents[0] = s2;
        creativeMediaStudents[1] = s4;

        Department creativeMediaDepartment = new Department("Creative Media", creativeMediaStudents);
        Department computingDepartment = new Department("Computing", computingStudents);

        Department allDept[] = new Department[5];
        allDept[0] = creativeMediaDepartment;
        allDept[1] = computingDepartment;

        Institute institute = new Institute("ITT", allDept);

        System.out.println(institute);

        System.out.print("Total students in institute: ");
        System.out.println((institute.getTotalStudents()));

        System.out.println("\n\nJake now moving from the Computing dept to the Creative Media dept");

        creativeMediaStudents[2] = s1;
        s1.setDepartment("Creative Media");
        computingStudents[0] = null;

        int creativeMediaSubscript = -1, computingSubscript = -1;

        if (creativeMediaSubscript != -1 && computingSubscript != -1) {//to check their each not 0 as 0 is the default

            Student[] allDeptStudents = allDept[computingSubscript].getStudents();

            int j;

            for (j = 0; j < allDeptStudents.length; j++) {
                if (allDeptStudents[j] != null) {
                    if (allDeptStudents[j].getId() == 154345) {
                        System.out.println("\nFound Jake!\n");

                        allDeptStudents[j].setDepartment("Creative Media");

                        allDept[creativeMediaSubscript].getStudents()[2] = allDeptStudents[j];
                        allDeptStudents[j] = null;

                        break;
                    }
                }
            }
            if (j == allDeptStudents.length)
                System.out.println("\nCouldn't find Jake\n");
        }
            System.out.println(institute);
        }
    }
