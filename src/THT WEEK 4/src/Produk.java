public class Produk {
    // Atribut dengan modifier private untuk enkapsulasi
    private String kodeProduk;
    private String namaProduk;
    private double harga;
    private int stok;

    // Constructor untuk inisialisasi data produk
    public Produk(String kodeProduk, String namaProduk, double harga, int stok) {
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }

    // Method untuk menampilkan informasi produk
    public void tampilkanInfoProduk() {
        System.out.println("Kode Produk: " + kodeProduk);
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga: Rp " + harga);
        System.out.println("Stok: " + stok);
    }

    // Method untuk mengurangi stok, dengan validasi
    public boolean kurangiStok(int jumlah) {
        if (jumlah <= stok) {
            stok -= jumlah;
            return true; // Stok berhasil dikurangi
        } else {
            System.out.println("Error: Stok tidak mencukupi! Stok tersedia: " + stok);
            return false; // Gagal mengurangi stok
        }
    }

    // Getter untuk harga (digunakan saat transaksi)
    public double getHarga() {
        return harga;
    }

    // Getter untuk stok (digunakan untuk validasi)
    public int getStok() {
        return stok;
    }

    // Getter untuk kode produk (digunakan untuk riwayat transaksi)
    public String getKodeProduk() {
        return kodeProduk;
    }

    // Getter untuk nama produk (digunakan untuk riwayat transaksi)
    public String getNamaProduk() {
        return namaProduk;
    }
}