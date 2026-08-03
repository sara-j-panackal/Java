import java.util.Scanner;

public class Marks {
    double[] marks;

    public Marks(double[] marks) {
        this.marks = marks;
    }

    public void displayResult() {
        double total = 0;
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }
        System.out.println("Total: " + total);
        System.out.println("Average: " + (total / marks.length));
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double[] m = new double[3];
        
        for (int i = 0; i < 3; i++) {
            m[i] = s.nextDouble();
        }
        
        Marks marksObj = new Marks(m);
        marksObj.displayResult();
    }
}
