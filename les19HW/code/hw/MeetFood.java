package hw;

public class MeetFood extends Food {

    private String meatType;

    public MeetFood(String name, long barCode, double price, String expDate, String meatType) {
        super(name, barCode, price, expDate);
        this.meatType = meatType;
    }

    @Override
    public String toString() {
         return "Meat Food" + "{" +
                 " name : " + name + " Bar Code :" +barCode+
                 " Price "+price+
                 " expDate :" + expDate +
                " meatType :'" + meatType + '\'' +
                '}';


    }

    public void display (){
        super.display();
        System.out.println(" meatType " + meatType);
    }
}
