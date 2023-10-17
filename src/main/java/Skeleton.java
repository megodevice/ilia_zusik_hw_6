public class Skeleton extends Boss {
    private int arrows;

    public int getArrows() {
        return arrows;
    }

    public void setArrows(int arrows) {
        this.arrows = arrows;
    }

    @Override
    public void printInfo() {
        System.out.println("Skeleton health: " + this.getHealth() + "\nSkeleton damage: " + this.getDamage() +
                "\nSkeleton weapon: " + this.getWeapon().getWeaponName() + "\nNumber of arrows: " + this.getArrows());
    }

    @Override
    public String getInfo() {
        return "Skeleton health: " + this.getHealth() + "\nSkeleton damage: " + this.getDamage() +
                "\nSkeleton weapon: " + this.getWeapon().getWeaponName() + "\nNumber of arrows: " + this.getArrows();
    }
}
