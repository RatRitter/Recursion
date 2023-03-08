import java.util.Scanner;

public class Task04 {
	public static void main1(String[] args) {
		
}
	public static int recursion(int n) {
        
        if (n < 10) {
            return n;
        }
        else {
            System.out.print(n % 10 + " ");
            return recursion(n / 10);
        }
    }
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
        System.out.println(recursion(n)); 
   sc.close(); }

	   } 
	


