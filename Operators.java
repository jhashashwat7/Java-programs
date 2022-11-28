import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = input.nextInt();
        System.out.print("Enter second number: ");
        int b = input.nextInt();
        System.out.print("Enter operator: ");
        String operator = input.next();
        switch(operator)
        {
            case "+" :
            {
                double addition  = a+b;
                System.out.print("Total after Addition is : "+addition);
                break;
            }
            case "-" :
            {
                double subtraction  = a-b;
                System.out.print("Total after Subtraction is : " +subtraction);
                break;
            }
            case "*" :
            {
                double multiplication  = a*b;
                System.out.print("Total after Multiplication is : "+multiplication);
                break;
            }
            case "/" :
            {
                double division  = a/b;
                System.out.print("Total after Division is : "+division);
                break;
            }
            default :
            {
                System.out.print("Please select proper operator");
                return;
            }
        }

        }


    }

