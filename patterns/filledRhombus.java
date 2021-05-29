import java.util.*;

public class filledRhombus {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int spc=n/2;
        int stc=1;
        for(int i=0;i<n;i++){
            for(int j=1;j<=spc;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=stc;j++){
                System.out.print("* ");
            }
            if(i<n/2){
                spc--;
                stc+=2;
            }
            else{
                spc++;
                stc-=2;
            }
            System.out.println();
        }
        scn.close();
    }
}
