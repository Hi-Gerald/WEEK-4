
public class main {
    public static void main(String[] args) {
        // Mahasiswa mhs1 = new Mahasiswa( "Jake", "1010","Teknik Informatika");
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nama = "j0ke";
        mhs1.nim ="1010";
        mhs1.jurusan = "Teknik Informatika";


        System.out.println(mhs1.nama);
        System.out.println(mhs1.nim);
        System.out.println(mhs1.jurusan);
        mhs1.belajar();
        System.out.println(mhs1.getNama());
        Mahasiswa.kuliah();
        System.out.println(Mahasiswa.angkatan);
        
        mhs1.belajar();
        mhs1.belajar("Jeni");

        mhs1.nama = "Jayoo";
        System.out.println(mhs1.nama);
        // mhs1.kuliah();

        System.out.println();
        // Mahasiswa mhs2 = new Mahasiswa("Karina", "1100", "Sistem Informasi");
        Mahasiswa mhs2 = new Mahasiswa(mhs1);
        mhs2.nama = "Karin";
        mhs2.nim ="1010";
        mhs2.jurusan = "Sistem Informasi";


        System.out.println(mhs2.nama);
        System.out.println(mhs2.nim);
        System.out.println(mhs2.jurusan);
    }
}