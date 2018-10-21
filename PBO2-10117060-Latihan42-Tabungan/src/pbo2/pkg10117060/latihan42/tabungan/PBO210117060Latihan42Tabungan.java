/**
 *
 * Nama : iRFAN FAISAL HUTAMA TANJUNG
 * Kelas : PBO2 
 * Nim : 10117060
 * Deskripsi Program : Program ini  menghitung tabungan
 */
package pbo2.pkg10117060.latihan42.tabungan;

import java.util.Scanner;

/**
 *
 * @author Kamvang
 */
public class PBO210117060Latihan42Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
       
        System.out.print("Masukkan saldo awal : ");
        Tabungan tabungan = new Tabungan(scn.nextInt());
        
        System.out.print("Jumlah yang mau diambil ");
        tabungan.ambilUang(scn.nextInt());
        
        System.out.println("Saldo anda sekarang : " + tabungan.ambilUang(0));
        
    }
    
}
