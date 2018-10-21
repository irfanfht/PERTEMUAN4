/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117060.latihan49.biayaemaskawin;

/**
 *
 * Nama : Irfan Faisal Hutama Tanjung
 * Kelas : PBO2 
 * Nim : 10117060
 * Deskripsi Program : Program ini untuk menghitung biaya emas kawin
 */
public class PBO210117060Latihan49BiayaEmasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Emas emas = new Emas(15.7);
        System.out.println("Hitung Mahar Nikah");  
        System.out.println("Harga Emas Saat ini Rp. "+emas.getHarga()+" per gramnya");
        System.out.println("Emas yang ingin dibeli Hendi : "+emas.getBerat()+" gram");
        System.out.println("Total biaya yang harus dikeluarkan Rp. "+emas.hitungHargaEmas(emas.getBerat(), emas.getHarga()));
    }
    
}
