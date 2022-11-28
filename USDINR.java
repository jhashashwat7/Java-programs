import java.util.Scanner;

public class USDINR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount in Rupees: ");
        float R = input.nextFloat();
        System.out.println(0.01224*R + "USD");
    }
}
