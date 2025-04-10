package pertemuan3.fakeKNN;

public class Main {
    public static void main(String[] args) {
        // traning set
        // buat traning data biar si knn tau mana yang jeruk dan apple
        // kriteria data = apple crunchy > sweetnest, orange sweetnest > crunchy
        Fruits[] fruits={
            new Apple(7.2, 3),
            new Apple(8.2, 5),
            new Apple(8.0, 4),
            new Apple(6.5, 3.4),
            new Apple(9.2, 3.8),
            new Apple(7.2, 3.9),
            new Orange(3.2, 8.9),
            new Orange(2.2, 7.9),
            new Orange(3.8, 6.7),
            new Orange(4.5, 9.4),
            new Orange(3.2, 7.5),
            new Orange(4.2, 8.5),
        };
        // testing set
        // buat ngetes accuracy dari knn untuk menebak, data yang ini bersifat true semua
        Fruits[] fruitTrue ={
            new Apple(8.2, 3.0),
            new Apple(7.2, 4.0),
            new Apple(7.5, 4.2),
            new Orange(3.2, 6.7),
            new Orange(2.8, 7.7),
            new Orange(2.2, 8.7),
            new Orange(3.2, 7.7),
        };
        // nahh yang ini buat ngetes knn nya tau ga dia buah apa
        Fruits[] fruitUnkwon={
            new Fruits(8.2, 3.0,"unknown"),
            new Fruits(7.2, 4.0,"unknown"),
            new Fruits(7.5, 4.2,"unknown"),
            new Fruits(3.2, 6.7,"unknown"),
            new Fruits(2.8, 7.7,"unknown"),
            new Fruits(2.2, 8.7,"unknown"),
            new Fruits(3.2, 7.7,"unknown"),
        };
        //call method accuracy
        accuracy(fruits, fruitUnkwon, fruitTrue);
        //coba kasih inputan dah nanti knn bakal nebak itu apaan
        choseFruit(fruits, 3.0, 5.0);

    }

    //ini buat ngitung accuracy dari knn 
    // cara kerjanya itu dari dataset testing kita cocokan dengan unknown dataset nanti diitung berapa yang bener trs bagi dengan panjangnya dikali dah sama 100
    public static double accuracy(Fruits[] fruits, Fruits[] fruitUnkwon, Fruits[] fruitTrue){
        Fruits closestF1[] = new Fruits[fruits.length-1];
        for (int i = 0; i < fruitUnkwon.length; i++) {
            double minD =10; // ini nilai awal 10 karena batas maks buat krunch sama sweet itu 10
            for (Fruits fruit : fruits) {
                double distance = fruitUnkwon[i].calculateDistance(fruit);
                if(distance<minD){
                    minD = distance;
                    closestF1[i] = fruit;
                }
            }
        }
        int corCount = 0;
        int tot = fruitTrue.length;
        for (int i = 0; i < fruitUnkwon.length; i++) {
            if(fruitTrue[i].getClass().equals(closestF1[i].getClass())){
                corCount++;
            }
        }
        double accur =( (double) corCount/tot )*100;
        System.out.println("accuracy : " + accur + " % ");
        return accur;
    }


    // method ini buat nentuin buah apa yang akan ditampilin jika crunch sama sweetnya diketahui
    public static void choseFruit(Fruits[] fruits, double inputC, double inputS){
        Fruits unknown = new Fruits(inputC, inputS, "unknown");
        Fruits fruitU = null;
        double minD = 10;
        for (Fruits fruit : fruits) {
            double distance = unknown.calculateDistance(fruit);
            if(distance < minD){
                minD = distance;
                fruitU = fruit;
            }
        }
        System.out.println(fruitU.getName());
    }
}
