import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        System.out.println("Odd or Even");
        Scanner input= new Scanner(System.in);
        System.out.print("Enter number: ");
        int num1 = input.nextInt();
        if (num1 % 2 ==0) {
            System.out.println("The number is even");
        }
        else {
            System.out.println("The number is odd");
        }

    }
}
