public class Player extends Actors{
    private Knife item;

    public Player() {
        super();
    }
    public Player(double hp , double atk , double def , Knife item) {
        super(hp,atk,def);
        this.item = item;
    }

    @Override
    public double attack() {
        return super.attack() + item.getAtk();
    }
}
