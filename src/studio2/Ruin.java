import java.util.Scanner;
public class Ruin {
    public static void main(String[] args){
    
        Scanner in = new Scanner(System.in);
        System.out.println("Starting amount?");
        double startAmount, winChance, winLimit;
        startAmount = in.nextDouble();
        System.out.println("Win Chance?");
        winChance = in.nextDouble();
        System.out.println("Win Limit?");
        winLimit = in.nextDouble();
        for (int totalSimulations = 0 ; totalSimulations < 5 ; totalSimulations ++){
            while(startAmount < winLimit && 0 < startAmount){
        if (winChance > Math.random()) {
            startAmount ++;
            System.out.println("You Win! Your new total is " + startAmount);
        } else {
            startAmount --;
            System.out.println("You Lost! Your new total is " + startAmount);
        }
       }
       if(startAmount >= winLimit){
        System.out.println("You Win!");
        startAmount = 0;
       }else{
        System.out.println("You Lost!");
        startAmount = 0;
       }

        }

       
    }
}
