import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Finish Line");
        System.out.println("This is a two player game in which the goal is to get to position 10.");
        System.out.println("Instruction: A player will roll two dice and if one of the dice rolled the number of the next position or the sum " +
                "of the two dice equals the number of the next position, then the player can move to the next position." );
        System.out.print("Player 1 please type your name: ");
        String name1 = scan.nextLine();
        System.out.print("Player 2 plesae type your name: ");
        String name2 = scan.nextLine();
        FinishLine finishline = new FinishLine(name1, name2);
        System.out.println(finishline.getP1_name() + "'s position: " + finishline.getPosition1());
        System.out.println(finishline.getP2_name() + "'s position: " + finishline.getPosition2());
        while(finishline.getPosition1() != 10 || finishline.getPosition2() != 10) {
            System.out.println(finishline.getP1_name() + " will now roll the dice.");
            finishline.rollDice();
            System.out.println("Dice 1: " + finishline.getDice1());
            System.out.println("Dice 2: " + finishline.getDice2());
            if (finishline.getDice1() == finishline.getPosition1() + 1 || finishline.getDice2() == finishline.getPosition1() + 1 || finishline.getDice1() +
                    finishline.getDice2() == finishline.getPosition1() + 1) {
                finishline.incrementPosition1();
            }
            if (finishline.getPosition1() == 10) {
                System.out.println(finishline.getP1_name() + "'s position: " + finishline.getPosition1());
                System.out.println(finishline.getP2_name() + "'s position: " + finishline.getPosition2());
                break;
            }
            System.out.println(finishline.getP2_name() + " will now roll the dice.");
            finishline.rollDice();
            System.out.println("Dice 1: " + finishline.getDice1());
            System.out.println("Dice 2: " + finishline.getDice2());
            if (finishline.getDice1() == finishline.getPosition2() + 1 || finishline.getDice2() == finishline.getPosition2() + 1 || finishline.getDice1() +
                    finishline.getDice2() == finishline.getPosition2() + 1) {
                finishline.incrementPosition2();
            }
            if (finishline.getPosition2() == 10) {
                System.out.println(finishline.getP1_name() + "'s position: " + finishline.getPosition1());
                System.out.println(finishline.getP2_name() + "'s position: " + finishline.getPosition2());
                break;
            }
            System.out.println(finishline.getP1_name() + "'s position: " + finishline.getPosition1());
            System.out.println(finishline.getP2_name() + "'s position: " + finishline.getPosition2());
        }
        if (finishline.getPosition1() == 10) {
            System.out.println(finishline.getP1_name() + " wins!");
        }
        else {
            System.out.println(finishline.getP2_name() + " wins!");
        }

    }
}