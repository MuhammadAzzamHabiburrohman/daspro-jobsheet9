import java.util.Scanner;

public class Tugas2_KafeKampus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        
        System.out.println("=== PENCARIAN MENU KAFE ===");
        System.out.print("Masukkan nama menu yang ingin dicari: ");
        String cariMenu = scanner.nextLine();
        boolean ditemukan = false;
        int hargaDitemukan = 0;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(cariMenu)) {
                ditemukan = true;
                hargaDitemukan = harga[i];
                break;
            }
        }

        if (ditemukan) {
            System.out.println("Menu \"" + cariMenu + "\" tersedia dengan harga Rp " + hargaDitemukan);
        } else {
            System.out.println("Maaf, menu \"" + cariMenu + "\" tidak tersedia di kafe.");
        }

        
        System.out.println("\n=== PEMESANAN KAFE KAMPUS ===");
        System.out.print("Masukkan jumlah jenis item yang ingin dipesan: ");
        int jumlahPesanan = scanner.nextInt();
        scanner.nextLine(); 

        String[] pesananItem = new String[jumlahPesanan];
        int[] jumlahItem = new int[jumlahPesanan];
        int[] subTotal = new int[jumlahPesanan];
        int totalBiaya = 0;

        for (int i = 0; i < jumlahPesanan; i++) {
            boolean validMenu = false;
            String namaPesanan = "";

            while (!validMenu) {
                System.out.print("Masukkan nama menu ke-" + (i + 1) + ": ");
                namaPesanan = scanner.nextLine();

                
                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(namaPesanan)) {
                        validMenu = true;
                        namaPesanan = menu[j];
                        break;
                    }
                }

                if (!validMenu) {
                    System.out.println("Menu tidak valid atau tidak tersedia. Silakan masukkan ulang.");
                }
            }

            System.out.print("Masukkan jumlah porsi untuk " + namaPesanan + ": ");
            int qty = scanner.nextInt();
            scanner.nextLine();

            pesananItem[i] = namaPesanan;
            jumlahItem[i] = qty;

            
            int hargaSatuan = 0;
            for (int j = 0; j < menu.length; j++) {
                if (menu[j].equals(namaPesanan)) {
                    hargaSatuan = harga[j];
                    break;
                }
            }

            subTotal[i] = hargaSatuan * qty;
            totalBiaya += subTotal[i];
        }

        
        System.out.println("\n========================================");
        System.out.println("         STRUK PEMESANAN KAFE KAMPUS    ");
        System.out.println("========================================");
        System.out.printf("%-20s | %-5s | %-10s\n", "Nama Menu", "Qty", "Subtotal");
        System.out.println("----------------------------------------");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.printf("%-20s | %-5d | Rp %-7d\n", pesananItem[i], jumlahItem[i], subTotal[i]);
        }
        System.out.println("----------------------------------------");
        System.out.println("TOTAL BIAYA KESELURUHAN: Rp " + totalBiaya);
        System.out.println("========================================");

        scanner.close();
    }
}