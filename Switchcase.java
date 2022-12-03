import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the fruit: ");
        String fruit = input.next();

        switch (fruit) {
            case "Mango" -> System.out.println("I love mangoes");
            case "Apple" -> System.out.println("An apple a day keeps the doctor away");
            case "Banana" -> System.out.println("bananas are quick and easy to eat");
            default -> System.out.println("Invalid fruit");
        }

    }
}
