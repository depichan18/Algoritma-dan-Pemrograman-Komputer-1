import java.util.Scanner;

public class etsno2 {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    
	    int bilangan = input.nextInt();
	    int x = 0;
	    
	    while (bilangan != 0){
	        if (bilangan % 2 != 0){
	            x += (bilangan % 10);
	        }
	        bilangan = bilangan/10;
	    }
	    
	    if (x < 0){
	        x = x*(-1);
	    }
	    System.out.println(x);
	}
}
