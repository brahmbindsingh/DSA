import java.util.*;
import java.lang.Math;

public class subsetOfArray{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] a = new int[n];
    for(int i=0;i<n;i++){
        a[i] = scn.nextInt();
    }
    for(int i=0;i<Math.pow(2,n);i++){
        int[]b = bin(i,n);
        for(int j=0;j<a.length;j++){
            if(b[j]==1){
                System.out.print(a[j]+"\t");
            }
            else{
                System.out.print("-"+"\t");
            }
        }
        System.out.println();
    }
    scn.close();
 }
 public static int[] bin(int i,int n){
     int[] a = new int[n];
     int pos=n-1;
     while(i>0){
         int temp = i%2;
         i/=2;
         a[pos] = temp;
         pos--;
     }
     return a;
 }

}