package pertemuan3.fakeKNN;

public class Fruits {
    private double crunchy;
    private double sweetnest;
    private String name;
    // ini konstruktor buat meng init biar dia 
    Fruits(double crunchy, double sweetnest, String name){
        this.crunchy = crunchy;
        this.sweetnest = sweetnest;
        this.name = name;
    }
    //ini kita buat calculate distance dari buah yang tidak diketahui ke node / buah yang ada di dataset
    // aku di sini menggunakan euclidian distance karena menurut saya lebih simpel menggunakan euclidian daripada yang lain
    public double calculateDistance(Fruits other){
        double hasil;
        double difCrunchy = this.crunchy - other.crunchy;
        double difSweetnest = this.sweetnest - other.sweetnest;
        hasil =Math.sqrt(difCrunchy*difCrunchy + difSweetnest*difSweetnest); 
        return hasil;
    }
    public void setCrunchy(double crunchy) {
        this.crunchy = crunchy;
    }
    public void setSweetnest(double sweetnest) {
        this.sweetnest = sweetnest;
    }
    public String getName() {
        return name;
    }

}
