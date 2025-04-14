package pertemuan6;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
            new Hippo(),
            new Cat(),
            new Dog(),
            new Lion(),
            new Tiger(),
            new Wolf()
        };
        for (int i =0; i < animals.length; i++) {
            animals[i].makeNoise();
            animals[i].eat();
            animals[i].roam();
            System.out.println("--------------");
        }
        
    }

}