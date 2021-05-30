import java.util.*;

public class primeFactorissation{

public static void main(String[] args) {
  // write your code here  
  int n;
  Scanner sc=new Scanner(System.in);
  n=sc.nextInt();
  for(int i = 2; i< n; i++) {
         while(n%i == 0) {
            System.out.print(i+" ");
            n /= i;
         }
      }
      if(n >2) {
         System.out.println(n);
      }
      sc.close();
 }
}