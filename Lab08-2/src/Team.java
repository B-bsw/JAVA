/* สรวิชญ์ ทัศดร 673380065-6 Sec.1 */
import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private String address;
    List<Player> play = new ArrayList<Player>();

    public Team(String name , String address) {
        this.name = name;
        this.address = address;
    }

    public void addMember(Player play){
        this.play.add(play);
    }

    public void showPlayerInfo(){
        int i = 1;
        System.out.println("Team Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("\tPlayer Informatios");
        System.out.println("--------------------------------------------------------------");
        System.out.println("No.\tID\tName\tRole\t\tCost");
        System.out.println("--------------------------------------------------------------");
        for (Player p : play){
            String txt = p.getPlayerInfo();
            System.out.println(i + "\t" + txt);
            i++;
        }
        System.out.println("--------------------------------------------------------------");
    }

}
