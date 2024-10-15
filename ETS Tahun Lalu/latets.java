import java.util.Scanner;

public class latets{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        int x = 0;
        int y = 1;

        while (a >= x) {
            int z = x + y;
            System.out.println(x);
            x = y;
            y = z;
        }
    }
}
