import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long fact = 1;
        
        while (n > 0) {
            fact *= n;
            n--;
        }
        System.out.println(fact);
    }
}
