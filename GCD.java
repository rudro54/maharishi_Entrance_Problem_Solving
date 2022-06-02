package com.test;

public class GCD {
     public static int getGCD(int number1, int number2){
         if(number2>number1){
             int temp = number2;
             number2=number1;
             number1=temp;
         }
         if(number2==0){
             return number1;
         }
         else{
             return getGCD(number2, number1%number2);
         }
//         int remainder;
//         int n1=number1;
//         int n2=number2;
//
//         while(n2!=0){
//             remainder=n1%n2;
//             n1=n2;
//             n2=remainder;
//         }
//         return n1;
     }

    public static void main(String[] args) {

        System.out.println(getGCD(24,60));

    }
}
