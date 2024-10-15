import java.util.Scanner;

public class etsno1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan bilangan: ");
        int n = input.nextInt();

        boolean isPrima = true;

        if (n > 1) {
            int i = 2;
            while (i < n){
                if (n % i == 0) {
                    isPrima = false;
                    break;
                }
                i++;
            }
        } else {
            isPrima = false;
        }

        if (isPrima) {
            System.out.println(n + " adalah bilangan prima");
        }
        else {
            System.out.println(n + " bukan bilangan prima");
        }
    }
}