package shop.dao.model;

public class Smartphone  extends Computer{
    private  int imei;


    public Smartphone(long id, String cpu, int ram, int ssd, String brand, int price, int imei,boolean discounted,double discountAmount) {
        super(id, cpu, ram, ssd, brand, price,discounted,discountAmount);
    }


    public int getImei() {
        return imei;
    }

    public void setImei(int imei) {
        this.imei = imei;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "imei=" + imei +
                "} " + super.toString();
    }
}
