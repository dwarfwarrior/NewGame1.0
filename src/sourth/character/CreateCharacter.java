package sourth.character;

import javax.swing.*;

/**
 * Created by dwarfawrrior on 2/4/2017.
 */
public class CreateCharacter {
    public void createCharacter(){
        Character character = new Character();
        character.setName(JOptionPane.showInputDialog(null, "Set name your Hero"));
        System.out.println(character.getName());
        character.setStats();
        System.out.println(character.getDamage());
    }
}
