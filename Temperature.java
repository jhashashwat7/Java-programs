import java.sql.SQLOutput;
import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        System.out.println("Celsius-Fahrenheit Convertor");
        Scanner input= new Scanner(System.in);
        System.out.println("Enter temperature in Celsius: ");
        double celsius = input.nextFloat();
        double fahrenheit = (celsius*1.8)+32;
        System.out.println(fahrenheit+"F");

    }
}
