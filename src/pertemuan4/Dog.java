package pertemuan4;
// class ini adalah class Dog yang tidak memiliki enkapsulasi
// jadi semua orang bisa mengakses variabel size dan name secara langsung
// dan bisa mengubah nilainya tanpa ada kontrol dari class Dog
public class Dog {
    String name;
    int size;
    void bark(){
        if(size  > 60){
            System.out.println("Woff! Woff! Woff!");
        }else if(size > 40){
            System.out.println("Ruff! Ruff!");
        }else{
            System.out.println("kang! kang!");
        }
    }
}
