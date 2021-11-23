import java.util.InputMismatchException;
import java.util.Scanner;

class MyException extends Exception {
    private int number;
    MyException (int value){
        number = value;
    }
    public String toString(){
        return "MyException [" + number + "]";
    }
}


public class Exception2 {
    static void check(int num) throws MyException {
        if (num < 1 || num > 100) {
                throw new MyException(num);
            }
        System.out.println("The Number is within the range : " + num);

    }

    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter the your number [ 1 - 100] : ");
        try {
            number = sc.nextInt();
            check (number);
        } catch (MyException e) {
            System.out.println(" " + e);
        }
        catch (InputMismatchException e) {
            System.out.println("Non-number text! Please, enter the your number [ 1 - 100] : ");
        }



    }
}