package com.harman.AssessmentThreading;

import java.util.Scanner;

class Cosine extends Thread{
    int x;

    public Cosine(int x) {
        this.x = x;
    }

    @Override
    public void run() {
        try {
            System.out.println("Cosine value for given number: "+Math.cos(x));
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
class Tan extends Thread{
    int x;

    public Tan(int x) {
        this.x = x;
    }

    @Override
    public void run() {
        try{
            System.out.println("Tan value for given number: "+Math.tan(x));
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
class Sine extends Thread{
    int x;

    public Sine(int x) {
        this.x = x;
    }

    @Override
    public void run() {
        try {
            System.out.println("Sine value for given number: "+Math.sin(x));
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
public class TrignometricOperation {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a;
        System.out.println("enter the value: ");
        a= input.nextInt();
        Cosine cosobj=new Cosine(a);
        Tan tanobj=new Tan(a);
        Sine sineobj=new Sine(a);
        cosobj.start();
        tanobj.start();
        sineobj.start();
    }
}
