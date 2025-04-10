package pertemuan4;

public class DogTestDrive {
    // ini buat menjalankan program dog tadi
    // ini adalah class DogTestDrive yang berfungsi untuk menguji class Dog
    // bisa diliat sizw yang di set di class DogTestDrive ini tidak ada kontrol dari class Dog
    // jadi bisa di set sembarangan
    // langsung pake dog.size = 70; gitu
    public static void main(String[] args) {
        Dog one = new Dog();
        one.size = 70;
        Dog two = new Dog();
        two.size = 8;
        Dog three = new Dog();
        three.size = 35;
        one.bark();
        two.bark();
        three.bark();
        
    }
}
