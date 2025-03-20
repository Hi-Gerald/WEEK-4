public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("Gerald", "12345", "Informatika", 3.5);
        Mahasiswa mhs2 = new Mahasiswa("Eberhard", "67890", "Sistem Informasi", 2.8);

        System.out.println("Data Mahasiswa 1:");
        mhs1.tampilkanInfo();
        System.out.println("Status Kelulusan: " + (mhs1.cekLulus() ? "Lulus" : "Tidak Lulus"));
        System.out.println();

        System.out.println("Data Mahasiswa 2:");
        mhs2.tampilkanInfo();
        System.out.println("Status Kelulusan: " + (mhs2.cekLulus() ? "Lulus" : "Tidak Lulus"));
    }
}