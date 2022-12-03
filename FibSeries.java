import java.util.Scanner;

public class FibSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n size: ");
        int n = in.nextInt();
        int n1 = 0, n2= 1,n3;
        System.out.print(n1 +" "+ n2);
        for (int i=2; i<=n; i++){
            n3 = n1+n2;
            System.out.print(" "+ n3);
            n1=n2;
            n2=n3;
            /* 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 */
        }
    }

}
