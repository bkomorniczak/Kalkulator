package com.calc;


public class Calculator {


    public int add(int a, int b){ return a+b; }

    public int sub(int a, int b){
        return a-b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.add(4,5);
        calculator.sub(5,3);
    }
}