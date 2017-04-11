package sourth.menu;

import sourth.action.Action;

import java.util.Scanner;

/**
 * Created by dwarfawrrior on 3/4/2017.
 */
public class Main {
    static int action;
    public static boolean tital(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("What to do");
            System.out.println("If walk - type 1");
            System.out.println("If fight - type 2");
            System.out.println("If talk - type 3");
            System.out.println("If shutdown game - type 0");
            action = scanner.nextInt();
            switch (action) {
                case 0:
                    Action.shutDownTheGame();
                    return false;

                case 1:
                    Action.walk();
                    return false;
                case 2:
                    Action.fight();
                    return false;
                case 3:
                    Action.talk();
                    return false;
                default:
                    System.err.println("Try again");
                    break;
            }
        }

    }
}
