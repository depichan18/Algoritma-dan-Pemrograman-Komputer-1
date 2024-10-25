
import java.util.Random;
import java.util.Scanner;


public class TugasBesar {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Halo, selamat datang di kelas BCD.");
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
                    System.out.println("2. Fungsi");
                    System.out.print("Masukkan pilihan berupa nomor(contoh 1): ");
                    String pilihanK = input.next();

                    switch (pilihanK) {
                        case "1":
                            int a = (int) (Math.random() * 21) - 10;
                            int b = (int) (1 + (Math.random() * 11));
                            int c = (int) (Math.random() * 21) - 10;

                            System.out.println("Berikut soal persamaan garis yang dapat kamu kerjakan: ");
                            System.out.println("Tentukan gradien dan titik potong garis berikut dengan sumbu-y:");

                            if (a >= 0 && c >= 0) {
                                System.out.println(a + "x + " + b + "y + " + c + " = 0");
                            }
                            else if (a >= 0 && c < 0) {
                                System.out.println(a + "x + " + b + "y " + c + " = 0");
                            }
                            else if (a < 0 && c >= 0) {
                                System.out.println(a + "x + " + b + "y + " + c + " = 0");
                            }
                            else {
                                System.out.println(a + "x + " + b + "y " + c + " = 0");
                            }

                            double gradien1 = -(double) a / b;
                            double gradien = Math.round(gradien1 * 100.0) / 100.0;

                            double titikPotong1 = -(double) c / b;
                            double titikPotong = Math.round(titikPotong1 * 100.0) / 100.0;


                            System.out.print("Masukkan gradien: ");
                            double gradienInput = input.nextDouble();

                            System.out.print("Masukkan titik potong: ");
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

                            System.out.println("Gradiennya adalah " + gradien + " dan titik potongnya dengan sumbu-y adalah " + titikPotong + ".");
                        break;
                        case "2":
                            int x = (int)  (1 + (Math.random())*10);
                            System.out.println("Berapakah nilai dari g(x) = 5x + 2, jika x = " + x);
                            System.out.print("g(x)= ");
                            int inp = input.nextInt();
                            
                            int gx = 5*x + 2;

                            if (inp == gx) {
                                System.out.println("Jawaban kamu benar!");
                            }
                            else {
                                System.out.println("Jawaban kamu salah!");
                            }
                            System.out.println("Nilai fungsi g(x) adalah " + gx);
                        break;
                        default:
                            System.out.println("Pilihan tidak tersedia");

                    }
                break;
                }
                case "2":
                    System.out.println("Topik apa yang ingin kamu pelajari?");
                    System.out.println("1. Persamaan Lingkaran");
                    System.out.println("2. Persamaan Parabola");
                    System.out.print("Masukkan pilihan berupa nomor angka(contoh 1): ");
                    String pilihanG = input.next();

                    switch (pilihanG) {
                        case "1":
                            //Inisialisasi angka random      
                            int a = (int)(Math.random()*21)-10;
                            int b = (int)(Math.random()*21)-10;

                            //Inisialisasi jari-jari   
                            int r = (int)(Math.random()*21)+1;
                                
                            // Perhitungan c  dengan rumus c = a^2+b^2-r^2
                            int c = (int) (Math.pow(a,2)+Math.pow(b,2)- Math.pow(r, 2));
                                
                            // Soal persamaan lingkaran X^2+Y^2+2%dx+2%dy+c
                            System.out.println("Tuliskan jari-jari dari lingkaran berikut:");
                            System.out.printf("X^2+Y^2+%dx+%dy+%d = 0.\n",2*a,2*b,c);
                            System.out.print("Masukkan jari-jari : ");
                                
                            // Input User
                            int inputUser = input.nextInt();
                                
                            // Validasi jawaban
                            if (inputUser==r){
                            System.out.print("Selamat jawaban kamu benar.");}
                            else {
                            System.out.printf("Jawaban kamu salah, jawabannya adalah %d.",r);}
                            System.out.println();
                        break;
                        case "2":
                            int p = (int)(Math.random()*20-10);
                            int d = 4*p;
                            
                            System.out.println("Berapakah absis dari titik fokus persamaan parabola y^2 = " + (d) +"x?");
                            System.out.printf("Masukkan jawaban anda = ");
                            double answer = input.nextDouble();
                            
                            if (answer == p){
                                System.out.println("Jawaban kamu benar!");
                            } else {
                                System.out.println("Jawaban kamu salah!");
                            }
                            System.out.println("Jawaban yang benar adalah " + p);
                            
                            System.out.println(" ");
                            System.out.println("Mari kita lanjut ke soal berikutnya!");
                            System.out.println("Terbuka kemanakah persamaan parabola y^2 = " + d +"x?");
                            System.out.println("(a) Kanan");
                            System.out.println("(b) Kiri");
                            System.out.println("(c) Atas");
                            System.out.println("(d) Bawah");
                            System.out.printf("Masukkan jawaban anda = ");
                            input.nextLine();
                            String answerA = input.nextLine();
                            
                            if (p>0){
                                String kunci = "a";
                                if(answerA.equals(kunci)) {
                                System.out.println("Jawaban kamu benar!");
                                } else { 
                                    System.out.println("Jawaban kamu salah!");
                                } 
                                System.out.println("Jawaban yang benar adalah (a) kanan");
                            } else if (p<0) {
                                String kunci1 = "b";
                                if(answerA.equals(kunci1)) {
                                    System.out.println("Jawaban kamu benar!");
                                } else { 
                                    System.out.println("Jawaban kamu salah!");
                                } 
                                System.out.println("Jawaban yang benar adalah (b) kiri");  
                            }
                        break;
                        default:
                            System.out.println("Pilihan tidak tersedia");
                    }
                break;
                case "3":
                    System.out.println("Topik apa yang ingin kamu pelajari?");
                    System.out.println("1. Peluang");
                    System.out.println("2. Ukuran penyebaran data");
                    System.out.print("Masukkan pilihan berupa nomor(contoh 1): ");
                    String pilihanM = input.next();

                    switch (pilihanM) {
                        case "1":
                            Random random = new Random();

                            System.out.println("Selamat datang di Program Penghasil Soal Peluang!");
                            System.out.println("Berikut adalah soal Anda:");

                            // untuk memberikan soal random
                            int questionType = random.nextInt(3);
                            String question = "";
                            double correctAnswer = 0.0;

                            switch (questionType) {
                                case 0 -> {
                                    question = "Dari 10 bola di dalam kotak, 3 bola berwarna merah. Berapa peluang untuk mengambil bola merah?";
                                    correctAnswer = 3.0 / 10.0;
                                }
                                case 1 -> {
                                    question = "Dari 52 kartu dalam satu set kartu remi, berapa peluang untuk mengambil kartu As?";
                                    correctAnswer = 4.0 / 52.0;
                                }
                                case 2 -> {
                                    question = "Dari 6 sisi pada dadu, berapa peluang untuk mendapatkan angka 5?";
                                    correctAnswer = 1.0 / 6.0;
                                }
                            }
                            correctAnswer = Math.round(correctAnswer * 100.0) / 100.0;

                            System.out.println(question);
                            System.out.println("Masukkan jawaban Anda dalam bentuk desimal (contoh: 0.8):");
                            double userAnswer = input.nextDouble();

                            if (Math.abs(userAnswer - correctAnswer) < 0.001) {
                                System.out.println("Jawaban Anda benar!");
                            } else {
                                System.out.println("Jawaban Anda salah. Jawaban yang benar adalah: " + correctAnswer);
                            }

                        break;
                        case "2":
                            System.out.println("Diberikan data tinggi siswa SMA Kartika sebagai berikut:");
                         
                            // Akan dibuat data acak dengan menggunakan perintah Math.random
                            int d1 = 160 + (int)(Math.random()*21);
                            int d2 = 160 + (int)(Math.random()*21);
                            int d3 = 160 + (int)(Math.random()*21);
                            int d4 = 160 + (int)(Math.random()*21);
                            int d5 = 160 + (int)(Math.random()*21);
                            int d6 = 160 + (int)(Math.random()*21);
                            int d7 = 160 + (int)(Math.random()*21);
                            int d8 = 160 + (int)(Math.random()*21);
                            int d9 = 160 + (int)(Math.random()*21);
                            int d10 = 160 + (int)(Math.random()*21);
                            
                            System.out.println(d1 + " " + d2 + " " + d3 + " " + d4 + " " + d5);
                            System.out.println(d6 + " " + d7 + " " + d8 + " " + d9 + " " + d10);
                            System.out.println("Hitunglah Mean, Ragam dan Simpangan Baku dari data tersebut.");
                            System.out.println("Selamat mengerjakan!");
                            
                            // Hitung Rata-rata
                            double sum = d1 + d2 + d3 + d4 + d5 + d6 + d7 + d8 + d9 + d10;
                            double mean = (sum/10);
                            
                            // Hitung Ragam
                            double ragamRaw = (Math.pow(d1-mean, 2) + Math.pow(d2-mean, 2)
                                            + Math.pow(d3-mean, 2) + Math.pow(d4-mean, 2)
                                            + Math.pow(d5-mean, 2) + Math.pow(d6-mean, 2)
                                            + Math.pow(d7-mean, 2) + Math.pow(d8-mean, 2)
                                            + Math.pow(d9-mean, 2) + Math.pow(d10-mean, 2));
                            // Pembulatan 2 angka di belakang koma
                            double ragamRounded = (Math.round(ragamRaw * 100.0) / 100.0);
                            double ragam = ragamRounded / 10;
                            
                            // Hitung Simpangan Baku
                            double sBRaw = Math.sqrt(ragam);
                            // Pembulatan 2 angka di belakang koma
                            double sB = (Math.round(sBRaw * 100.0) / 100.0);
                            
                            // Akan diinput jawaban pengguna
                            System.out.println("Masukan Nilai Mean: ");
                            double meanAnw = input.nextDouble();
                            
                            System.out.println("Masukan Nilai Ragam: ");
                            double ragamAnw = input.nextDouble();
                            
                            System.out.println("Masukan Nilai Simpangan Baku: ");
                            double sBAnw = input.nextDouble();
                            
                            // Dicek jawaban pengguna dengan hasil sebenarnya
                            if (mean == meanAnw && ragam == ragamAnw && sB == sBAnw) {
                                System.out.println("Jawaban Kamu Benar!");
                            } else if (mean == meanAnw && ragam == ragamAnw && sB != sBAnw) {
                                System.out.println("Nilai Mean dan Ragam Sudah Benar, "
                                        + "Namun Simpangan Bakunya Masih Salah.");
                            } else if (mean == meanAnw && ragam != ragamAnw && sB == sBAnw) {
                                System.out.println("Nilai Mean dan Simpangan Baku Sudah Benar, "
                                        + "Namun Ragamnya Masih Salah.");
                            } else if (mean != meanAnw && ragam == ragamAnw && sB == sBAnw) {
                                System.out.println("Nilai Ragam dan Simpangan Baku Sudah Benar, "
                                        + "Namun Meannya Masih Salah.");
                            } else if (mean == meanAnw && ragam != ragamAnw && sB != sBAnw) {
                                System.out.println("Nilai Mean Sudah Benar, "
                                        + "Namun Ragam dan Simpangan Bakunya Masih Salah.");
                            } else if (mean != meanAnw && ragam == ragamAnw && sB != sBAnw) {
                                System.out.println("Nilai Ragam Sudah Benar, "
                                        + "Namun Mean dan Simpangan Bakunya Masih Salah.");
                            } else if (mean != meanAnw && ragam != ragamAnw && sB == sBAnw) {
                                System.out.println("Nilai Simpangan Baku Sudah Benar, "
                                        + "Namun Mean dan Ragamnya Masih Salah.");
                            } else {
                                System.out.println("Jawaban Kamu Salah!");
                            }
                                
                            // Tampilkan jawaban sebenarnya
                            System.out.println("Nilai Mean " + mean + " dengan Ragam " + ragam +
                                    " dan Simpangan Baku " + sB);
                        break;
                        default:
                            System.out.println("Pilihan tidak tersedia");
                    }

                break;
                default:
                    System.out.println("Pilihan kamu tidak ada dalam daftar pilihan!");
            }

            System.out.println("Apakah ingin melanjutkan latihan?");
            String jawabS = input.next();

            if (jawabS.equalsIgnoreCase("ya") || jawabS.equalsIgnoreCase("y")) {
                repeat ++;
            }
            else {
                System.out.println("Terima kasih telah datang di kelas BCD!");
                break;
            }
        }
        input.close();
    }
}
