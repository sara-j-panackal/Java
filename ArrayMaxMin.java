import java.util.Scanner;

public class ArrayMaxMin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        if (n <= 0) return;
        
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        
        int max = arr[0];
        int min = arr[0];
        
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
