/**
 *
 * Nama : iRFAN FAISAL HUTAMA TANJUNG
 * Kelas : PBO2 
 * Nim : 10117060
 * Deskripsi Program : Program ini class umur
 */
package pbo2.pkg10117060.latihan46.tandanyakamu;

/**
 *
 * @author Kamvang
 */
public class Age {
    
    private int yearBirth;
    private int yearNow;
    private final String red = "\u001b[31m";
    
    public Age(int yearNow) {
        this.yearNow = yearNow;
    }
    
    public int getYearBirth() {
        return yearBirth;
    }
    
    public int getYearNow() {
        return yearNow;
    }
    
    public void setYoutBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }
    
    public int hitungUmur() {
        return yearNow - yearBirth;
    }
 
    public String tandanyaKamu(int umur) {
        if (umur >= 0 && umur <=5) {
            System.out.println("Tandanya  kamu " + red + "Lagi lucu - lucunya");
        }
        else if (umur > 5 && umur <= 10) {
            System.out.println("Tandanya  kamu " + red + "Masih anak - anak");
        }
        else if (umur > 10 && umur <= 13) {
            System.out.println("Tandanya  kamu " + red + "Masih remaja");
        }
        else if (umur > 13 && umur <= 19) {
            System.out.println("Tandanya  kamu " + red + "4LAY");
        }
        else if (umur > 19 && umur <= 29) {
            System.out.println("Tandanya  kamu " + red + "Lagi galau nyari jodoh");
        }
        else if (umur > 29 && umur <= 35) {
            System.out.println("Tandanya  kamu " + red + "Lagi sibuk nyari uang");
        }
        else if (umur <0 && umur >150) {
            System.out.println("Tandanya  kamu " + red + "Tidak terdefinisi di kehidupan");
        }
        return red;
    }
}