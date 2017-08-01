import static org.junit.Assert.*;
import org.junit.*;

public class PhotographerTest{

private Photographer photographer;
private DigitalCamera dcamera;
private AnalogCamera acamera;

  @Before
  public void before(){
    photographer = new Photographer();
    dcamera = new DigitalCamera("Nikon 34T", "Noise reduction filter","Hi-resolution");
    acamera = new AnalogCamera("Sony ILCE5100L", "No noise reduction", "Lo-resolution");
  }

  @Test
  public void testCanCountCameras(){
    assertEquals(0, photographer.countCameras());
  }
  @Test
  public void testCanAddCamera(){
    photographer.addCamera(dcamera);
    assertEquals(1, photographer.countCameras());
  }
  @Test
  public void testCanRemoveCamera(){
    photographer.addCamera(acamera);
    photographer.removeCamera();
    assertEquals(0, photographer.countCameras());
  }
  @Test
  public void testCanPrintAllCameras(){
    photographer.addCamera(dcamera);
    photographer.addCamera(acamera);
    assertEquals("", photographer.printAllCameras());
  }
}
