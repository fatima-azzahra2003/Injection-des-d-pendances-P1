package com.example.Metier;
import com.example.Dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier {
    @Autowired
    private IDao dao;

    @Override
    public String calcul() {
        return "Date reçue du DAO : " + dao.getDate();
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}