import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        double num1 = s.nextDouble();
        char op = s.next().charAt(0);
        double num2 = s.nextDouble();
        
        switch (op) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println(num1 / num2);
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
