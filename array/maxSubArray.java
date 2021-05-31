import java.util.*;
 
 public class maxSubArray {
 
 	 // This is a functional problem. You have to complete this function.
 	 // It takes as input an integer array. It should return the required sum.
 	 public static int maxSum(int[] arr) {
 	 	 // write your code here.
 	 	 int max=Integer.MIN_VALUE;
 	 	 int n = arr.length;
 	 	 for(int i=0;i<n;i++){
 	 	     for(int j=i;j<n;j++){
 	 	         int sum = 0;
 	 	         for(int k=i;k<=j;k++){
 	 	             sum+=arr[k];
 	 	         }
 	 	         if(sum>max){
 	 	             max=sum;
 	 	         }
 	 	     }
 	 	 }
 	 	 return max;
     }
 
 
 	 public static void main(String[] args) {
 	 	 Scanner sc = new Scanner(System.in);
 	 	 int N = sc.nextInt();
 	 	 int[] arr = new int[N];
 	 	 for (int i = 0; i < arr.length; i++) {
 	 	 	 arr[i] = sc.nextInt();
 	 	 }
 
 	 	 System.out.println(maxSum(arr));
 	 	 sc.close();
 	 }
 
 }