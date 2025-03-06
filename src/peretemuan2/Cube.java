package peretemuan2;

public class Cube {
    int panjang = 2;
    int lebar =3;
    int tinggi = 4;
    public static void main(String[] args) {
        Cube kubus = new Cube();
        Cube kubus2 = new Cube();
        System.out.println(kubus.panjang * kubus.lebar * kubus.tinggi);
        kubus2.panjang = 10;
        kubus2.lebar = 20;
        kubus2.tinggi = 5;
        System.out.println(kubus2.panjang * kubus2.lebar * kubus2.tinggi);
    }
}
