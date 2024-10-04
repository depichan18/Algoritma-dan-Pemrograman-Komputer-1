import java.util.Scanner;

public class PersamaanGaris {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = (int) (Math.random() * 21) - 10;
        int b = (int) (1 + (Math.random() * 11));
        int c = (int) (Math.random() * 21) - 10;

        System.out.println("Berikut soal persamaan garis yang dapat kamu kerjakan: ");
        System.out.println("Tentukan gradien dan titik potong garis berikut dengan sumbu-y :");

        if (a>=0 && c>= 0) {
            System.out.println(a + "x + " + b + "y + " + c + " = 0.");
        }
        else if (a>=0 && c<0) {
            System.out.println(a + "x + " + b + "y " + c + " = 0");
        }
        else if (a<0 && c>=0) {
            System.out.println(a + "x + " + b + "y + " + c + " = 0");
        }
        else {
            System.out.println(a + "x + " + b + "y " + c + " = 0.");
        }

        double gradien = -(double) a / b;
        double titikPotong = -(double) c / b;

        System.out.println("Masukkan gradien:");
        double gradienInput = input.nextDouble();

        System.out.println("Masukkan titik potong:");
        double titikPotongInput = input.nextDouble();

        if (gradien == gradienInput && titikPotong == titikPotongInput) {
            System.out.println("Jawaban kamu benar!");
        } else if (gradien == gradienInput && titikPotong != titikPotongInput) {
            System.out.println("Gradien kamu benar, tetapi titik potong nya masih salah!");
        } else if (gradien != gradienInput && titikPotong == titikPotongInput) {
            System.out.println("Titik potong kamu benar, tetapi gradien nya masih salah!");
        } else {
            System.out.println("Jawaban kamu salah!");
        }

        System.out.println("Gradiennya adalah " + gradien + " dan titik potongnya dengan sumbu-y adalah " +titikPotong + ".");
    }
}
