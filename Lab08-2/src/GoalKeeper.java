/* สรวิชญ์ ทัศดร 673380065-6 Sec.1 */
public class GoalKeeper implements RoleBehavior{
    private double c;
    private String j;
    public GoalKeeper(double cost , String jobDescription) {
        this.c = cost;
        this.j = jobDescription;
    }

    @Override
    public double cost(){
        return c;
    }

    @Override
    public String jobDescription(){
        return j;
    }
}
