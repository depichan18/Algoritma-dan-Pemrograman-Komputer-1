import java.util.Scanner;

public class TugasBesar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Halo, selamat datang di ... .");
        System.out.println("Soal apa yang ingin kamu pelajari hari ini? ");

        int repeat = 0;
        while (repeat < 5) {
            System.out.println("Pilihlah salah satu subjek yang anda ingin pelajari: ");
            System.out.println("1. Kalkulus");
            System.out.println("2. Geometri Analitik");
            System.out.println("3. Metode Statistika");

            System.out.print("Masukkan pilihan berupa nomor(contoh 1): ");
            String pilihan = input.next();
            
            switch (pilihan) {
                case "1":
                    System.out.println("Topik apa yang ingin kamu pelajari?");
                    System.out.println("1. Persamaan Garis");
                    System.out.println("2. Persamaan Lingkaran");
                    System.out.print("Masukkan pilihan berupa nomor(contoh 1): ");
                    String pilihank = input.next();

                    switch (pilihank) {
                        case "1":
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

                            System.out.print("Masukkan gradien:");
                            double gradienInput = input.nextDouble();

                            System.out.print("Masukkan titik potong:");
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

                        break;
                        default:
                            System.out.println("Pilihan tidak tersedia");
                    }
                case "2":
                    System.out.println("Topik apa yang ingin kamu pelajari?");
                    System.out.println("1. Vektor");
                    System.out.println("2. Matriks");
                    System.out.print("Masukkan pilihan berupa nomor angka(contoh 1): ");
                break;
                default:
                    System.out.println("Pilihan kamu tidak ada dalam daftar pilihan!");
            }

            repeat++;
        }
    }
}