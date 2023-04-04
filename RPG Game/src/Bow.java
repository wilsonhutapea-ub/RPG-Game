public class Bow extends Weapon{

    Bow(int atk, String name, boolean isBroken, int condition){
        super(atk, name, isBroken, condition);
    }

    @Override
    int use() {
        System.out.println(getName() + "was used");
        return super.use();
    }

}
