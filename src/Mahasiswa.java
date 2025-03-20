
public class Mahasiswa {
    String nama;
    String nim;
    String jurusan;
    boolean isLulus = false;
    static int angkatan = 2019;


    
    Mahasiswa(String nama, String nim, String jurusan){
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
    }

    Mahasiswa(){
        this("no name", "0000", "no jurusan");
    }

    Mahasiswa(Mahasiswa m){
        this.nama = m.nama;
        this.nim = m.nim;
        this.jurusan = m.jurusan;
    }

    void belajar(){
        System.out.println(nama + " sedang belajar");
    }

    void belajar(String nama){
        System.out.println(this.nama + " sedang belajar");
    }


    String getNama(){
        return nama;
    }

    static void kuliah(){
        System.out.println("Mahasiswa Sedang Kuliah");
    }

    class Dalam{
        void test(){
            System.out.println("ini adalah inner class");
        }
    }
}