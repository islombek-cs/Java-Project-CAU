public class ProSecond {
    private double length;
    private double breadth;

    public ProSecond(){
        length = 0;
        breadth = 0;
    }

    public ProSecond(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public double area(){
        return this.breadth * this.length;
    }

    public double perimeter(){
        return 2 *  (this.length+this.breadth);
    }

}
