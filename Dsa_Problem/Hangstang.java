import java.util.Scanner;
public class Hangstang {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt() , original = n , count =0;
    if(n>=0 && n < 10 ) {
      System.out.print("Yes"); return;
    }
    while(n > 0) {
      count++; n/=10;
    }
    n = original; int sum = 0 ;
    while(n > 0) {
      sum += Math.pow(n%10,count);
      n/=10;
    }
    System.out.print(original==sum?"Yes":"No");
  }
}
