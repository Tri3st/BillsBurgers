public class HealthyBurger extends Hamburger {
    private int[] adds;

    public HealthyBurger(String name, double price){
        super(name, "No meat", price, "Brown wheat");
        adds = new int[6];
        for(int i=0;i<6;i++)adds[i]=0;
    }

    @Override
    public void addAddition(int index){
        int cnt = 0;
        for (int i = 0; i<adds.length;i++) if (adds[i]!=0) cnt++;
        if(cnt == 6) System.out.println("max nr of additions already");
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
        double totalPrice = 0.0;
        String tmp = "";
        tmp += "== " + super.getName() + " ==  \n";
        tmp += super.getBreadRollType() + " roll.\n";
        tmp += ".. no meat ..\n";
        tmp += "-----------------------------------------\n";
        for (int i=0; i<adds.length;i++){
            tmp+= Hamburger.additions[adds[i]];
            if (adds[i] != 0)
            totalPrice += Hamburger.additions[adds[i]].getPrice();
        }
        tmp += "-----------------------------------------\n";
        totalPrice += super.getPrice();
        tmp += "total price : " + totalPrice;
        return tmp;
    }

}