package org.example.pres;

import org.example.dao.IDao;
import org.example.metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("config.txt"));
        String daoClassName = scanner.nextLine();

        Class cDao = Class.forName(daoClassName);
        IDao dao = (IDao) cDao.newInstance();
        System.out.println(dao.getData());

        String metierClassName = scanner.nextLine();
        Class cMaetier = Class.forName(metierClassName);
        IMetier metier = (IMetier) cMaetier.newInstance();

        Method method = cMaetier.getMethod("setDao", IDao.class);
        // metier.setDao(dao)
        method.invoke(metier, dao);
        System.out.println("Result "+metier.calcul());
    }
}
