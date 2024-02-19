package org.example.dao;

public class DaoImpl implements IDao {
    @Override
    public double getData() {
        /*
        * Se connecter à la BD pour recuperer la temperature
        * */
        System.out.println("Version BD");
        double tmp = Math.random()*40;
        return tmp;
    }
}
