import java.util.*;
  
  public class countDigitInNo{
  
  public static void main(String[] args) {
    // write your code here 
    int d=0;
    Scanner scn = new Scanner(System.in);
    int n=scn.nextInt();
    while(n>0){
        n/=10;
        d++;
    }
    System.out.println(d);
    scn.close();
   }
  }