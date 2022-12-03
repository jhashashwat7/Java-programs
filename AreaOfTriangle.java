import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter height: ");
        float height = input.nextFloat();
        System.out.println("Enter base: ");
        float base = input.nextFloat();
        float area = (float) (0.5 * base * height);
        System.out.println("Area: " + area);
    }
}