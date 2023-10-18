import java.util.Scanner;
public class HitungIP08 {
    public static void main(String[] args) {
        Scanner input08 = new Scanner(System.in);

        System.out.print("Masukkan nama mahasiswa : ");
        String nama = input08.nextLine();

        System.out.print("Masukkan jumlah mata kuliah : ");
        int n = input08.nextInt();

        double total_bobot = 0;
        int total_sks = 0;
        int remidi = 0;

        for (int i = 1; i <= n; i++) {
            System.out.println("\nMata kuliah ke-" + i);
            input08.nextLine();
            System.out.print("Masukkan nama mata kuliah : ");
            String nama_mk = input08.nextLine();
            System.out.print("Masukkan indeks nilai (A/B+/B/C+/C/D/E) : ");
            String Nilai = input08.nextLine();
            System.out.print("Masukkan jumlah SKS : ");
        
             int sks = input08.nextInt();

            double bobot;
            switch (Nilai) {
                case "A":
                    bobot = 4.0;
                    break;
                case "B+":
                    bobot = 3.5;
                    break;
                case "B":
                    bobot = 3.0;
                    break;
                case "C+":
                    bobot = 2.5;
                    break;
                case "C":
                    bobot = 2.0;
                    break;
                case "D":
                    bobot = 1.0;
                    remidi++;
                    break;
                default:
                    bobot = 0.0;
                    remidi++;
            }

            total_bobot += sks * bobot;
            total_sks += sks;
        }

        double IP = total_bobot / total_sks;

        System.out.println("-----------------Hasil Perhitungan IP-------------------");
        System.out.println("\nNama mahasiswa: " + nama);
        System.out.printf("Indeks Prestasi (IP): %.2f\n", IP);
        System.out.println("Total mata kuliah: " + n);
        System.out.println("Total SKS: " + total_sks);
        System.out.println("Jumlah mata kuliah yang harus perbaikan/remidi: " + remidi);
        System.out.println("--------------------------------------------------------");
       
        }
    }         