package pertemuan3;

public class Dog {
    String name;
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        
        dog1.bark();
        dog1.name = "chiko";
        Dog anjing[] = new Dog[3];
        anjing[0] = new Dog();
        anjing[1] = new Dog();
        anjing[2] = dog1;

        anjing[0].name = "Dalma";
        anjing[1].name = "Doggy";

        System.out.println("nama anjing terakhir");
        namaTerakhir(anjing);

        int x=0;
        while(x<anjing.length){
            anjing[x].bark();
            x++;
        }

    }
    public void bark(){
        System.out.println(name + " bersuara GUK GUK !!!!!!");
    }
    public static void namaTerakhir(Dog[] dog){
        System.out.println(dog[dog.length-1].name);
    }
}
