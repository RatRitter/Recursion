import java.util.Scanner;

public class Task03 {

	 
	public static int recursion(int n) {
       
        if (n < 10) {
            return n;
        }
        else {
            return n % 10 + recursion(n / 10);
        }
    }
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(recursion(n));
       sc.close(); }
    }
