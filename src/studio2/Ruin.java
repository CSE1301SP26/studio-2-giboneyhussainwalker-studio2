import java.util.Scanner;

public class Ruin {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Starting amount?");
        double startAmount, winChance, winLimit, currentAmount;
        int ruinCount = 0;
        int totalSimulations = 0;
        startAmount = in.nextDouble();
        currentAmount = startAmount;
        System.out.println("Win Chance?");
        winChance = in.nextDouble();
        System.out.println("Win Limit?");
        winLimit = in.nextDouble();
        for (totalSimulations = 0; totalSimulations < 5; totalSimulations++) {
            while (currentAmount < winLimit && 0 < currentAmount) {
                if (winChance > Math.random()) {
                    currentAmount++;
                    System.out.println("You Win! Your new total is " + currentAmount);
                } else {
                    currentAmount--;
                    System.out.println("You Lost! Your new total is " + currentAmount);
                }
            }
            if (currentAmount >= winLimit) {
                System.out.println("Day " + (totalSimulations + 1) + ": You Won!");
            } else {
                System.out.println("Day " + (totalSimulations + 1) + ": You Lost!");
                ruinCount ++;
            }
            currentAmount = startAmount;

        }
        System.out.println("You ruined " + ((ruinCount * 1.0) / (totalSimulations * 1.0)));

    }
}
