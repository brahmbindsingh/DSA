import java.util.Scanner;
 
 public class rotateArray {
     
     public static void display(int[] a) {
        StringBuilder sb = new StringBuilder();

        for (int val: a) {
            sb.append(val + " ");
        }
        System.out.println(sb);
    }
     
     public static void reverse(int[] a, int li, int ri) {

        while (li < ri) {
            int lv = a[li];
            int rv = a[ri];
            a[li] = rv;
            a[ri] = lv;

            li++;
            ri--;
        }
    }
 
 	 public static void rotate(int[] a, int k) {
 	 	 // Write your code here
 	 	 int n=a.length;
 	 	 k%=n;
 	 	 reverse(a, 0, n - 1);
 	 	 reverse(a, 0, k - 1);
 	 	 reverse(a, k, n - 1);
 	 }
 
 	 // Don't make any changes here
 	 public static void main(String[] args) {
 	 	 Scanner s = new Scanner(System.in);
 	 	 int n = s.nextInt();
 	 	 int k=s.nextInt();
 	 	 int[] ar = new int[n];
 	 	 for (int i = 0; i < n; i++) {
 	 	 	 ar[i] = s.nextInt();
 	 	 }
 	 	 rotate(ar, k);
 	 	 for (int v : ar)
 	 	 	 System.out.print(v + " ");
        s.close();
 	 }
 
 }