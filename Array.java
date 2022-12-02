import java.util.ArrayList;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<Integer> arr= new ArrayList<>();
        int i;
        for(i=1; i<=n; i++){
            arr.add(i);
            System.out.println(arr);
        }


    }
}
