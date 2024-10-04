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
                case "1": {
                    System.out.println("Topik apa yang ingin kamu pelajari?");
                    System.out.println("1. Persamaan Garis");
                    System.out.println("2. Persamaan Lingkaran");
                    System.out.print("Masukkan pilihan berupa nomor(contoh 1): ");
                    String pilihank = input.next();

                    switch (pilihank) {
                        case "1":
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

                            double gradien1 = -(double) a / b;
                            double gradien = Math.round(gradien1 * 100.0) / 100.0;

                            double titikPotong1 = -(double) c / b;
                            double titikPotong = Math.round(titikPotong1 * 100.0) / 100.0;

                            
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

                        break;
                        default:
                            System.out.println("Pilihan tidak tersedia");

                    }
                break;
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

            System.out.println("Apakah ingin lanjut latihan?");
            String jawabS = input.next();
            if (jawabS.equalsIgnoreCase("ya") || jawabS.equalsIgnoreCase("y")) {
                repeat ++;
            }
            else {
                System.out.println("Terima kasih telah datang di klinik ...!");
                break;
            }
        }
    }
}
