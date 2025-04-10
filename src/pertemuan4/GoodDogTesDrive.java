package pertemuan4;
public class GoodDogTesDrive {
    //ini buat ngetes gooddog
    //cara ngubah atributtnya pake setter dan getter
    // jadi ga bisa sembarangan diubah dari luar class / langsung
    public static void main(String[] args) {
        GoodDog one = new GoodDog();
        one.setSize(70);
        GoodDog two = new GoodDog();
        two.setSize(8);
        System.out.println("dog pertama : " + one.getSize());
        System.out.println("dog kedua : " + two.getSize());
        one.bark();
        two.bark();
    }
}
