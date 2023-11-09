import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String toRemove;
        boolean verify = false;

        // Get a phrase from the user
        System.out.println("Give me a word or a phrase.");
        String phrase = scanner.nextLine();

        // Get a letter from the user
        do {
            System.out.println("Give me a letter or character.");
            toRemove = scanner.nextLine();

            if (toRemove.length() > 1) {
                System.out.println("Only give me one.");
            } else if (!phrase.contains(toRemove)){
                System.out.println("The phrase does not contain that character.");
            } else {
                verify = true;
            }
        } while (!verify);
        verify = false;

        // Remove character from letter
        phrase = phrase.replace(toRemove, "");

        // Print output
        System.out.println(phrase);
    }
}