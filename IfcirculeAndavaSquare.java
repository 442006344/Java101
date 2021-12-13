import java.util.Scanner;
public class IfcirculeAndavaSquare.java{
    public static void main(String[] args) {
    
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter x 1 or 2");
     int num = scan.nextInt();
     if( x==1){
     System.out.println("Radivs");
     float r = scan.nextFloat();
     System.out.println(r*r*3.14);
     }else if (x ==2){
     System.out.println("Enter height");
     float height = scan.nextFloat();
     System.out.println("w");
     float w = scan.nextFloat();
     System.out.println(height*w);
     }else
     System.out.println("error");
    }
}
