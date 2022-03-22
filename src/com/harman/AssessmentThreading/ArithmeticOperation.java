package com.harman.AssessmentThreading;

import java.util.Scanner;

class AddNumber extends Thread{
    int a,b;

    public AddNumber(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        try{
            System.out.println("Addition");
            System.out.println(a+b);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
class SubNumber extends Thread{
    int a,b;

    public SubNumber(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        try{
            System.out.println("subtraction");
            System.out.println(a-b);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
class Division extends Thread{
    int a,b;

    public Division(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        try {
            System.out.println("Division");
            System.out.println(a/b);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
class Multiplication extends Thread{
    int a,b;

    public Multiplication(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        try{
            System.out.println("Multiplication");
            System.out.println(a*b);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
public class ArithmeticOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x,y;
        System.out.println("Enter the 1st Number: ");
        x=input.nextInt();
        System.out.println("Enter the 2nd Number: ");
        y=input.nextInt();
        AddNumber addobj=new AddNumber(x,y);
        SubNumber subobj=new SubNumber(x,y);
        Division divobj=new Division(x,y);
        Multiplication mulobj=new Multiplication(x,y);
        addobj.start();
        subobj.start();
        divobj.start();
        mulobj.start();
    }
}
