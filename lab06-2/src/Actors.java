public class Actors {
    private double hp;
    private double atk;
    private double def;

    public Actors() {
        this.hp = 0;
        this.atk = 0;
        this.def = 0;
    }

    public Actors(double hp , double atk , double def) {
        this.hp = hp;
        this.atk = atk;
        this.def = def;
    }

    protected double getAtk() {
        return this.atk;
    }

    public double getHp() {
        return this.hp;
    }

    public double getDef() {
        return this.def;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double attack(){
        return atk;
    }
}
