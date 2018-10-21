/**
 *
 * Nama : iRFAN FAISAL HUTAMA TANJUNG
 * Kelas : PBO2 
 * Nim : 10117060
 * Deskripsi Program : Program ini  menghitung Gaji pegawai
 */
package pbo2.pkg10117060.latihan43.gajipegawai;


public class PBO210117060Latihan43GajiPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("### Data gaji karyawan ###");
        System.out.println("--------------------------");
        GajiPegawai pegawai = new GajiPegawai();
        pegawai.setNama("Rizki Adam Kurniawan");
        pegawai.setAlamat("Jalan semar dlm 4 no 72/66");
        pegawai.setUangTransport(25000);
        pegawai.setUangTunjangan(30000);
        pegawai.setGajiPokok(45000);
        pegawai.setTotalGaji(pegawai.getTotalGaji());
        pegawai.tampilData(pegawai.getNama(), pegawai.getAlamat(), pegawai.getUangTunjangan(),
                pegawai.getUangTransport(), pegawai.getGajiPokok(), pegawai.getTotalGaji());
    }
    
}
