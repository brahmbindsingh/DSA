import java.util.*;
import java.lang.Math;
   
   public class rotateNumber{
   
   public static void main(String[] args) {
     // write your code here  
     Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     int k = scn.nextInt();
     int t = n;
     int c = 0;
     
     while(t>0){
         t/=10;
         c++;
     }
     
     k%=c;
     
     if(k<0){
         k+=c;
     }
     
     int pow = (int)Math.pow(10,k);
     int a = n/pow;
     int b = n%pow;
     
     int shift = (int)Math.pow(10,c-k);
     int ans = b*shift+a;
     
     System.out.println(ans);
     scn.close();
    }
   }