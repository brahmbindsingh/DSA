import java.util.*;

public class brokenEconomy{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] a = new int[n];
    for(int i=0;i<n;i++){
        a[i] = scn.nextInt();
    }
    int d = scn.nextInt();
    brokenEconomy1(a,d);
    scn.close();
 }
 public static void brokenEconomy1(int[] a,int d){
     int floor=-1;
     int ceil=-1;
     int lo=0;
     int hi=a.length-1;
     while(lo<=hi){
         int mid = (lo+hi)/2;
         if(a[mid]==d){
             System.out.println(a[mid]);
             break;
         }
         else if(d<a[mid]){
             hi=mid-1;
             ceil=a[mid];
         }
         else{
             lo=mid+1;
             floor=a[mid];
         }
     }
     System.out.println(ceil);
     System.out.println(floor);
 }
}