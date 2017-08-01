import static org.junit.Assert.*;
import org.junit.*;

public class PhotographerTest{

Photographer photographer;
  @Before
  public void before(){
    photographer = new Photographer();
  }

  @Test
  public void testCanCountCameras(){
    assertEquals(0, photographer.countCameras());
  }
  @Test
  public void testCanAddCamera(){
    photographer.addCamera("Camera");
    assertEquals(1, photographer.countCameras());
  }
}
