/*
 * NAMA       : Irfan Faisal Hutama Tanjung
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117060
 * DESKRIPSI PROGRES : Program ini untuk menampilkan cetak nama
 */
package pbo2.pkg10117060.latihan45.cetaknama;


public class Printer {
    private int jmlCetak;
    private String nama;
    
    //Kalo private harus ada return
    public int getJmlCetak() {
       return jmlCetak; 
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setJmlCetak(int jmlCetak) {
        this.jmlCetak = jmlCetak;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void cetak(String nama) {
        System.out.println("Masukkan nama anda : " + nama);
    }
    
    public void cetak(int jmlCetak, String nama) {
        System.out.println("Hasil Cetak : ");
        for (int i = 1; i <= jmlCetak; i++) {
            System.out.println(i + ". " + nama);
        }
    }
}
