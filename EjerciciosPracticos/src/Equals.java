import java.util.Scanner;

public class Equals {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
//        String word;
//
//        do {
//            System.out.print("Enter a word: ");
//            word = input.nextLine();
//        } while (!word.equalsIgnoreCase("Exit"));
//
//        System.out.println("Goodbye");
        System.out.print("Enter a number from 1-100: ");
        int limit = input.nextInt();

        if (limit < 100) {
            for (int i = 1; i <= limit; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
            System.out.println("Goodbye");
        } else System.out.println("Invalid number.");
    }
}
