
import java.util.*;
public class script {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String colour = sc.next();
      switch (colour) {
        case "Red":
            System.out.println("colour is red");
            break;
        case "Green":
        System.out.println("colour is green");
        break;
        default:
        System.out.println("choose a colour");
            break;
      }
       
    }
}