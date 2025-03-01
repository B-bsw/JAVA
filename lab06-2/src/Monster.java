public class Monster extends Actors{
    public Monster(double hp , double atk , double def) {
        super(hp,atk,def);
    }

    public boolean dodge(){
        boolean k;
        k = Math.random() < 0.5;
        return k;
    }
}
