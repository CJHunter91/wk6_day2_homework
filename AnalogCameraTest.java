import static org.junit.Assert.*;
import org.junit.*;

public class AnalogCameraTest{

  AnalogCamera acamera;

  @Before
  public void before(){
    acamera = new AnalogCamera("Sony ILCE5100L", "No noise reduction", "Lo-resolution");
  }

  @Test
  public void testCanPrintDetails(){
    assertEquals("Sony ILCE5100L, No noise reduction, Lo-resolution", acamera.printDetails());
  }
}