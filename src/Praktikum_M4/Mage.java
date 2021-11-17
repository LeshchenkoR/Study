package Praktikum_M4;

public class Mage {
    String name;
    int level, damage;
    String type;

    public Mage(String name, int level, int damage, String type) {
        this.name = name;
        this.level = level;
        this.damage = damage;
        this.type = type;
    }

    public String getInfo() {
        return  name + ", " + level + ", " + damage + ", " + type;
        //return this.name;
    }

    String fight(Mage mage) {
        if (this.type.equals("fire") && mage.type.equals("ice")) {
            return this.name;
        } else if (this.type.equals("ice") && mage.type.equals("earth")) {
            return this.name;
        } else if (this.type.equals("earth") && mage.type.equals("fire")) {
            return this.name;
        } else if (!this.type.equals(mage.type)) {
            return mage.name;
        } else {
            if (this.level > mage.level) {
                return this.name;
            } else if (this.level < mage.level) {
                return mage.name;
            } else {
                if (this.damage > mage.damage) {
                    return this.name;
                } else if (this.damage < mage.damage) {
                    return mage.name;
                } else return "draw";
            }
        }
    }

    public static void main(String[] args) {
        Mage mage1 = new Mage("Gendalf", 45, 60, "fire");
        Mage mage2 = new Mage("Dambldor", 38, 58, "fire");
        // System.out.println(mage1.fight(mage2));
        System.out.println(mage2.getInfo());
        ;
    }
}


