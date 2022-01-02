import java.io.IOException;
import java.util.Scanner;


public class Exception1 {
    public static void main(String[] args) throws IOException {
        double firstNumber, secondNumber;
        double result = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Please,Input first number: ");
        firstNumber = input.nextDouble();
        System.out.println("Please,Input second number: ");
        secondNumber = input.nextDouble();
        try{
            result = firstNumber / secondNumber;

        }catch ( ArithmeticException e) {
            System.out.println("The division of two double numbers is:" + e);
        }
        System.out.println("The division of two double numbers is:" + result);
    }
}