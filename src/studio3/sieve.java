package studio3;
import java.util.Scanner;
public class sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("choose the total number.");
		int n = in.nextInt();
		boolean[] a = new boolean[n+1];

		for (int i = 2; i<=n; i++ ) {
			a[i]=true;
		}
		for (int i = 2; i<= (int)Math.sqrt((double)n);i++ ) {
			for (int j = 2*i; j<=n; j=j+i) {
				a[j]=false;

			}
		}
			
		for (int x = 2; x<=n; x++) {
			if (a[x]) {
				System.out.print(x+" ");	
			}

		}
	}

}
