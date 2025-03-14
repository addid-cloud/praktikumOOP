package tes;

public class Search {
    //buat array[] dan yang akan dicari
    //buat method search
    //buat variable l,r,mid
    //buat loop pertama untuk mengakses array[]
    //buat if ntuk mengecek apakah array[mid] == x
    // buat if untuk membandingkan apakah si array[mid] lebih kecil dari x
    // jika iya maka l = mid + 1
    // jika tidak maka r = mid - 1
    // jika tidak ada return -1
    public void binarySearch(int[] arr, int key){
        int l,r,mid;
        l=0;
        r = arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            mid = r+l/2;
            if(arr[mid] == key){
                System.out.println("key ketemu di index - " + mid);
            }
            if(arr[mid]< key){
                l = mid+1;
            }else{
                r =  mid-1;
            }
        }
    }
    public static void main(String[] args) {
        
    }
}
