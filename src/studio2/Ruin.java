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
        while(startAmount < winLimit && 0 < startAmount){
            
        }
    }
}
