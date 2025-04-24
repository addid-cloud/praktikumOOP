package raya;

public class KlinikApp {
    public static void main(String[] args) {
        Dokter dokter[] = {new Dokter("082139376950", "Muhammad Alif Mujaddid", "ibu hamil"), new Dokter("052057093", "emma stone", "gigi")};
        Pasien pasien[] = {new Pasien("0948134963", "addid", "malang"),new Pasien("082394764389","adudu","malang")};
        Konsultasi konsul[] ={ new Konsultasi(pasien[0], dokter[0], "sakit perut"), new Konsultasi(pasien[1], dokter[1], "sakit gigi")};

        System.out.println("\n === info dokter === \n");
        for (int i = 0; i < dokter.length; i++) {
            dokter[i].tampilkanInfoDokter();
            System.out.println();
        }
        System.out.println("\n === info pasien === \n");
        for (int i = 0; i < pasien.length; i++) {
            pasien[i].tampilkanInfoPasien();
            System.out.println();
        }
        System.out.println("\n === info konsultasi === \n");
        for (int i = 0; i < konsul.length; i++) {
            konsul[i].tampilkanInfo();
            System.out.println();
        }

    }
}
