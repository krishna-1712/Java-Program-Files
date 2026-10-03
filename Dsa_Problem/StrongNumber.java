import java.util.Scanner;

public class StrongNumber{
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt(); 
        int a = num % 10;
//while(num !=0){


       int fac = 1;
       for (int i = a; i >= 1; i--){
        fac = fac * i;


       }
       System.out.print(fac);

    }

    }