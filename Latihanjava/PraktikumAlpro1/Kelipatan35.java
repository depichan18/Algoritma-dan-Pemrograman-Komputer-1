import java.util.Scanner;

public class Kelipatan35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int batasAtas = 0;
        int batasBawah = 0;
        int jumlahkelipatan = 0;

        while (true) { 
            System.out.println("Masukkan batas bawah: ");
            batasBawah = input.nextInt();

            System.out.println("Masukkan batas atas: "); 
            batasAtas = input.nextInt();
            

            if (batasBawah > 0 && batasAtas > 0) {
                int k = batasBawah;
                while (k <= batasAtas){
                    if (k % 3 == 0) {
                        System.out.println(k);
                        jumlahkelipatan+=k;
                    }
                    else if (k % 5 == 0) {
                        System.out.println(k);
                        jumlahkelipatan+=k;
                    }
                    
                    k++;
                }
                break;
            } 
            System.out.println("Maaf input anda tidak valid");
        }

            System.out.println("Jumlah kel3 dan kel adalah "+ jumlahkelipatan);

    }
}