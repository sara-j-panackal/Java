public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void printDetails() {
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;
        
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }

    public static void main(String[] args) {
        Circle c = new Circle(5.0);
        c.printDetails();
    }
}
