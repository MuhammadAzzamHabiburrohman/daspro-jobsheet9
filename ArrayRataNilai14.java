import java.util.Scanner;

public class ArrayRataNilai14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMhs = input.nextInt();
        int[] nilaiMhs = new int[jumlahMhs];
        int total = 0;
        double rata2;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = input.nextInt();
            total += nilaiMhs[i];

        }
        if (jumlahMhs > 0){
            rata2 = (double) total / nilaiMhs.length;
        } else {
            rata2 = 0;
        }
            

        int tertinggi = nilaiMhs[0];
        int terendah = nilaiMhs[0];
        int mahasiswaLulus = 0;
        for (int i = 1; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > tertinggi) tertinggi = nilaiMhs[i];
            if (nilaiMhs[i] < terendah) terendah = nilaiMhs[i];
        }
        for (int nilai : nilaiMhs) {
            if (nilai > 70) {
                mahasiswaLulus++;
            }
        }
        System.out.println("Total nilai: " + total);
        System.out.println("Rata-rata: " + rata2);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Jumlah mahasiswa yang lulus: " + mahasiswaLulus);

        String predikat;
        if (rata2 >= 85) {
            predikat = "SANGAT BAIK";
        } else if (rata2 >= 70) {
            predikat = "BAIK";
        } else {
            predikat = "PERLU PENDAMPINGAN";
        }
        System.out.println("Predikat kelas: " + predikat);
    }
    
}
