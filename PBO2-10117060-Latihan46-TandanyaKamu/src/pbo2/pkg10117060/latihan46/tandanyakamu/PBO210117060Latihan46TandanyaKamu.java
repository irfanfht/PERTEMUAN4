/**
 *
 * Nama : iRFAN FAISAL HUTAMA TANJUNG
 * Kelas : PBO2 
 * Nim : 10117060
 * Deskripsi Program : Program ini hasil perhitungan umur sesuai tanda 
 */
package pbo2.pkg10117060.latihan46.tandanyakamu;

import java.util.Scanner;

/**
 *
 * @author Kamvang
 */
public class PBO210117060Latihan46TandanyaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);
        
        Age man1 = new Age(2018);
        System.out.println("Masukkan tahun lahir : ");
        man1.setYoutBirth(baca.nextInt());
        System.out.println("");
        System.out.println("======= Hasil perhitungan umur =========");
        System.out.println("Tahun lahir anda : " + man1.getYearBirth());
        System.out.println("Hari ini tahun : " + man1.getYearNow());
        System.out.println("Umur kamu sampai hari ini adalah : " + man1.hitungUmur() + "Tahun");
        man1.tandanyaKamu(man1.hitungUmur());
    }
    
}
