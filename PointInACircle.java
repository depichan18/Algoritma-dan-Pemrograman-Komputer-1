package point.in.a.circle;
import java.util.Scanner;

public class PointInACircle {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a point with two koordinat: ");
        
        double x1,x2,y1,y2;
        x1 = 0;
        y1 = 0;
        x2 = scan.nextDouble();
        y2 = scan.nextDouble();
        
        double count = ((x2-x1)*(x2-x1)) + ((y2-y1)*(y2-y1));
        System.out.println(count);
        double radius = 10*10;
        
        if (count <= radius){
            System.out.println( "Point " + "(" + x2 + " " + y2 + ")" + " is in the circle");
        }
        
        else {
            System.out.println( "Point " + "(" + x2 + " " + y2 + ")" + " is not in the circle");
        }
        
    }
    
}
