import java.util.Scanner;

public class etsno5 {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    
	    double n = input.nextDouble();

	    double x = 0;
	    for (double i = 1; i <= n; i++) {
	        x += input.nextDouble();
	    }
	    
	    double mean = x/n;
	    System.out.println(mean);

	    double sd = Math.sqrt(((x*x) - (x*x)/n) / (n - 1));
	    System.out.println(sd);
	}
}