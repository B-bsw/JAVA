// สรวิชญ์ ทัศดร 673380065-6 sec.1
import java.util.List;
import java.util.ArrayList;
public class Box {
    private List<Shape> shp;

    public Box() {
        this.shp = new ArrayList<>();
    }

    public double getTotalArea(){
        double tt = 0;
        for (Shape shp : shp){
            tt += shp.getArea();
        }
        return tt;
    }

    public double getTotalCircumference(){
        double tt = 0;
        for( Shape shp : shp ){
            tt += shp.getCircumference();
        }
        return tt;
    }

    public void add(Shape shp) {
        this.shp.add(shp);
    }
}
