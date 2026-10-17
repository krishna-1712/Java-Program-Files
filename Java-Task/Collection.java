import java.util.Scanner;
import java.util.ArrayList;

public class Collection {

 
public static void main(String[] args) {

Scanner scan = new Scanner(System.in);

int input = scan.nextInt();

ArrayList<Integer> num = new ArrayList<Integer>();

num.add(input);
for (int i = 0; i <= input; i++) {
System.out.println(num.get(i));
}

}
}
