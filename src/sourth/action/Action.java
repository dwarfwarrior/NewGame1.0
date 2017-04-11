package sourth.action;

import sourth.menu.Main;

import java.util.Scanner;

/**
 * Created by dwarfawrrior on 3/4/2017.
 */
public class Action {
    public static void fight() {
        System.out.println("You fight");
        Main.tital();
    }

    public static void talk() {
        System.out.println("You talk");
        Main.tital();
    }

    public static void walk() {
        System.out.println("you walk");
        Main.tital();
    }

    public static boolean shutDownTheGame() {
        Scanner scanner = new Scanner(System.in);
        int action;
        System.out.println("You really want to exit?");
        while (true){
            System.out.println("If yes - type 1, if no - type 0");
            action = scanner.nextInt();
            switch (action) {
                case 1:
                    System.out.println("Goodbye!");
                    return false;
                case 0:
                    Main.tital();
                    return false;
                default:
                    System.err.println("Try again");
                    break;

            }
        }

    }

}
