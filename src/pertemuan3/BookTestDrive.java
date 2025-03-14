package pertemuan3;

public class BookTestDrive {
    public static void main(String[] args) {
        Book[] myBook = new Book[3];
        for (int i = 0; i < myBook.length; i++) {
            myBook[i] = new Book();
        }
        myBook[0].title = "melawan kemustahilan";
        myBook[1].title = "Muhammad Al fatih 1453";
        myBook[2].title = "awe-inspiring me";
        myBook[0].author = "Dewa Eka Prayoga";
        myBook[1].author = "Felix Siaw";
        myBook[2].author = "Dewi Nur Aisyah";
        int x =0;
        while (x<myBook.length) {
            System.out.print(myBook[x].title);
            System.out.print(" karya : ");
            System.out.println(myBook[x].author);
            x++;
        }
    }
}
