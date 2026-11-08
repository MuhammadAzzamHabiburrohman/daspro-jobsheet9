import java.util.Scanner;

public class Tugas1_NilaiMahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = scanner.nextInt();
        int[] nilaiMhs = new int[jumlah];

        int total = 0;
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = scanner.nextInt();
            total += nilaiMhs[i];
        }

        double rataRata = (jumlah > 0) ? (double) total / jumlah : 0;

        int tertinggi = nilaiMhs[0];
        int terendah = nilaiMhs[0];
        for (int i = 1; i < jumlah; i++) {
            if (nilaiMhs[i] > tertinggi) tertinggi = nilaiMhs[i];
            if (nilaiMhs[i] < terendah) terendah = nilaiMhs[i];
        }

        System.out.println("\n--- REKAPITULASI NILAI ---");
        System.out.println("Nilai Rata-rata : " + rataRata);
        System.out.println("Nilai Tertinggi : " + tertinggi);
        System.out.println("Nilai Terendah  : " + terendah);

        System.out.println("\nDaftar Status Kelulusan:");
        for (int i = 0; i < jumlah; i++) {
            String status = (nilaiMhs[i] > 70) ? "LULUS" : "TIDAK LULUS";
            System.out.println("Mahasiswa ke-" + (i + 1) + " = " + nilaiMhs[i] + " (" + status + ")");
        }

        scanner.close();
    }
}