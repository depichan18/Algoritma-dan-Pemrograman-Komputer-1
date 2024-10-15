import java.util.Scanner;

public class tanpabreak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int f = 2;
        
        while (f <= n) {
            if (n % f == 0)
                n = f;
            f++;
        }

        System.out.println("faktor terkecil, selain 1 dr " + n + " adl " + f);
    }
}
