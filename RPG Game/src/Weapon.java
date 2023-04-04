class Weapon {

    private int atk;
    private String name;
    private boolean isBroken;
    private int condition = 100;

    Weapon(){}
    Weapon(int atk, String name, boolean isBroken, int condition){
        this.atk = atk;
        this.name = name;
        this.isBroken = isBroken;
        this.condition = condition;
    }
    
    int getAtk(){
        return this.atk;
    }
    String getName(){
        return this.name;
    }
    boolean getIsBroken(){
        return this.isBroken;
    }
    int getCondition(){
        return this.condition;
    }
    void setIsBroken(boolean isBroken){
        this.isBroken = isBroken;
    }
    void setCondition(int condition){
        this.condition = condition;
    }
    void displayStats(){
        System.out.printf("Weapon name: %s\n" +
                          "Weapon ATK: %d\n" +
                          "Weapon isBroken? %b\n" +
                          "Weapon condition: %d\n\n",
                           name,atk,isBroken,condition);
    }
    void repair(){
        condition = 100;
        isBroken = false;
    }
    int use(){
        condition -= 10;
        if(condition <= 0){
            isBroken = true;
        }
        return atk;
    }
    static int randomAtk(Weapon w){
        int r = 10 * (int) (3 * Math.random() + 1);
        return (int) (w.atk * r * 0.01);
    }
}