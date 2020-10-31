public class Hamburger {
  private String name;
  private String meat;
  private double price;
  private String breadRollType;
  private int[] adds;
  private static final Addition[] additions  = {
    Addition.newAddition("none",0.0),
    Addition.newAddition("lettuce", 0.27),
    Addition.newAddition("tomato", 0.21),
    Addition.newAddition("gurkin",0.17),
    Addition.newAddition("egg",0.43),
    Addition.newAddition("onion", 0.26),
    Addition.newAddition("carrot", 0.22),
    Addition.newAddition("baked egg", 0.56),
    Addition.newAddition("sateh", 0.93),
    Addition.newAddition("pineapple", 0.49),
    Addition.newAddition("jalapeño", 0.62)
  };

  public Hamburger (String name, String meat, double price, String breadRollType){
    this.name = name;
    this.meat = meat;
    this.price = price;
    this.breadRollType = breadRollType;
    
    this.adds = new int[4];
    for(int i=0;i<4;i++)adds[i]=0;
  }
  
  public String getName(){
    return this.name;
  }
  
  public String getMeat(){
    return this.meat;
  }
  
  public double getPrice(){
    return this.price;
  }
  
  public String getBreadRollType(){
    return this.breadRollType;
  }
  
  public void addAddition(int index){
    int cnt = 0;
    for (int i = 0; i<adds.length;i++) if (adds[i]!=0) cnt++; 
    if(cnt == 4) System.out.println("max nr of additions already");
    else {
      for(int j=0;j<adds.length;j++){
      if (adds[j]==0){
      adds[j]= index;
      break;
      }
      }
    }
  }
    
  @Override
  public String toString(){
      String tmp = "";
      tmp += "== " + this.name + " ==  \n";
      tmp += this.meat + " on a ";
      tmp += this.breadRollType + " roll.\n";
      tmp += "-----------------------------------------\n";
      for (int i=0; i<adds.length;i++){
          tmp+= additions[adds[i]];
      }
      return tmp;
    }
  }