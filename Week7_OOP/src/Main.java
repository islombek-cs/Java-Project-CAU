public class Main {
    public static void main(String[] args) {
        ProFirst calculator = new ProFirst();

        int calc1 = calculator.add(1, 2);
        double calc2 = calculator.add(2.5, 3.5);
        int calc3 = calculator.add(1, 2, 5);
//        System.out.println(calc1);
//        System.out.println(calc2);
//        System.out.println(calc3);

//    -----------------------------------------------------------------------
        ProSecond ps1 = new ProSecond();
        ProSecond ps2 = new ProSecond(2, 3);
//        System.out.println("Area of rect2: " + ps2.area());
//        System.out.println("Perimeter of rect2: " + ps2.perimeter());


//---------------------------------------------------------------------------------
        ProThird employee = new ProThird("Islombek", 800.0);
//        System.out.println("Salary " + employee.getSalary());
//        employee.salaryRaise(10);
//        System.out.println("Updated Salary is "+employee.getSalary());

//---------------------------------------------------------------------------------
        ProFourth counter1 = new ProFourth(5);
        ProFourth counter2 = new ProFourth(10);

        counter1.decrement();
        counter2.increment();
//        System.out.println("Increased counter " + counter1.getCount());
//        System.out.println("Decrease counter " + counter2.getCount());

        swap_counters(counter1,counter2);

//        System.out.println("Increased counter " + counter1.getCount());
//        System.out.println("Decrease counter " + counter2.getCount());

//    -----------------------------------------------------------------------------
        ProFifth time = new ProFifth(23, 59, 30);
        System.out.println("Initial time: " + time);

        ProFifth newTime = time.addSeconds(30); // Add 1 minute and 30 seconds
        System.out.println("New time: " + newTime);

    }

    public static void swap_counters(ProFourth p1, ProFourth p2){
        int temp = p1.getCount();
        p1.setCount(p2.getCount());
        p2.setCount(temp);
    }

}
