package sourth.character;

/**
 * Created by dwarfawrrior on 1/4/2017.
 */
public class Character {
   private static String name;
   private static int damage;
   private static int exp;
   private static int level;


    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Character.name = name;
    }

    public static int getDamage() {
        return damage;
    }

    public static void setDamage(int damage) {
        Character.damage = damage;
    }

    public static int getExp() {
        return exp;
    }

    public static void setExp(int exp) {
        Character.exp = exp;
    }

    public static int getLevel() {
        return level;
    }

    public static void setLevel(int level) {
        Character.level = level;
    }

    void setStats() {
        Character.setDamage(2);
        Character.setExp(0);
        Character.setLevel(1);
    }

    public  void showStats(){
        System.out.println(getName());
        System.out.println(getDamage());
        System.out.println(getExp());
        System.out.println(getLevel());
    }

}
