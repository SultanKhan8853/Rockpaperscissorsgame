import java.util.Random;
import java.util.Scanner;

public class rockpaperscissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int playerWins = 0;
        int pcWins = 0;

        for (int round = 1; round <= 5; round++) {
            System.out.println("round" + round);
            System.out.println("1 = stone, 2 = paper , 3 = scissor, now enter what do you want to pick:");

            Random ran = new Random();
            int a = sc.nextInt();

            if (a == 1) {
                System.out.println("you have picked stone");
            } else if (a == 2) {
                System.out.println("you have picked paper");
            } else if (a == 3) {
                System.out.println("you have picked scissor");
            }

            int b = ran.nextInt(3) + 1;

            if (b == 1) {
                System.out.println("pc has picked stone");
            } else if (b == 2) {
                System.out.println("pc has picked paper");
            } else if (b == 3) {
                System.out.println("pc has picked scissor");
            }

            if (a == b) {
                System.out.println("the game is draw");
            } else if ((a == 1 && b == 3) || (a == 2 && b == 1) || (a == 3 && b == 2)) {
                System.out.println("You are the winner");
                playerWins++;
            } else {
                System.out.println("PC is the winner");
                pcWins++;
            }
        }

        System.out.println("Final result:");
        System.out.println("Player wins: " + playerWins);
        System.out.println("PC wins: " + pcWins);
        System.out.println("Draws: " + (5 - playerWins - pcWins));

        if (playerWins > pcWins) {
            System.out.println("Player is the final winner");
        } else if (pcWins > playerWins) {
            System.out.println("PC is the final winner");
        } else {
            System.out.println("The final result is a draw");
        }
    }
}