package com.example.Dao;
import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao {
    @Override
    public String getDate() {
        return "2025-02-24";
    }
}