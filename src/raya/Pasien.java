package raya;

public class Pasien extends Pengguna {
    private String  nomorRekamMedis;
    private String alamat;
    private static int counter;

    Pasien(String noHp, String name, String alamat){
        super(noHp,name);
        this.alamat = alamat;
        this.nomorRekamMedis = "RM - " + String.format("%03d", counter++);
    }

    public void tampilkanInfoPasien(){
        System.out.println("nama    :" + getName());
        System.out.println("no hp   :" + getNoHp());
        System.out.println("no rm   :"+ nomorRekamMedis);
        System.out.println("alamat  :"+ alamat);
    }
}
