package pertemuan4;
public class GoodDog  {
    // ini tuh class yang isinya ada enkapsulasi
    // jadi kita bisa mengontrol akses ke variabel size dan name dari dalam pake get sama set
    // kelebihanya ga bisa diakses dari luar secara langsung
    private int size;
    public int getSize(){
        return size;
    }
    public void setSize(int s){
        this.size = s;
    }
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
