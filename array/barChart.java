import java.util.*;

public class barChart {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = scn.nextInt();
        }
        bar_chart(a);
        scn.close();
    }
    public static void bar_chart(int[] a){
        int max=a[0];
        int n = a.length;
        for(int i=0;i<n;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        for (int h = max; h >= 1; h--) {
            for (int i = 0; i < a.length; i++) {
                //star
                if (h <= a[i]) {
                    System.out.print("*\t");
                }
                //space
                else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
