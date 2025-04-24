package sinau;

public class Manusia {
    private String nama;
    private String alamat;
    private int umur;
    private String pekerjaan;
    private String rahasia;

    public Manusia(String nama, String alamat, int umur, String pekerjaan) {
        this.nama = nama;
        this.alamat = alamat;
        this.umur = umur;
        this.pekerjaan = pekerjaan;
    }
    public String getNama() {
        return nama;
    }
    public String getAlamat() {
        return alamat;
    }
    public int getUmur() {
        return umur;
    }
    public void setRahasia(String rahasia) {
        this.rahasia = rahasia;
    }
    public String getPekerjaan() {
        return pekerjaan;}
    public void setNama(String nama) {
        this.nama = nama;
    }
}
