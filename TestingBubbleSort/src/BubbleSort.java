import java.util.Arrays;

// testy = Go to, Test..
public class BubbleSort {
    private int arr[];

    // konstruktor
    public BubbleSort(int[] arr) {
        this.arr = arr;
    }

    // vrati setridene pole
    public int[] getArr() {
        return arr;
    }

    // setridi pole arr
    public void setrid() {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if(arr[i-1]>arr[j]) {
                    prohod(i-1, j);
                }
            }
        }
    }

    // prohoid prvek i a j z pole arr
    protected void prohod(int i, int j) {
        int x = arr[j];
        arr[j]= arr[i];
        arr[i] = x;
    }
}
