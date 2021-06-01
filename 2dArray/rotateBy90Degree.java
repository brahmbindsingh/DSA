import java.util.*;

public class rotateBy90Degree {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] a = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j] = scn.nextInt();
            }
        }
        rotate(a);
        display(a);
        scn.close();
    }
    
    public static void rotate(int[][] a){
        int n = a.length;
        transpose(a);
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int temp = a[i][j];
                a[i][j] = a[i][n-1-j];
                a[i][n-1-j] = temp;
            }
        }
    }
    
    public static void transpose(int[][] a){
        int n = a.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j>=i){
                    int temp = a[i][j];
                    a[i][j] = a[j][i];
                    a[j][i] = temp;
                }
            }
        }
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}