import java.util.*;
public class HashMap_exp {
    public static void main(String[] args) {
        HashMap<Integer , String> userDetails = new HashMap<>();
        userDetails.put(1 ,"Krishnakumar");
        userDetails.put(2, "Dhineshraji");
        userDetails.put(3, "Rohith");
        System.out.println(userDetails.keySet());
        System.out.println(userDetails.get(1));
        System.out.println(userDetails.values());
        System.out.println(userDetails.size());
        System.out.println(userDetails.remove(2));


    }
}
