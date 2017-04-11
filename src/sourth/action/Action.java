package sourth.action;

import sourth.menu.Main;

import java.util.Scanner;

/**
 * Created by dwarfawrrior on 3/4/2017.
 */
public class Action {
    public static void fight() {
        System.out.println("You fight");
        Main.tital(true);
    }

    public static void talk() {
        System.out.println("You talk");
        Main.tital(true);
    }

    public static void walk() {
        System.out.println("you walk");
        Main.tital(true);
    }

    public static void shutDownTheGame(boolean check) {
        Scanner scanner = new Scanner(System.in);
        int action;
        System.out.println("You really want to exit?");
        while (check == true){
            System.out.println("If yes - type 1, if no - type 0");
            action = scanner.nextInt();
            switch (action) {
                case 1:
                    System.out.println("Goodbye!");
                    check = false;
                    break;
                case 0:
                    check = false;
                    Main.tital(true);
                    break;
                default:
                    System.err.println("Try again");
                    break;

            }
        }

    }

}
