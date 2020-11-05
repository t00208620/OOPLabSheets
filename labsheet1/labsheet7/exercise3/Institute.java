package labsheet7.exercise3;

public class Institute {

    private String instituteName;
    private Department departments[];
    //private static int count;
    //private int totalStudents;

    Institute(String instituteName, Department departments[]) {
        setDepartments(departments);
        setInstituteName(instituteName);
        // setTotalStudents(count);
        // incrementCount();
    }


   /* private static void incrementCount()
        count=count+1;
    }

    private static void count()
        count++;
    }*/

    public String getInstituteName() {
        return instituteName;
    }

    public void setInstituteName(String instituteName) {
        this.instituteName = instituteName;
    }

    public Department[] getDepartments() {
        return departments;
    }

    public void setDepartments(Department[] departments) {
        this.departments = departments;
    }



        // public void setTotalStudents(int totalStudents)
        //  this.totalStudents = totalStudents;
        //  }

        public String toString () {
            String str = "Name: " + getInstituteName() + "\n\nDpartments: ";

            for (int i = 0; i < getDepartments().length; i++)
                if (departments[i] != null)
                    str += departments[i];

            return str;
        }
    public int getTotalStudents() {
        int totalStudents = 0;
        Student[] students;

        for (int i = 0; i < departments.length; i++) {
            if (departments[i] != null) {
                students = departments[i].getStudents();

                for (int j = 0; j < students.length; j++){
                    if (students[j] != null)

                        totalStudents++;//keep track of total students
            }
        }
    }
            return totalStudents;

        }
}


