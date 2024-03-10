import java.util.ArrayList;

public class Student {
    private String name;
    private long ID;
    private ArrayList<Float> grades;

    public Student(String name, long ID) {
        this.name = name;
        this.ID = ID;
        this.grades=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }
    public  void addGrades(float grade){
        grades.add(grade);
    }
    public  void removeGrades(float grade){
        grades.remove(grade);
    }

    public char determineGradeLetter(float avergrade){
        if(avergrade >90)
            return 'A';
        else if(avergrade<=90 && avergrade>=80)
            return 'B';
        else if(avergrade<80&& avergrade>=70)
            return 'C';
        else if(avergrade<70&& avergrade>=60)
            return 'D';
        else
            return  'F';
    }

    public float averageGrade()
    {
        if(grades.isEmpty())
            return 0.0F;
        float allgrades=0;
        for(float grade:grades){
            allgrades+=grade;

        }
        return  allgrades/grades.size();
    }

}

