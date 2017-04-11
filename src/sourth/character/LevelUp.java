package sourth.character;

/**
 * Created by dwarfawrrior on 2/4/2017.
 */
public class LevelUp {
    public static void levelUp(){
        Character character = new Character();
        character.setDamage(character.getDamage() + 1);
        character.showStats();
        character.setLevel(character.getLevel() + 1);
    }
}
