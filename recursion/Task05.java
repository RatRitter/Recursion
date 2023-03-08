import java.util.Scanner;

public class Task05 {

	
	public static String recursion(int n) {
        
        if (n < 10) {
            return Integer.toString(n);
        } 
        else {
            return recursion(n / 10) + " " + n % 10;
        }
    }
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int n = sc.nextInt();
        System.out.println(recursion(n)); 
   sc.close(); }}



