import java.util.Scanner;

public class FibonacciLimit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int limit = s.nextInt();
        int a = 0;
        int b = 1;
        
        while (a <= limit) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
    }
}
