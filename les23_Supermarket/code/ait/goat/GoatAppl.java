package ait.goat;

import ait.goat.model.Goat;

public class GoatAppl {
    public static void main(String[] args) {
        Goat goatling = new Goat();
        for (int i = 0; i < 10; i++) {
            goatling.increment();
        }
        System.out.println(goatling.getCount());

        Goat goatling2 = new Goat();
        for (int i = 0; i < 10; i++) {
            goatling2.increment();
        }
        System.out.println(goatling2.getCount());
        System.out.println(goatling.getCount());


       // Goat goatling3 = new Goat();
        //for (int i = 0; i < 10; i++) {
          //  goatling3.count++;
        //}
       // System.out.println(goatling3.count);
        //System.out.println(goatling2.count);
        //System.out.println(goatling.count);

    }

}


