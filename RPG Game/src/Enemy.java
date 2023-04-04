public class Enemy extends Character {
    static int baseAtk = 46;
    Weapon wpn = new Weapon(50, "Celurit", false, 100);

    Enemy(){}
    Enemy(String name, int level, int hp, int def, String role){
        super(name, level, hp, def, role);
    }

    void displayStats(){
        super.displayStats(baseAtk);
        wpn.displayStats();
    }

    void attack(Character ch){
        super.attack(null, baseAtk, wpn);
    }

    void remedy(){
        setHp(getHp()+100);
    }

    void ultimate(Character opponent){
        this.attack(opponent);
        this.remedy();
    }
}
