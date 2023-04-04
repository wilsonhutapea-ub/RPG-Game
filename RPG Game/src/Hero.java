public class Hero extends Character {
    static int baseAtk = 58;

    Hero(String name, int level, int hp, int def, String role){
        super(name, level, hp, def, role);
    }

    void displayStats(){
        super.displayStats(baseAtk);
    }

    void attack(Character ch){
        super.attack(ch, baseAtk, conjureWeapon());
    }

    void doubleAttack(Character ch){
        super.doubleAttack(ch, baseAtk, conjureWeapon());
    }

    void heal(){
        setHp(getHp()+100);
    }

    void ultimate(Character opponent){
        this.doubleAttack(opponent);
        if(opponent.getHp() <= (0.2*opponent.getMaxHp())){
            this.attack(opponent);        
        }
        this.heal();
    }

    private Weapon conjureWeapon(){
        return new Weapon(50, "Keris", false, 100);
    }
}
