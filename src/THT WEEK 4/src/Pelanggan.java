public class Pelanggan {
    // Atribut dengan modifier private untuk enkapsulasi
    private String idPelanggan;
    private String nama;
    private String email;
    private double saldo;

    // Constructor untuk inisialisasi data pelanggan
    public Pelanggan(String idPelanggan, String nama, String email, double saldo) {
        this.idPelanggan = idPelanggan;
        this.nama = nama;
        this.email = email;
        this.saldo = saldo;
    }

    // Method untuk menampilkan informasi pelanggan
    public void tampilkanInfoPelanggan() {
        System.out.println("ID Pelanggan: " + idPelanggan);
        System.out.println("Nama: " + nama);
        System.out.println("Email: " + email);
        System.out.println("Saldo: Rp " + saldo);
    }

    // Method untuk top-up saldo
    public void topUpSaldo(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println("Top-up berhasil! Saldo baru: Rp " + saldo);
        } else {
            System.out.println("Error: Jumlah top-up harus lebih dari 0!");
        }
    }

    // Method untuk mengurangi saldo, dengan validasi
    public boolean kurangiSaldo(double jumlah) {
        if (jumlah <= saldo) {
            saldo -= jumlah;
            return true; // Saldo berhasil dikurangi
        } else {
            System.out.println("Error: Saldo tidak mencukupi! Saldo tersedia: Rp " + saldo);
            return false; // Gagal mengurangi saldo
        }
    }

    // Getter untuk saldo (digunakan untuk validasi transaksi)
    public double getSaldo() {
        return saldo;
    }

    // Getter untuk ID pelanggan (digunakan untuk riwayat transaksi)
    public String getIdPelanggan() {
        return idPelanggan;
    }

    // Getter untuk nama (digunakan untuk riwayat transaksi)
    public String getNama() {
        return nama;
    }
}