import java.util.*;

public class Photographer{
  private ArrayList<Printable> cameras;

  public Photographer(){
    this.cameras = new ArrayList<Printable>();
  }

  public int countCameras(){
    return this.cameras.size();
  }

  public void addCamera(Printable camera){
    this.cameras.add(camera);
  }

  public void removeCamera(){
    this.cameras.remove(0);
  }

  public String printAllCameras(){
    String allCameras;

  }



}