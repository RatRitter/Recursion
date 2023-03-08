import java.util.Scanner;

public class Task06 {

	
		public static int recursion(int n, int i) {
			
		        return (n==0) ? i : recursion( n/10, i*10 + n%10 );
		    }
		    public static void main(String[] args) {
		    	Scanner sc = new Scanner(System.in);
		    	int n = sc.nextInt();
		        System.out.println(recursion(n, 0));
		  sc.close();  }
	    }

	


