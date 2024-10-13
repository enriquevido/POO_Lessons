import java.awt.*;

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
        Point originOne = new Point(23, 94);
        Dimension dimension = new Dimension(100, 200);
        Rectangle rectOne = new Rectangle(originOne, dimension);
        Rectangle rectTwo = new Rectangle(50, 100);

        System.out.println("Width of rectOne: " + rectOne.width);
        System.out.println("Height of rectOne: " + rectOne.height);
        System.out.println("Area of rectOne: " + (rectOne.width * rectOne.height));

        rectTwo.setLocation(originOne);

        System.out.println("rectTwo X Position: " + rectTwo.x);
        System.out.println("rectTwo Y Position: " + rectTwo.y);

        rectTwo.setLocation(40, 72);
        System.out.println("rectTwo X Position: " + rectTwo.x);
        System.out.println("rectTwo Y Position: " + rectTwo.y);

    }
}
