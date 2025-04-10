package pertemuan3.fakeKNN;

public class tes {
        int counter = 0;
    
        public static void main(String[] args) {
            int count = 0;
            tes[] m4a = new tes[20];
            int x = 0;
    
            while (x < 19) { // Sesuai dengan pilihan pertama x < 9
                m4a[x] = new tes();
                m4a[x].counter = m4a[x].counter + 1;
                count = count + 1;
                count = count + m4a[x].maybeNew(x);
                x = x + 1;
            }
    
            System.out.println(count + " " + m4a[1].counter);
        }
    
        public int maybeNew(int index) {
            if (index < 1) { // Sesuai dengan pilihan pertama index < 5
                tes m4 = new tes();
                m4.counter = m4.counter + 1;
                return 1;
            }
            return 0;
        }
    }
