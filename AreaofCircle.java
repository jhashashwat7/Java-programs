import java.util.Scanner;

public class AreaofCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius: ");
        float radius = input.nextFloat();
        float area = (float) (Math.PI*radius*radius);
        System.out.println("Area: "+ area);
    }
}
