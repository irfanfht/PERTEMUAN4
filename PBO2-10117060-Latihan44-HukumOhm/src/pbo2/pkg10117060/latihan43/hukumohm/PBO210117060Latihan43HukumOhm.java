/*
 * NAMA       : Irfan Faisal Hutama Tanjung
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117060
 * DESKRIPSI PROGRES :  Program ini untuk menampilkan Hukum Ohm. 
                        maaf pak, nama projeknya salah. seharusnya latihan 44 hehe
 */
package pbo2.pkg10117060.latihan43.hukumohm;

public class PBO210117060Latihan43HukumOhm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Baterai btr = new Baterai(3,12);
        System.out.println("Kuat Arus : " + btr.getKuatArus() + " Ampere");
        System.out.println("Hambatan Arus : " + btr.getHambatan() + " ohm");
        System.out.println("Hasil Tegangan : " + btr.hitungTegangan() + " volt");
    }
    
}
