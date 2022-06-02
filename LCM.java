package com.test;

public class LCM {

    public static int getLCM(int number1, int number2){

        int remainder;
        int n1=number1;
        int n2=number2;
        int lcm,gcd;

        while(n2!=0){
            remainder=n1%n2;
            n1=n2;
            n2=remainder;
        }
       gcd=n1;
       lcm=(number1*number2)/gcd;
       return lcm;
    }

    public static void main(String[] args) {
        System.out.println(getLCM(60,24));
    }
}
