import java.util.*;
import java.lang.Math;
    
    public class digitsOfaNumber{
    
    public static void main(String[] args) {
      // write your code here  
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int t = n;
      int c = 0;
      
      while(t>0){
        t/=10;
        c++;
      }
      
      int pow = (int)Math.pow(10,c-1);
      
      while(pow>0){
          int d= n/pow;
          n%=pow;
          System.out.println(d);
          pow/=10;
      }
      scn.close();
     }
    }