package peretemuan2.ContohObjClass;

public class Item {
    public String name;
    public String Effect;

    public void use(Player target){
        System.out.println(target.name + " menggunakan " + name);
        System.out.println(Effect);
    }
}
