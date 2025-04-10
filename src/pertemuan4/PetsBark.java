package pertemuan4;

public class PetsBark {
    public static void main(String[] args) {
        GoodDog[] anjing= new GoodDog[10];
        for (int i = 0; i < anjing.length; i++) {
            int rand =(int) (Math.random() * 100);
            anjing[i] = new GoodDog();
            anjing[i].setSize(rand);
            anjing[i].bark();
        }
        
    }
}
