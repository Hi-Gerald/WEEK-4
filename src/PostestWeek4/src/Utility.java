//Nama: Gerald Eberhard
//NIM: 105223002
public class Utility {
    public static double hitungDiskon(double totalBiaya, int durasiSewa) {
        if (durasiSewa > 5) {
            return totalBiaya * 0.9;
        }
        return totalBiaya;
    }

    public static String formatMataUang(double jumlah) {
        return String.format("Rp %, .2f", jumlah);
    }
}