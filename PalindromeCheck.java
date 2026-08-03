import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int original = num;
        int reversed = 0;
        
        while (num > 0) {
            reversed = reversed * 10 + (num % 10);
            num /= 10;
        }
        
        if (original == reversed) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
