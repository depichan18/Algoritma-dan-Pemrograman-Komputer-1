import java.util.Scanner;

public class PersamaanGaris {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = (int) (1 + (Math.random() * 11) - 20);
        int b = (int) (1 + (Math.random() * 11));
        int c = (int) (1 + (Math.random() * 11) - 20);

        System.out.println("Berikut soal persamaan garis yang dapat kamu kerjakan: ");
        System.out.println("Tentukan gradien dan titik potong garis berikut dengan sumbu-y :");

        if (a>=0 && c>= 0) {
            System.out.println(a + "x + " + b + "y +" + c + " = 0.");
        }
        else if (a>=0 && c<0) {
            System.out.println(a + "x + " + b + "y " + c + " = 0");
        }
        else if (a<0 && c>=0) {
            System.out.println("-" + a + "x + " + b + "y +" + c + " = 0");
        }
        else {
            System.out.println(a + "x + " + b + "y " + c + " = 0.");
        }

        double gradien1 = -(double) a / b;
        String gradien2 = String.format("%.2f", gradien1);
        double gradien = Double.parseDouble(gradien2);

        double titikPotong1 = -(double) c / b;
        String titikPotong2 = String.format("%.2f", titikPotong1);
        double titikPotong = Double.parseDouble(titikPotong2);

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

        System.out.printf("Gradiennya adalah %.2f dan titik potongnya dengan sumbu-y adalah %.2f\n", gradien, titikPotong);
    }
}
