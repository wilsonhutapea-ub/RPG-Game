class Game {
    public static void main(String[] args) {

        System.out.println("Hello World!");

        Enemy prowler = new Enemy("Prowler", 1, 500, 50, "Assassin");
        Hero spideyNoir = new Hero("Spider-man Noir", 1, 500, 50, "Unknown");
        prowler.displayStats();
        spideyNoir.attack(prowler);
        prowler.displayStats();

    }
}







