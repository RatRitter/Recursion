import java.util.Scanner;

public class Task08 {

	 public static int recur(int x, int n)
     {
         if (n==0)
             return 1;
         return recur(x,n-1)*x;
     }
 
 public static void main(String[] args) 
 {
     Scanner sc = new Scanner(System.in);  
     System.out.print("x = ");
     int x = sc.nextInt();
     System.out.print("n = ");
     int n = sc.nextInt();
     int pow=recur(x,n);
     System.out.println("Pow("+x+", "+n+") = "+pow);
 sc.close();}
}
		
	

