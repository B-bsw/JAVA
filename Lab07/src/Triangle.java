// สรวิชญ์ ทัศดร 673380065-6 sec.1
import java.lang.Math;
public class Triangle extends Shape{
    private double base;
    private double height;
    private double c;

    public Triangle(double b , double h , double c) {
        this.base = b;
        this.height = h;
        this.c = c;
    }

    public Triangle(double b , double h) {
        this.base = b;
        this.height = h;
        this.c = Math.sqrt((base * base) + (height * height));
    }

    @Override
    public double getCircumference(){
        super.getCircumference();
        return base + c + height;
    }

    @Override
    public double getArea(){
        super.getArea();
        return 0.5 * base * height;
    }
}
