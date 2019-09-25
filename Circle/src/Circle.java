import java.util.Objects;

public class Circle {
    private double radius;
    private Point centerPoint;

    public Circle(double radius, Point centerPoint) {
        this.radius = radius;
        this.centerPoint = centerPoint;
    }

    public double getRadius() {
        return radius;
    }

    public Point getCenterPoint() {
        return centerPoint;
    }
    public double getArea(){
        return Math.pow(this.radius,2)*Math.PI;
    }
    public void moveTo(Point centerPoint){
        this.centerPoint= centerPoint.copy();
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", centerPoint=" + centerPoint +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.getRadius(), getRadius()) == 0 &&
                getCenterPoint().equals(circle.getCenterPoint());
    }

}
