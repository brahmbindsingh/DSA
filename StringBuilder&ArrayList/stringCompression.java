import java.util.*;

public class stringCompression {

	public static String compression1(String str){
		// write your code here
		String str1="";
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)!=str.charAt(i+1)){
                str1+=str.charAt(i);
            }
        }
        str1+=str.charAt(str.length()-1);
		return str1;
	}

	public static String compression2(String str){
		// write your code here
		int c=1;
		String str1="";
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)!=str.charAt(i+1)){
                str1+=str.charAt(i);
                if(c>1){
                    str1+=c;
                }
                c=1;
            }
            else{
                c++;
            }
        }
        str1+=str.charAt(str.length()-1);
        if(c>1){
            str1+=c;
        }
		return str1;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
        scn.close();
	}

}