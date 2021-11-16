
import java.util.Scanner;

public class Klaviatura {
   private static int count;
   private static String out="";
   public static void main(String[] args) {
      while(true)  {

         Scanner s = new Scanner(System.in);
         count=count+1;
         out=out+s.next()+count;
         System.out.print(out);
      }
   }
}




