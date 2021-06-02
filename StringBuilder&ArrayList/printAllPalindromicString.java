import java.util.*;

public class printAllPalindromicString {

	public static void solution(String str){
		//write your code here
		for(int pos=0;pos<str.length();pos++){
		    for(int i=pos;i<str.length();i++){
		        String ss = str.substring(pos,i+1);
		        if(isPali(ss)==true){
		            System.out.println(ss);
		        }
		    }
		}
	}
	
	public static boolean isPali(String str){
	    for(int i=0;i<str.length()/2;i++){
	        if(str.charAt(i)!=str.charAt(str.length()-1-i)){
	            return false;
	        }
	    }
	    return true;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
        scn.close();
	}

}