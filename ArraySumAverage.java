import java.util.Scanner;

public class ArraySumAverage {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        if (n <= 0) return;
        
        int[] arr = new int[n];
        double sum = 0;
        
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
            sum += arr[i];
        }
        
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (sum / n));
    }
}
