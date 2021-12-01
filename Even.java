import java.util.Scanner;
public class even {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num1;
        System.out.print("Enter a Number");
        num1 = scan.nextInt();
        num1 %=2;
        if (num1==0){
            System.out.print("even");
        }
        else {
            System.out.print("odd");
        }



    }
}
