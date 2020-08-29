package com.company;

import com.sun.security.jgss.GSSUtil;

public class Main {

    public static void main(String[] args) {


        Member m = new Member("Daniel", "1701952495", false);
        System.out.println(m);
        m.getMemberType();
        m.monthlyFee();
        System.out.println(m.getMemberType());
        System.out.println("Monthly fee for membership is: " + m.monthlyFee());

        Administration a = new Administration("jakob", "37483728");
        System.out.println(a);

        Instructor i = new Instructor("hans", "748273827",20,456);
        System.out.println(i);

        Menu.menuMedarbejder();


    }
}
