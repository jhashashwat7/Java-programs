import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Principal: ");
        float principal = input.nextFloat();
        System.out.println("Enter Interest: ");
        float interest = input.nextFloat();
        System.out.println("Enter Time: ");
        float time = input.nextFloat();
        float SI = (principal*interest*time)/100;
        System.out.println("Simple Interest is: " + SI);
    }
}
