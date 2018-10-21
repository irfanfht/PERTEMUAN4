
/**
 *
 * Nama : Irfan Faisal Hutama Tanjung
 * Kelas : PBO2 
 * Nim : 10117060
 * Deskripsi Program : Program ini untuk menghitung biaya emas kawin
 */
package pbo2.pkg10117060.latihan49.biayaemaskawin;

public class Emas {
    private double harga = 570000;
    private double berat;
    
    public Emas(double berat){
        this.berat = berat;
    }

    public double getBerat() {
        return berat;
    }

    public double getHarga() {
        return harga;
    }

    public double hitungHargaEmas(double parBerat, double parHarga){
        return berat*harga;
    }
}
