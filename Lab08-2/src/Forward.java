/* สรวิชญ์ ทัศดร 673380065-6 Sec.1 */
public class Forward implements RoleBehavior{
    private double c;
    private String j;
    public Forward(double cost , String jobDescription) {
        this.c = cost;
        this.j = jobDescription;
    }
    @Override
    public double cost() {
        return 3000;
    }

    @Override
    public String jobDescription() {
        return "Forward";
    }
}
