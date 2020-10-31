public class HealthyBurger extends Hamburger {
    private int[] adds;

    public HealthyBurger(String name, double price){
        super(name, "No meat", price, "Brown wheat");
        adds = new int[6];
        for(int i=0;i<6;i++)adds[i]=0;
    }


}