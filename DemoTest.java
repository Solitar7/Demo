import static org.junit.Assert.*;
import org.junit.*;

public class DemoTest {
    
    @Test
    public void addTest(){
        assertEquals(3, Demo.addup(1,1));
    }
}
