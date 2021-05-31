import java.util.*;

public class sumOfTwoArrays{

    public static void main(String[] args) throws Exception {
    // write your code here
        Scanner scn = new Scanner(System.in);
        
        int n1=scn.nextInt();
        int[] a1 = new int[n1];
        for(int i=0;i<n1;i++){
            a1[i] = scn.nextInt();
        }
        
        int n2=scn.nextInt();
        int[] a2 = new int[n2];
        for(int i=0;i<n2;i++){
            a2[i] = scn.nextInt();
        }
    
        arrayAddition(a1,a2);
        scn.close();
    }
    public static void arrayAddition(int[] a1,int[] a2){
        int max = (a1.length>a2.length) ? a1.length : a2.length ;
        int[] ans = new int[max+1];
        int carry=0;
        int i=a1.length-1;
        int j=a2.length-1;
        int k=ans.length-1;
        while(i>0||j>0||carry>0){
            int sum=a1[i]+a2[j]+carry;
            ans[k] = sum%10;
            carry=sum/10;
            i--;
            j--;
            k--;
        }
        for(int r=0;r<ans.length;r++){
            System.out.println(ans[r]);
        }
    }
}