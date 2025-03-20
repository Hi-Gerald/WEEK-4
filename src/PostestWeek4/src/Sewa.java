//Nama: Gerald Eberhard
//NIM: 105223002
public class Sewa {
    private Pelanggan pelanggan;
    private Mobil mobil;
    private int durasiSewa; 
    private double totalBiaya;
    private boolean statusTransaksi;

    public Sewa(Pelanggan pelanggan, Mobil mobil, int durasiSewa) {
        this.pelanggan = pelanggan;
        this.mobil = mobil;
        this.durasiSewa = durasiSewa;
        this.totalBiaya = 0.0;
        this.statusTransaksi = false;
    }

    public void prosesPenyewaan() {
        if (mobil.isTersedia()) {
            totalBiaya = mobil.getHargaSewaPerHari() * durasiSewa;
            totalBiaya = Utility.hitungDiskon(totalBiaya, durasiSewa);
            mobil.setTersedia(false);
            statusTransaksi = true;
            tampilkanStruk();
        } else {
            System.out.println("Transaksi gagal: Mobil tidak tersedia.");
            statusTransaksi = false;
        }
    }

    public void tampilkanStruk() {
        System.out.println("===== STRUK PENYEWAAN =====");
        System.out.println("Informasi Pelanggan:");
        pelanggan.tampilkanInfo();
        System.out.println("\nInformasi Mobil:");
        mobil.tampilkanInfo();;
        System.out.println("Durasi Sewa: " + durasiSewa + " hari");
        System.out.println("Total Biaya: " + Utility.formatMataUang(totalBiaya));
        System.out.println("Status Transaksi: " + (statusTransaksi ? "Berhasil" : "Gagal"));
        System.out.println("===========================");
    }
}