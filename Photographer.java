import java.util.*;

public class Photographer{
  private ArrayList<Printable> cameras;
  private HashMap<String, Integer> journal;

  public Photographer(){
    this.cameras = new ArrayList<Printable>();
    this.journal = new HashMap<String, Integer>();
  }

  public int countCameras(){
    return this.cameras.size();
  }

  public int countJournal(){
    return this.journal.size();
  }

  public void addCamera(Printable camera){
    this.cameras.add(camera);
  }

  public void addJournal(String day, Integer photos){
    this.journal.put(day, photos);
  }

  public void removeCamera(){
    this.cameras.remove(0);
  }

  public String printAllCameras(){
    String allCameras = "";
    Integer count = 1;
    for(Printable camera: this.cameras){
      String cameraDetails = camera.printDetails();
      allCameras = allCameras + String.valueOf(count) + ". " + cameraDetails + " ";
      count++;
    }
    return allCameras;
  }

  public Integer numberOfPhotos(){
    Integer photoCount = 0;
    for(Integer number: this.journal.values()){
      photoCount = photoCount + number;
    }
    return photoCount;
  }



}