package org.example.ext;

import org.example.dao.IDao;

public class DaoImplWS implements IDao {
    @Override
    public double getData() {
        System.out.println("Version Web Service");
        double tmp = 12.3;
        return tmp;
    }
}
