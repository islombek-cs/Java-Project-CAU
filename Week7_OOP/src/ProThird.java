public class ProThird {
    private String name;
    private double salary;

    public ProThird(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public void salaryRaise(double percent){
        this.salary = this.salary + (percent * (this.salary/100.0));
    }

    public double getSalary(){
        return this.salary;
    }

}
