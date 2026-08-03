import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        
        int target = s.nextInt();
        int position = -1;
        
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                position = i;
                break;
            }
        }
        
        if (position != -1) {
            System.out.println("Found at position: " + position);
        } else {
            System.out.println("Not found");
        }
    }
}
