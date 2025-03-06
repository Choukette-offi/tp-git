import org.junit.*;
public class TestsBoxes {
    @Test
        public void testBoxCreate() {
    Box b = new Box();
}
/** on veut pouvoir mettre des trucs dedans */
    @Test
    public void testBoxAdd(){
        Box b = new Box();
        b.add(new Thing("truc1"));
        b.add(new Thing("truc2"));
    }
}