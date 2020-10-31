public class Addition {
  private String name;
  private double price;
  
  private Addition (String name, double price){
    this.name = name;
    this.price = price;
  }
  
  public static Addition newAddition(String name, double price){
    return new Addition(name, price);
  }
  
  public String getName(){
    return this.name;
  }
  
  public double getPrice(){
    return this.price;
  }
  
  public String toString(){
    String tmp = "";
    tmp += String.format("%s : €%.2f%n", this.name, this.price);
  return tmp;
    
  }
}