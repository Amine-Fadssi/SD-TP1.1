package org.example.ext;

import org.example.dao.IDao;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("dao2")
@Primary
public class DaoImpl2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version Capteurs");
        double tmp = 100;
        return tmp;
    }
}
