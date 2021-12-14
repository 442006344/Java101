import java.util.Scanner;
public class largest{
public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float num1;
        float num2;
        float num3;
        System.out.println("Enter Number1");
        num1 = scan.nextFloat();
        System.out.println("Enter Number2");
        num2 = scan.nextInt();
        System.out.println("Enter Number3");
        num3 = scan.nextFloat();

        if(num1>num2 && num1>num3 ){
        System.out.println("The largest score is" + num1);
        }
        else if(num2>num1 && num2>num3 ){
        System.out.println("The largest score is  " + num2);
        }
        else if(num3>num1 && num3>num2 ){
        System.out.println("The largest score is"+num3);
        }
        
        }
        }
