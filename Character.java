public class Character {
    // atributes

    private int lifePoints;
    private int defensePoints;
    private int attackPoints;
    public String img;

    // setters and getters

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public void setDefensePoints(int defensePoints) {
        this.defensePoints = defensePoints;
    }

    public int getDefensePoints() {
        return defensePoints;
    }

    public void setAttackPoints(int attackPoints) {
        this.attackPoints = attackPoints;
    }

    public int getAttackPoints() {
        return attackPoints;
    }

    public Character(String img, int lifePoints, int defensePoints, int attackPoints) {
        this.img = img;
        this.lifePoints = lifePoints;
        this.defensePoints = defensePoints;
        this.attackPoints = attackPoints;
    }

    public void printing() {
        System.out.println("----------------------------------------------");
        System.out.println(img);
        System.out.println("Life Points = " + getLifePoints());
        System.out.println("Defense Points = " + getDefensePoints());
        System.out.println("Attack Points = " + getAttackPoints());
        System.out.println("----------------------------------------------");
    }

    public void attack(Character c) {
        int lp;
        int newLP;

        lp = c.getLifePoints();
        newLP = lp - (getAttackPoints() - c.getDefensePoints()); // defense points
        c.setLifePoints(newLP);

        System.out.println("Attacking ............");
        System.out.println(c.img + "lifepoints = " + c.getLifePoints());
    }

    public void die()
    {
        System.out.println(img + " is dead!");
        System.out.println("G A M E   O V E R");
    }
}