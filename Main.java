class Main {
  public static void main(String[] args) {
    Hamburger classic = new Hamburger("El Classico","Saussage", 6.32 , "white bun");
    classic.addAddition(1);
    classic.addAddition(2);
    classic.addAddition(3);
    classic.addAddition(4);
    System.out.println(classic);
    HealthyBurger healthy1 = new HealthyBurger("Grande healthy", 8.90 );
    healthy1.addAddition(1);
    healthy1.addAddition(2);
    healthy1.addAddition(5);
    healthy1.addAddition(6);
    healthy1.addAddition(8);
    healthy1.addAddition(10);
    System.out.println(healthy1);
    //System.out.println("Hello world!");
  }
}