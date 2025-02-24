package com.example.Main;

import com.example.Metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


        IMetier metier = (IMetier) context.getBean("metier");


        System.out.println(metier.calcul());
    }
}