import java.util.Scanner;
public class PositiveAndnAegative.java {
    public static void main(String[] args) {
        Scanner sacn = new Scanner(System.in);
        float to;
        System.out.println("Enter the number");
       to = sacn.nextFloat();
        if(to < 0) {
            System.out.println("the number negative");
        }
        else {
            System.out.println("the number postive");
        }
    }
}
