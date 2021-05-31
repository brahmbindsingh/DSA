import java.util.*;

public class exitPoint {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] a = new int[n][m];
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j] = scn.nextInt();
            }
        }
        scn.close();
        int dir=0;
        int r=0;
        int c=0;
        while(r>=0&&r<n&&c>=0&&c<m){
            dir+=a[r][c];
            dir%=4;
            if(dir==0){
                c++;
                if(c==m){
                    c--;
                    break;
                }
            }
            else if(dir==1){
                r++;
                if(r==n){
                    r--;
                    break;
                }
            }
            else if(dir==2){
                c--;
                if(c==-1){
                    c++;
                    break;
                }
            }
            else if(dir==3){
                r--;
                if(r==-1){
                    r++;
                    break;
                }
            }
        }
        System.out.println(r);
        System.out.println(c);
    }

}