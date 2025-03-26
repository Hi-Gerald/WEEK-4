public class Main {
    public static void main(String[] args) {
        
        Produk produk1 = new Produk("P001", "Laptop", 10000000, 5);
        Produk produk2 = new Produk("P002", "Mouse", 150000, 10);

        System.out.println("=== Daftar Produk ===");
        produk1.tampilkanInfoProduk();
        System.out.println();
        produk2.tampilkanInfoProduk();
        System.out.println();

        Pelanggan pelanggan1 = new Pelanggan("C001", "Gerald", "gerald@email.com", 5000000);
        Pelanggan pelanggan2 = new Pelanggan("C002", "Dion", "dion@email.com", 20000000);

        System.out.println("=== Daftar Pelanggan ===");
        pelanggan1.tampilkanInfoPelanggan();
        System.out.println();
        pelanggan2.tampilkanInfoPelanggan();
        System.out.println();

        pelanggan1.topUpSaldo(5000000);
        System.out.println();

        Transaksi transaksi1 = new Transaksi("T001", pelanggan1, produk1, 1); 
        Transaksi transaksi2 = new Transaksi("T002", pelanggan2, produk2, 3); 
        Transaksi transaksi3 = new Transaksi("T003", pelanggan1, produk1, 10); 
        Transaksi transaksi4 = new Transaksi("T004", pelanggan1, produk2, 5);


        System.out.println("=== Proses Transaksi ===");
        if (transaksi1.prosesTransaksi()) {
            transaksi1.tampilkanDetailTransaksi();
        }
        System.out.println();

        if (transaksi2.prosesTransaksi()) {
            transaksi2.tampilkanDetailTransaksi();
        }
        System.out.println();

        if (transaksi3.prosesTransaksi()) {
            transaksi3.tampilkanDetailTransaksi();
        }
        System.out.println();

        if (transaksi4.prosesTransaksi()) {
            transaksi4.tampilkanDetailTransaksi();
        }
        System.out.println();
        
        System.out.println("=== Informasi Terbaru ===");
        System.out.println("Produk setelah transaksi:");
        produk1.tampilkanInfoProduk();
        System.out.println();
        produk2.tampilkanInfoProduk();
        System.out.println();

        System.out.println("Pelanggan setelah transaksi:");
        pelanggan1.tampilkanInfoPelanggan();
        System.out.println();
        pelanggan2.tampilkanInfoPelanggan();
    }
}