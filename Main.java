class Main {
  public static void main(String[] args) {
    Hamburger classic = new Hamburger("El Classico","Saussage", 6.32 , "white bun");
    classic.addAddition(1);
    classic.addAddition(2);
    classic.addAddition(3);
    classic.addAddition(4);
    System.out.println(classic);
    //System.out.println("Hello world!");
  }
}