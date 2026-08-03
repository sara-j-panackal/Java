import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int sum = 0;
        
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        
        System.out.println(sum);
    }
}
