// สรวิชญ์ ทัศดร 673380065-6 sec.1
public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(double width , double height) {
        super((int)width,(int)height);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getCircumference(){
        super.getCircumference();
        return 2 * (width + height);
    }

    @Override
    public double getArea(){
        super.getArea();
        return width * height;
    }
}
