/* สรวิชญ์ ทัศดร 673380065-6 Sec.1 */
public class Main {
    public static void main(String[] args) {
        Team team = new Team("Khon Kaen United","Khon Kaen");
        Player p1 = new Player(01,"Joey");
        p1.setRole(new GoalKeeper(4500,"GoalKeeper"));
        team.addMember(p1);
        Player p2 = new Player(2,"Tony");
        p2.setRole(new CenterBack(5000,"CenterBack"));
        team.addMember(p2);

        team.showPlayerInfo();
    }
}
