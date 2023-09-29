import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a sentence:");
        System.out.println("No inputs will end the program");

        while (true) {
            String input = scanner.nextLine();
            String[] wordsArray = input.split(" ");
            System.out.println(wordsArray[wordsArray.length - 1]);
            if (input.equals("")) {
                break;
            }
        }
    }
}