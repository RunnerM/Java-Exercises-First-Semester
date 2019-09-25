public class CircleTest {
    public static void main(String[] args) {
        Point p1 = new Point(3,5);
        Circle c1 = new Circle(2,p1);
        System.out.println(c1.getArea());
    }
}
