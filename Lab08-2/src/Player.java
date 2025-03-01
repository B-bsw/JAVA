/* สรวิชญ์ ทัศดร 673380065-6 Sec.1 */
public class Player {
    private int id;
    private String name;
    private RoleBehavior role;

    public Player(int id , String name) {
        this.id = id;
        this.name = name;
    }

    public String getPlayerInfo(){
        return id + "\t" + name + "\t" + role.jobDescription() + "\t\t" + role.cost();
    }

    public void setRole(RoleBehavior role) {
        this.role = role;
    }
}
