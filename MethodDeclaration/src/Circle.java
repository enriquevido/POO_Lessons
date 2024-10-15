public class Circle {
    private int x = 3;
    private int y;

    Circle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Circle() {

    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void moveCircle(Circle circle, int deltaX, int deltaY) {
        circle.setX(circle.getX() + deltaX);
        circle.setY(circle.getY() + deltaY);

        System.out.println("X : " + circle.getX());
        System.out.println("Y : " + circle.getY());

        circle = new Circle(0, 0);
    }
}
