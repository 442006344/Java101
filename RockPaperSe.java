import java.util.Random;
import java.util.Scanner;

public class RockPaperSe{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
          String computerPlays = "rps";
        Random rnd = new Random();
          do{
            System.out.println("If you want to play enter:\n(r or R) for rock,\n(p or P) for paper,\n(s or S) for scissors\nor Enter any key to exit");
       String x = scan.nextLine();
              x =( x.toLowerCase());
       char y = x.charAt(0);
        if (y!= 'r' && y!= 'p' && y!= 's' ) {
            break;
        }
        
       char computerChoice = computerPlays . charAt (rnd . nextInt (computerPlays . length ()));
        if (y == computerChoice){
         System.out.print("is tie: user choice: "+y+"  computerChoice :"+computerChoice);
        }
        
     else if((y=='s'&& computerChoice=='p')||(y=='p'&& computerChoice=='r')
     ||(y=='r' && computerChoice=='s')){
         System.out.println("user wins: computerChoice: " +computerChoice+"  x choice: " +y);
     }
    
    else{
        System.out.println("computer wins computerChoice: "+computerChoice+" x choice: "+y);
    }
    
             System.out.println("\n\n");
        }while(true);
    }

}
    
    
    
