package raya;

public class Konsultasi {
    private String idKonsultasi;
    private Pasien pasien;
    private Dokter dokter;
    private String keluhan;
    private String status = "dalam proses";
    private static int counter;
    public Konsultasi( Pasien pasien, Dokter dokter, String keluhan){
        this.idKonsultasi ="K - "+String.format("%03d", counter++);
        this.pasien = pasien;
        this.dokter = dokter;
        this.keluhan = keluhan;
    }
    public void setStatusToUdah() {
        this.status = "selesai";
    }
    public void tampilkanInfo(){
        System.out.println("ID konsultasi   : "+ idKonsultasi);
        System.out.println("pasien          : "+ pasien.getName());
        System.out.println("dokter          : " + dokter.getName());
        System.out.println("keluhan         : " + keluhan);
        System.out.println("status          : " + status);
    }
}
