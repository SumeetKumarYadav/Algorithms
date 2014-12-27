import java.io.IOException;
import java.util.Scanner;

/*
 * http://www.spoj.com/problems/ENIGMATH/
 */

public class ENIGMATH {
	
	public static int gcd(int a,int b){
		if (b==0){
				return a;
		}else{
			return gcd(b,a % b);
		}
			
						
	}

	public static void main(String[] args)throws IOException,NumberFormatException {
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++){
			int A = sc.nextInt();
			int B = sc.nextInt();
			int g = gcd(A,B);
				
			System.out.println((B/g)+" "+(A/g));
			
		}
	}

}
