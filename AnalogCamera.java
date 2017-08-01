public class AnalogCamera implements Printable{

  private String model;
  private String noise;
  private String resolution;

  public AnalogCamera(String model, String noise, String resolution){
    this.model = model;
    this.noise = noise;
    this.resolution = resolution;
  }

  public String printDetails(){
    return this.model + ", " + this.noise + ", " + this.resolution;
  }
}