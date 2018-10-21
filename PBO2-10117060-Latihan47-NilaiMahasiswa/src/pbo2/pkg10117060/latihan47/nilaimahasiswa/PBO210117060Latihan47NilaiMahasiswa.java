/**
 *
 * Nama : iRFAN FAISAL HUTAMA TANJUNG
 * Kelas : PBO2 
 * Nim : 10117060
 * Deskripsi Program : Program ini  menghitung nilai mahasiswa
 */
package pbo2.pkg10117060.latihan47.nilaimahasiswa;

/**
 *
 * @author Kamvang
 */
public class PBO210117060Latihan47NilaiMahasiswa {

     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nilai mahasiswa = new Nilai(75,45,34);
        System.out.println("QUIZ : "+mahasiswa.getnQuiz());
        System.out.println("UTS : "+mahasiswa.getnUTS());
        System.out.println("UAS : "+mahasiswa.getnUAS());
        System.out.println("");
        System.out.println("Nilai Akhir : "+mahasiswa.hitungNilaiAkhir());
        System.out.println("");
        System.out.println("Indeks : "+mahasiswa.nilaiIndeks(mahasiswa.hitungNilaiAkhir()));
        System.out.println("Keterangan : "+mahasiswa.indeksKeterangan(mahasiswa.nilaiIndeks(mahasiswa.hitungNilaiAkhir())));
        System.out.println("");
        //
        Nilai mahasiswa2 = new Nilai(60,80,75);
        System.out.println("QUIZ : "+mahasiswa2.getnQuiz());
        System.out.println("UTS : "+mahasiswa2.getnUTS());
        System.out.println("UAS : "+mahasiswa2.getnUAS());
        System.out.println("");
        System.out.println("Nilai Akhir : "+mahasiswa2.hitungNilaiAkhir());
        System.out.println("");
        System.out.println("Indeks : "+mahasiswa2.nilaiIndeks(mahasiswa2.hitungNilaiAkhir()));
        System.out.println("Keterangan : "+mahasiswa2.indeksKeterangan(mahasiswa2.nilaiIndeks(mahasiswa2.hitungNilaiAkhir())));
        System.out.println("");
        //
        Nilai mahasiswa3 = new Nilai(30,80,40);
        System.out.println("QUIZ : "+mahasiswa3.getnQuiz());
        System.out.println("UTS : "+mahasiswa3.getnUTS());
        System.out.println("UAS : "+mahasiswa3.getnUAS());
        System.out.println("");
        System.out.println("Nilai Akhir : "+mahasiswa3.hitungNilaiAkhir());
        System.out.println("");
        System.out.println("Indeks : "+mahasiswa3.nilaiIndeks(mahasiswa3.hitungNilaiAkhir()));
        System.out.println("Keterangan : "+mahasiswa3.indeksKeterangan(mahasiswa3.nilaiIndeks(mahasiswa3.hitungNilaiAkhir())));
    }
    
}
