package practice.bevegage;


    public class Beer extends Beverage{
        // поле
        private String type; // вид пива  cорт

        public Beer() {
        }

        // конструктор
        public Beer(String title, String packing, int quantity, String type) {
            super(title, packing, quantity);
            this.type=type;


            // пустой конструктор

        }
        public  void toBuy(String title, String packing, int quantity, String type){
            super.toBuy(title,packing,quantity);
            this.type=type;

        }

        public  void displayStock(){
            super.displayStock();
            System.out.println("This is " + type + " Type of bear");

        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }
