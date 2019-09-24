import java.util.Objects;

public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public void moveTo(double newX, double newY){
        this.x=newX;
        this.y=newY;
    }
    public  void  move(double xDistance, double yDistance){
        this.x+=xDistance;
        this.y+=yDistance;
    }
    public Point copy(){
        return  new Point(this.getX(),this.getY());
    }

    @Override
    public String toString(){
        return "("+this.x+","+this.y+")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(point.getX(), getX()) == 0 &&
                Double.compare(point.getY(), getY()) == 0;
    }
}
