import java.util.ArrayList;

public class StudentRunner {
    public void run() {
        ArrayList<Student> students = new ArrayList<>();
        Student s1=new Student("Umar", 230000L);
        students.add(s1);

        students.add(new Student("Aziz", 2311111L));
        students.add(new Student("Alan", 2322222L));
        students.get(0).addGrades(99F);
        students.get(0).addGrades(90F);
        students.get(0).addGrades(69F);

        students.get(1).addGrades(89F);
        students.get(1).addGrades(78F);
        students.get(1).addGrades(89F);

        students.get(2).addGrades(99F);
        students.get(2).addGrades(99F);
        students.get(2).addGrades(99F);


        for (Student st : students) {

            System.out.println("Score of Student: " + st.getName() + ", whose ID is:" + st.getID());

            System.out.println(st.determineGradeLetter(st.averageGrade()));

            System.out.println("Her Average Grade is: " + st.averageGrade());
        }
    }
}

