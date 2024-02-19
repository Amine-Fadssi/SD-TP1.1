package org.example.pres;

import org.example.dao.DaoImpl;
import org.example.ext.DaoImpl2;
import org.example.metier.MetierImpl;

public class Presenatation {
    public static void main(String[] args) {
        /*
        * injection de dependances par
        * instanciation statique => new
        * */
        DaoImpl2 dao = new DaoImpl2();
        //MetierImpl metier = new MetierImpl();
        MetierImpl metier = new MetierImpl(dao);
        metier.setDao(dao);
        System.out.println("Result : "+metier.calcul());
    }
}
