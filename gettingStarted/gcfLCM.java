import java.util.*;
import java.lang.Math;
    
    public class gcfLCM{
    
    public static void main(String[] args) {
      // write your code here  
      Scanner scn = new Scanner(System.in);
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
      int gcd=1;
      
      int min = Math.min(n1,n2);
      
      for(int i=min;i>=1;i--){
          if(n1%i==0&&n2%i==0){
              gcd = i;
              break;
          }
      }
      
      
      
      System.out.println(gcd);
      System.out.println((n1*n2)/gcd);
      scn.close();
     }
    }