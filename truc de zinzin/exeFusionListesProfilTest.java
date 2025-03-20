import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

public class exeFusionListesProfilTest {
    @Test
    public void testFusion() {
        char[] l1 = {'A'};
        char[] l2 = {'A', 'A','B'};
        char[] attendu = {'A', 'A', 'A', 'B'};
        assertArrayEquals(attendu, exeFusionListesProfil.fusion(l1,l2));
    }

    @Test
    public void testFusion1() {
        char[] l1 = {};
        char[] l2 = {'A', 'A','B'};
        char[] attendu = {'A', 'A', 'B'};
        assertArrayEquals(attendu, exeFusionListesProfil.fusion(l1,l2));
    }

    @Test
    public void testFusion2() {
        char[] l1 = {'C', 'D'};
        char[] l2 = {'A', 'B','B'};
        char[] attendu = {'A', 'B', 'B', 'C', 'D'};
        assertArrayEquals(attendu, exeFusionListesProfil.fusion(l1,l2));
    }
}
