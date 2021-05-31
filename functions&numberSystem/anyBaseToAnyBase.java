import java.util.*;
import java.lang.Math;

  public class anyBaseToAnyBase{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
     int  destBase= scn.nextInt();
     int d=getValueIndecimal(n,sourceBase);
     int e=getValueInBase(d,destBase);
     System.out.println(e);
     scn.close();
   }   
   
   public static int getValueIndecimal(int n, int b){
      // write your code here
      int np=0;
      int i=0;
      while(n>0){
          int d=n%10;
          np+=Math.pow(b,i)*d;
          n/=10;
          i++;
      }
      return np;
   }
   public static int getValueInBase(int n, int b){
       // write code here
       int i=0;
       int no=0;
       while(n>0){
           int d = n%b;
           n/=b;
           no+=d*Math.pow(10,i);
           i++;
       }
       return no;
   }
  }