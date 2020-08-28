package com.company;

import com.sun.security.jgss.GSSUtil;

public class Main {

    public static void main(String[] args) {


        Member m = new Member("Daniel", "1701952495", false);
        System.out.println(m);
        m.getMemberType();
        System.out.println(m.getMemberType());

        Administration a = new Administration("jakob", "37483728");
        System.out.println(a);

        Instructor I = new Instructor("hans", "748273827",20,456);
        System.out.println(I);
    }
}
