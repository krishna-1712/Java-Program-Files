
//     import java.util.Random;
 public class RandomNumber {

//     public static void main(String[] args) {

//         Random random = new Random();

//         int number = random.nextInt(100) + 1;

//         System.out.println("Random Number: " + number);
//     }
// }

  public static void main(String[] args) {
    int randomNum = (int)(Math.random() * 101);  // 0 to 100
    System.out.println("Random Number: " + randomNum);
  }
}
