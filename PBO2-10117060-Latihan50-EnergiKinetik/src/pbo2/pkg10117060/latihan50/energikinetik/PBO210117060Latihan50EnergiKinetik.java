/**
 *
 * Nama : iRFAN FAISAL HUTAMA TANJUNG
 * Kelas : PBO2 
 * Nim : 10117060
 * Deskripsi Program : Program ini  menghitung energi kinetik dan nilai usahanya
 */
package pbo2.pkg10117060.latihan50.energikinetik;

public class PBO210117060Latihan50EnergiKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Energi bola = new Energi();
        bola.setMassa(145);
        bola.setKecepatan(25);
        System.out.println("Sebuah bola baseball dengan massa = " + bola.getMassa() + " g");
        System.out.println("Bola baseball terssebut dilempar dengan kecepatan = " + bola.getKecepatan() + " m/s");
        
        double massa = bola.getMassa();
        double kecepatan = bola.getKecepatan();
        
        System.out.println("A. Energi Kinetik = " + bola.hitungEnergiKinetik1(massa, kecepatan));
        System.out.println("B. Usaha pada bola = " + bola.usaha());
        System.out.println("P.S : Nilai usaha tetap, karena dimulai dari keadaan diam");
    }
    
}
