// สรวิชญ์ ทัศดร 673380065-6 sec.1
public class Circle extends Shape{
    private double radius;
    private double pie = 3.1415926;

    public Circle(double radius) {
        super();
        this.radius = radius;
    }
    
    public Circle(int x , int y , double radius) {
        super(x,y);
        this.radius = radius;
    }

    @Override
    public double getCircumference(){
        super.getCircumference();
        return 2 * pie * radius;
    }

    @Override
    public double getArea(){
        super.getArea();
        return pie * (radius * radius);
    }
}
