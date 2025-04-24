package raya;
public class  Pengguna {
    private String noHp;
    private String name;
    private String id;
    private static int counter =0;
    // ini konstruktor buat ngisi class pengguna
    Pengguna(String noHp, String name){
        this.noHp = noHp;
        this.name = name;
        this.id = "pg - " +String.format("%03d", counter++);
    }
    public String getName(){
        return name;
    }
    public String getNoHp(){
        return noHp;
    }
}
