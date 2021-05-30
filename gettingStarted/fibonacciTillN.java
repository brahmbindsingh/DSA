import java.util.*;
  
  public class fibonacciTillN{
  
  public static void main(String[] args) {
      // write your code here
      Scanner scn=new Scanner(System.in);
      int n=scn.nextInt();
      int ft=0,sd=1,nt=0;
      System.out.println(ft);
      System.out.println(sd);
      for(int i=2;i<n;i++){
          nt=ft+sd;
          System.out.println(nt);
          ft=sd;
          sd=nt;
      }
      scn.close();
   }
  }