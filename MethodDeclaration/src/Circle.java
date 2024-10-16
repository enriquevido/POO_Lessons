public class Circle {
    private double radius;
    static int numObjects;

    Circle() {
        this.radius = 1;
        numObjects++;
    }

    Circle(double radius) {
        this.radius = radius;
        numObjects++;
    }

    public static int getNumObjects(){
        return numObjects;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString(){
        return "Radio: " + radius + " Area: " + getArea() + " Perimeter: " + getPerimeter();
    }

}
