import java.awt.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class DeclarationMethod {

//    public double computePayment(double loanAmt, double rate, double futureValue, int numPeriods) {
//        double interest = rate / 100.0;
//        double partial1 = Math.pow ((1 + interest), -numPeriods);
//        double denominator = (1 - partial1) / interest;
//        double answer = (-loanAmt / denominator) - ((futureValue * partial1) / denominator);
//        return answer;
//    }
//
//    public void passMethod(int p){
//        this.x = p;
//        System.out.println(x);
//    }
//
//    public void printNumbers(int... numbers){
//        for (int number : numbers) {
//            System.out.print(number + " ");
//        }
//        System.out.println();
//    }

    public static void main(String[] args) {
//        Point originOne = new Point(23, 94);
//        Dimension dimension = new Dimension(100, 200);
//        Rectangle rectOne = new Rectangle(originOne, dimension);
//        Rectangle rectTwo = new Rectangle(50, 100);
//
//        System.out.println("Width of rectOne: " + rectOne.width);
//        System.out.println("Height of rectOne: " + rectOne.height);
//        System.out.println("Area of rectOne: " + (rectOne.width * rectOne.height));
//
//        rectTwo.setLocation(originOne);
//
//        System.out.println("rectTwo X Position: " + rectTwo.x);

//        System.out.println("rectTwo Y Position: " + rectTwo.y);
//
//        rectTwo.setLocation(40, 72);
//        System.out.println("rectTwo X Position: " + rectTwo.x);
//        System.out.println("rectTwo Y Position: " + rectTwo.y);

        Circle c1 = new Circle();
        Circle c2 = new Circle(3.5);

        c1.setRadius(5);

        System.out.println("==============CIRCULO 1===============");
        System.out.println("Radio: " + c1.getRadius());
        System.out.println("Area: " + c1.getArea());
        System.out.println("Perimeter: " + c1.getPerimeter());

        System.out.println("==============CIRCULO 2===============");
        System.out.println("Radio: " + c2.getRadius());
        System.out.println("Area: " + c2.getArea());
        System.out.println("Perimeter: " + c2.getPerimeter());
        System.out.println();
        System.out.println("Numéro de objetos: " + Circle.getNumObjects());

        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
