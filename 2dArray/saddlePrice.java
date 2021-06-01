import java.util.*;

public class saddlePrice {

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
        scn.close();
        int sp = saddle(a);
        
        if(sp == -1) {
            System.out.println("Invalid input");
        }
        else {
            System.out.println(sp);
        }
    }

    public static int saddle(int[][] a){
        
        for(int i=0;i<a.length;i++){
            int minc=0;
            int minv=a[i][0];
            
            for(int j=1;j<a[0].length;j++){
                if(a[i][j]<minv){
                    minv=a[i][j];
                    minc=j;
                }
            }
            
            boolean isSP=true;
            for(int c=0;c<a.length;c++){
                if(a[c][minc]>minv){
                    isSP=false;
                    break;
                }
            }
            if(isSP==true){
                return minv;
            }
        }
        return -1;
    }
}