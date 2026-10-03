import java.util.Scanner;

class Division_Example {

    void diveNumber(int num, int den) {
        try {
            int result = num / den;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
    }
}

public class Handilig_Task {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Numerator:");
        int n1 = scan.nextInt();

        System.out.print("Enter the Denominator:");
        int n2 = scan.nextInt();

        Division_Example obj1 = new Division_Example();
        obj1.diveNumber(n1, n2);

        scan.close();
    }
}
