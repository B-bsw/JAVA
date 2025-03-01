public class GameEnv {
    private Player player;
    private Monster monster;

    public GameEnv() {
        this.player = null;
        this.monster = null;
    }

    public GameEnv(Player player , Monster mon) {
        this.player = player;
        this.monster = mon;
    }

    public void setPlayer(double hp , double atk , double def , Knife item) {
        this.player = new Player(hp,atk,def,item);
    }

    public void setMonster(double hp , double atk , double def) {
        this.monster = new Monster(hp,atk,def);
    }

    public double getPlayerHP(){
        return player.getHp();
    }
    public double getMonsterHP(){
        return monster.getHp();
    }

    public void pressSpacebar(){
        if(monster.dodge()){
            System.out.println("Monster dodge!");
        }else {
            playerAttack();
        }
    }
    public void monsterAttack(){
        player.setHp(player.getHp() - getDamage(monster,player));
    }
    private void playerAttack(){
        double damage = getDamage(player,monster);
        monster.setHp(monster.getHp() - damage);
    }

    private double getDamage(Player py , Monster mt){
        double yaya;
        yaya = py.attack() * (1/mt.getDef());
        return yaya;
    }
    private double getDamage(Monster mt , Player py){
        double ayay;
        ayay = mt.attack() * (1/py.getDef());
        return ayay;
    }
}
