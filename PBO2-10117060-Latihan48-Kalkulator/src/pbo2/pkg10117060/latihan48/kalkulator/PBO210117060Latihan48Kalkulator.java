/**
 *

 * Nama : Irfan Faisal Hutama Tanjung
 * Kelas : PBO2 
 * Nim : 10117060
 * Deskripsi Program : Program ini untuk menghitung angka dengan
 * operator Tambah, Kurang, Kali, dan Bagi
 */
package pbo2.pkg10117060.latihan48.kalkulator;

/**
 *
 * @author Kamvang
 */
public class PBO210117060Latihan48Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Kalkulator klt =  new Kalkulator();
        klt.setValue1(7);
        klt.setValue2(5);
        System.out.println("VALUE 1 = "+klt.getValue1());
        System.out.println("VALUE 2 = "+klt.getValue2());
        klt.setNameProject();
        klt.setNoteProject(null);
        System.out.println("Result Add is = "+klt.add(klt.getValue1(), klt.getValue2()));
        System.out.println("Result Minus is = "+klt.minus(klt.getValue1(), klt.getValue2()));
        System.out.println("Result Multiplication is = "+klt.multiplication(klt.getValue1(), klt.getValue2()));
        System.out.println("Result Division is = "+klt.division(klt.getValue1(), klt.getValue2()));
    }
    
}
