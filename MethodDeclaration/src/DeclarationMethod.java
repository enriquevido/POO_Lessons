public class DeclarationMethod {

    public double computePayment(double loanAmt, double rate, double futureValue, int numPeriods) {
        double interest = rate / 100.0;
        double partial1 = Math.pow ((1 + interest), -numPeriods);
        double denominator = (1 - partial1) / interest;
        double answer = (-loanAmt / denominator) - ((futureValue * partial1) / denominator);
        return answer;
    }

    public void printNumbers(int... numbers){
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    public static void main(String[] args) {
        DeclarationMethod loan = new DeclarationMethod();
        System.out.println(loan.computePayment(100000, 4, 150000, 24));

        DeclarationMethod numbers = new DeclarationMethod();
        numbers.printNumbers(1, 2, 3);

    }
}
