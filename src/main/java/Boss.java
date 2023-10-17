public class Boss extends GameEntity {
    private Weapon weapon;

    public String getInfo() {
        return "Boss health: " + this.getHealth() + "\nBoss damage: " + this.getDamage() +
                "\nBoss weapon: " + this.getWeapon().getWeaponName();
    }

    /*
        Распечатывание информации сделать в методе в классе Босса public String(?) printInfo(){}  ????
     */
    public void printInfo() {
        System.out.println("Boss health: " + this.getHealth() + "\nBoss damage: " + this.getDamage() +
                "\nBoss weapon: " + this.getWeapon().getWeaponName());
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
