package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        short s1 = -5;
        double d1 = -31.9;
        System.out.println("Before change d1: "+ d1);
        boolean b;
        long  I;
        I = (long)d1;
        d1 = random.nextInt(100)-100;
        b =false;
        var d2 = ((Math.tan(I)+Math.tan(s1))/(I-s1))+(Math.pow(I,2)-Math.pow(s1,2)/(Math.pow(I,3)+2*I*s1+3));
        System.out.println("After change d1: "+ d1);
        System.out.println("b result: "+ b);
        System.out.println("d2 result: "+ d2);


    }
}
