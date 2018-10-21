/*
 * NAMA       : Irfan Faisal Hutama Tanjung
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117060
 * DESKRIPSI PROGRES : Program ini untuk mencetak nama
 */
package pbo2.pkg10117060.latihan45.cetaknama;

import java.util.Scanner;

/**
 *
 * @author Kamvang
 */
public class PBO210117060Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);
        Printer ptr = new Printer();
        System.out.println("Aplikasi pencetak Nama");
        System.out.println("Masukkan nama anda ");
        ptr.setNama(baca.nextLine());
        System.out.println("Mau cetak berapa kali : ");
        ptr.setJmlCetak(baca.nextInt()); //readln;
        ptr.cetak(ptr.getNama());
        ptr.cetak(ptr.getJmlCetak(), ptr.getNama());
                
                
    }
    
}
