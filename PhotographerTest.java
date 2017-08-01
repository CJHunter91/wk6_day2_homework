import org.junit.*;
import static org.junit.Assert.*;

public class PhotographerTest{

  @Before
  public void before(){
    Photographer photographer = new Photographer();
  }

  @Test
  public void testCanCountCameras(){
    assertEquals(0, photographer.countCameras);
  }
  // @Test
  // public void testCanAddCamera(){
  //   photographer.add("Camera");
  //   assertEquals(1, photographer.countCameras);
  // }
}
