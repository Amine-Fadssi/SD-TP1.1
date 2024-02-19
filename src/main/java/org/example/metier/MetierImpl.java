package org.example.metier;

import org.example.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class MetierImpl implements IMetier {

    private IDao dao;


    public MetierImpl(@Qualifier("dao2") IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double tmp = dao.getData();
        double res = tmp*20/Math.cos(Math.PI*5);
        return res;
    }
    /*
    * injected dans la variable dao un objet
    * d'une classe qui implement interface IDao
    * */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
