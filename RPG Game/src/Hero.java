public class Hero extends Character {
    static int baseAtk = 58;

    Hero(String name, int level, int hp, int def, String role){
        super(name, level, hp, def, role);
    }

    void displayStats(){
        super.displayStats(baseAtk);
    }

    void attack(Character ch){
        Weapon wpn = new Weapon(50, "Keris", false, 100);
        super.attack(ch, baseAtk, wpn);
    }

    void heal(){
        setHp(getHp()+100);
    }

    void ultimate(Character opponent){
        Weapon wpn = new Weapon(50, "Keris", false, 100);
        this.doubleAttack(opponent, baseAtk, wpn);
        if(opponent.getHp() <= (0.2*opponent.getMaxHp())){
            this.attack(opponent);        
        }
        this.heal();
    }
}
