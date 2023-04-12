public class Character {
    private String name;
    private int hp;
    private int maxHp;
    private int def = 0;
    private int level = 1;
    String role;

    Character(){}

    Character(String name, int level, int hp, int def, String role){
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.maxHp = hp;
        this.def = def;
        this.role = role;
    }

    String getName(){
        return this.name;
    }
    int getHp(){
        return this.hp;
    }
    int getMaxHp(){
        return this.maxHp;
    }
    int getDef(){
        return this.def;
    }
    int getLevel(){
        return this.level;
    }
    void setHp(int hp){
        this.hp = hp;
    }
    void setDef(int def){
        this.def = def;
    }
    void setLevel(int lvl){
        this.level = lvl;
    }
    void displayStats(int baseAtk){
        System.out.printf(
                "-- Character Info --\n" +
                "Name: %s\n" +
                "HP: %d\n" +
                "Def: %d\n" +
                "Atk: %d\n" +
                "Role: %s\n\n",
                name,hp,def,baseAtk,role);
    }

    void attack(Character opponent, int baseAtk, Weapon wpn){
        int totalDmg = level * baseAtk + wpn.use() - opponent.defense(baseAtk) + Weapon.randomAtk(wpn);
        int newHp = opponent.getHp() - totalDmg;
        opponent.setHp(newHp);
        opponent.setDef(0);
        printDamage(opponent, totalDmg);
    }

    void doubleAttack(Character opponent, int baseAtk, Weapon wpn){
        this.attack(opponent, baseAtk, wpn);
        this.attack(opponent, baseAtk, wpn);
    }

    int defense(int baseAtk){
        return baseAtk * level / 2;
    }

    void printDamage(Character opponent, int totalDmg){
        System.out.printf("%s attacks %s.\n", this.name, opponent.getName());
        System.out.println("Damage done: " + totalDmg);
        System.out.println(opponent.getName() + "'s defense is broken!\n");
    }
}
