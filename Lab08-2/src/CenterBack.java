/* สรวิชญ์ ทัศดร 673380065-6 Sec.1 */
public class CenterBack implements RoleBehavior{
    private double c;
    private String j;
    public CenterBack(double cost , String jobDescription) {
        this.c = cost;
        this.j = jobDescription;
    }
    @Override
    public double cost(){
        return 100;
    }

    @Override
    public String jobDescription(){
        return "CenterBack";
    }
}
