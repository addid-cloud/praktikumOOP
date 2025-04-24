package raya;

public class Dokter extends Pengguna {
    private  String nip;
    private String spesialisasi;
    private static int counter;

    Dokter(String noHp, String name, String spesialisasi){
        super(noHp, name);
        this.nip = "NIP - " + String.format("%03d", ++counter);
        this.spesialisasi = spesialisasi;
    }
    public void tampilkanInfoDokter(){
        System.out.println("nama    :" + getName());
        System.out.println("no hp   :" + getNoHp());
        System.out.println("no rm   :"+ nip);
        System.out.println("alamat  :"+ spesialisasi);
    }
}
