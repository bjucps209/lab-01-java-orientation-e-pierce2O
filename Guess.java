import java.util.*;

class Guess {
    public static void main(String[] args) {
        int secretNum = (int)(Math.random() * 10 + 1);
        Scanner scan = new Scanner(System.in);

        int guesses = 1;
        int guess; 
        do {
            System.out.print("Enter your guess: ");
            guess = Integer.parseInt(scan.nextLine());

            if (guess > secretNum) {
                System.out.println(guess + " is greater than the secret number.");
                guesses += 1;
            } else if (guess < secretNum) {
                System.out.println(guess + " is less than the secret number.");
                guesses += 1;
            } else {
                System.out.println("You got it!");
                System.out.println("It took you " + guesses + " guesses.");
        } }while (guess != secretNum); 
    }
}