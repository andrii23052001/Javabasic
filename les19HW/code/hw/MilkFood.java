package hw;

public class MilkFood extends  Food {

    String milkType;

    private double fat;

    public MilkFood(String name, long barCode, double price, String expDate, String milkType, double fat) {
        super(name, barCode, price, expDate);
        this.milkType = milkType;
        this.fat = fat;
    }

    @Override


    public String toString() {
         return
                 "Milk Food" + "{" +
                         " name : " + name + " Bar Code :" +barCode+
                         " Price "+price+
                         " expDate :" + expDate +
        " milkType :'" + milkType + '\'' +
                          ", fat=" + fat +'}';

    }
    public void display (){
        super.display();
        System.out.println(" milkType " + milkType);
    }
}
