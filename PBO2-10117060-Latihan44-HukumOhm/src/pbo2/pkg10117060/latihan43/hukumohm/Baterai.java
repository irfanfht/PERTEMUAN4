/**
 *
 * Nama : iRFAN FAISAL HUTAMA TANJUNG
 * Kelas : PBO2 
 * Nim : 10117060
 * Deskripsi Program : Program ini menghitung ohm.
 */
package pbo2.pkg10117060.latihan43.hukumohm;

/**
 *
 * @author Irfan
 */
public class Baterai {
    private float kuatArus;
    private float hambatan;
    
    public Baterai() {
        
    }
    
    public Baterai(float kuatArus, float hambatan) {
        this.kuatArus = kuatArus;
        this.hambatan = hambatan;
    }
    
    public float getKuatArus() {
        return kuatArus;
    }
    
    public float getHambatan() {
        return hambatan;
    }
    
    public float hitungTegangan() {
        return kuatArus * hambatan;
    }
}
