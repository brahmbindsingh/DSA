import java.util.*;

public class wakanda2 {

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
        
        printDiagonal(a);
        scn.close();
    }
    public static void printDiagonal(int[][] a){
        for(int d=0;d<a.length;d++){
            for(int r=0,c=d;c<a.length;r++,c++){
                System.out.println(a[r][c]);
            }
        }
    }
}