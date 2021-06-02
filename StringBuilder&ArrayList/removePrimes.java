import java.util.*;

public class removePrimes {

	public static void solution(ArrayList<Integer> al){
		// write your code here
		for(int i=al.size()-1;i>=0;i--){
		    if(primeChecker(al.get(i))==true){
		        al.remove(i);
		    }
		}
		
	}
	
	public static boolean primeChecker(int n){
	    int flag=0;
	    for(int i=2;i<n;i++){
	        if(n%i==0){
	            flag=1;
	            break;
	        }
	    }
	    if(flag==1){
	        return false;
	    }
	    else{
	        return true;
	    }
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0 ; i < n; i++){
			al.add(scn.nextInt());
		}
		solution(al);
		System.out.println(al);
        scn.close();
	}

}