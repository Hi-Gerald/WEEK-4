//Nama: Gerald Eberhard
//NIM: 105223002

public class Main {
    public static void main(String[] args) {
        
        Mobil mobil1 = new Mobil("B 1234 GG", "Toyota Avanza", 250000);
        Mobil mobil2 = new Mobil("B 5678 UU", "Honda Jazz", 300000);
        Mobil mobil3 = new Mobil();

        Pelanggan pelanggan1 = new Pelanggan("Yanto Eberhard", "1234567890", "08123456789");
        Pelanggan pelanggan2 = new Pelanggan("Sugimoto Yanto", "0987654321", "08765432100");
        System.out.println("=== DAFTAR MOBIL TERSEDIA ===");
        mobil1.tampilkanInfo();
        mobil2.tampilkanInfo();
        mobil3.tampilkanInfo();

        System.out.println("\n=== TRANSAKSI PENYEWAAN 1 ===");
        Sewa sewa1 = new Sewa(pelanggan1, mobil2, 7);
        sewa1.prosesPenyewaan();

        System.out.println("\n=== TRANSAKSI PENYEWAAN 2 ===");
        Sewa sewa2 = new Sewa(pelanggan2, mobil1, 3); 
        sewa2.prosesPenyewaan();

        
        System.out.println("\n=== STATUS MOBIL SETELAH TRANSAKSI ===");
        mobil1.tampilkanInfo();
        mobil2.tampilkanInfo();
    }
}