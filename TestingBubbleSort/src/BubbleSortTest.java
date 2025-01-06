import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class BubbleSortTest {

    @Test
    void getArr() {
    }

    @Test
    void setrid() {
        int[] vstup = {1,0,2,-1,6,3};
        int[] vystup = {-1,0,1,2,3,6};

        BubbleSort b = new BubbleSort(vstup);
        b.setrid();

        //assertTrue(b.getArr()[0]==1 && b.getArr()[1]==0);
        assertArrayEquals(vystup, b.getArr());
    }

    @Test
    void prohod() {
        int[] vstup = {0,1,2};
        int[] vystup = {1,0,2};

        BubbleSort b = new BubbleSort(vstup);
        b.prohod(0,1);

        //assertTrue(b.getArr()[0]==1 && b.getArr()[1]==0);
        assertArrayEquals(vystup, b.getArr());
    }
}