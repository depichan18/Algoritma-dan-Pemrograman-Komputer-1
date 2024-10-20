import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter: ");
        int x = input.nextInt();
        int y = 3;

        
        switch (x + 3){
            case 6: y = 1;
            default: y += 1;
        }
        System.out.println(y);
        

        if ( x + 3 == 6){
            y = 1;
        }
        y = y+1;
        System.out.println(y);

    }
}