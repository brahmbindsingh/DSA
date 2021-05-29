import java.util.*;

public class outerRhombus {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int spc=1;
        int stc=n/2;
        for(int i=0;i<n;i++){
            for(int j=1;j<=stc+1;j++){
                System.out.print("* ");
            }
            for(int j=1;j<=spc;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=stc+1;j++){
                System.out.print("* ");
            }
            System.out.println();
            if(i<n/2){
                stc--;
                spc+=2;
            }
            else{
                stc++;
                spc-=2;
            }
        }
        scn.close();
    }
}
