public class Transaksi {
    private String idTransaksi;
    private Pelanggan pelanggan;
    private Produk produk;
    private int jumlahBeli;
    private double totalHarga;

    public Transaksi(String idTransaksi, Pelanggan pelanggan, Produk produk, int jumlahBeli) {
        this.idTransaksi = idTransaksi;
        this.pelanggan = pelanggan;
        this.produk = produk;
        this.jumlahBeli = jumlahBeli;
        this.totalHarga = produk.getHarga() * jumlahBeli; 
    }

    public boolean prosesTransaksi() {
        if (!produk.kurangiStok(jumlahBeli)) {
            return false;
        }

        if (!pelanggan.kurangiSaldo(totalHarga)) {
            produk.kurangiStok(-jumlahBeli);
            return false;
        }

        System.out.println("Transaksi berhasil!");
        return true;
    }

    public void tampilkanDetailTransaksi() {
        System.out.println("=== Detail Transaksi ===");
        System.out.println("ID Transaksi: " + idTransaksi);
        System.out.println("Pelanggan: " + pelanggan.getNama() + " (ID: " + pelanggan.getIdPelanggan() + ")");
        System.out.println("Produk: " + produk.getNamaProduk() + " (Kode: " + produk.getKodeProduk() + ")");
        System.out.println("Jumlah Beli: " + jumlahBeli);
        System.out.println("Total Harga: Rp " + totalHarga);
    }
}