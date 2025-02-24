package com.example.Main;

import com.example.Metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class App {
    public static void main(String[] args) {

        //ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


       // IMetier metier = (IMetier) context.getBean("metier");
        // Charger le contexte Spring avec les annotations
        ApplicationContext context = new AnnotationConfigApplicationContext("com.example");

        // Obtenir le bean Metier
        IMetier metier = context.getBean(IMetier.class);

        System.out.println(metier.calcul());
    }
}