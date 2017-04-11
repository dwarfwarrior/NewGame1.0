package sourth.menu;

import sourth.action.Action;

import java.util.Scanner;

public class Main {
    public static void tital() {
        Scanner scanner = new Scanner(System.in);
        int action;
        while (true){
            System.out.println("What to do");
            System.out.println("If walk - type 1");
            System.out.println("If fight - type 2");
            System.out.println("If talk - type 3");
            System.out.println("If shutdown game - type 0");
            action = scanner.nextInt();
            switch (action) {
                case 0:
                    if (Action.shutDownTheGame()) return;
                    else break;
                case 1:
                    Action.walk();
                    break;
                case 2:
                    Action.fight();
                    break;
                case 3:
                    Action.talk();
                    break;
                default: System.err.println("Try again");
            }
        }
    }
}
