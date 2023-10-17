public class Main {
    public static void main(String[] args) {
        Weapon bossWeapon = new Weapon();
        bossWeapon.setWeaponName("Thor's hammer");
        bossWeapon.setWeaponType(WeaponType.HAMMER);
        Weapon skeletonWeapon = new Weapon();
        skeletonWeapon.setWeaponType(WeaponType.SWORD);
        skeletonWeapon.setWeaponName("Slain Ghost Sword");
        Boss boss = new Boss();
        boss.setHealth(500);
        boss.setDamage(50);
        boss.setWeapon(bossWeapon);
        System.out.println("Boss health: " + boss.getHealth() + "\nBoss damage: " + boss.getDamage() +
                "\nBoss weapon: " + boss.getWeapon().getWeaponName());
        System.out.println("------------------------------------------------------------------------");
        boss.printInfo();
        System.out.println("------------------------------------------------------------------------");
        Skeleton skeleton1 = new Skeleton();
        Skeleton skeleton2 = new Skeleton();
        skeleton1.setDamage(20);
        skeleton1.setHealth(200);
        skeleton1.setWeapon(skeletonWeapon);
        skeleton1.setArrows(15);
        skeleton1.printInfo();
        System.out.println("------------------------------------------------------------------------");
        skeleton2.setDamage(25);
        skeleton2.setHealth(250);
        skeleton2.setWeapon(skeletonWeapon);
        skeleton2.setArrows(20);
        skeleton2.printInfo();

    }
}