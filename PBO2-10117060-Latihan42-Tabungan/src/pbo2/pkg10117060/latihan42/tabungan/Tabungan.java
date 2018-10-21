/**
 *
 * Nama : iRFAN FAISAL HUTAMA TANJUNG
 * Kelas : PBO2 
 * Nim : 10117060
 * Deskripsi Program : Program ini  menghitung tabungan
 */
package pbo2.pkg10117060.latihan42.tabungan;

/**
 *
 * @author Kamvang
 */
public class Tabungan {
    private int saldo;
    
    public Tabungan(int saldo) {
        this.saldo = saldo;
    }
    
    public int ambilUang(int jumlah) {
        saldo = saldo - jumlah;
        return saldo;
    }
}
