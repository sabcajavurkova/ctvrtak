import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GrafTest {

    @Test
    void prazdnyGraf() {
        var g = new Graf();
        assertNotNull(g);
    }

    @Test
    void jedenVrchol() {
        var g = new Graf();
        var v1 = g.dejVrchol("v1");
        assertNotNull(g);
        assertNotNull(v1);
    }

    @Test
    void jednaHrana() {
        var g = new Graf();
        var v1 = g.dejVrchol("v1");
        var v2 = g.dejVrchol("v2");
        v1.pridejSouseda(v2);
        assertTrue(v1.jeSousedem(v2));
    }

    @Test
    void caryMary() {
        var gV = new Graf();
        var A = gV.dejVrchol("A");
        var B = gV.dejVrchol("B");
        var C = gV.dejVrchol("C");

        B.pridejSouseda(A);
        B.pridejSouseda(C);

        assertTrue(B.jeSousedem(A));
        assertTrue(B.jeSousedem(C));
        assertFalse(C.jeSousedem(A));
    }
}
