package com.test;

import java.util.Arrays;

public class sieveOfEratosthenes {

    public static boolean[] sieveOfEratosthenes(int n){
        boolean[] isPrime = new boolean[n+1];// to align numbers with index
        Arrays.fill(isPrime, true);
        isPrime[0]=false;
        isPrime[1]=false;

        for(int i=2; i*i<=n; i++){
            for(int j= 2*i; j<=n; j+=i){
                isPrime[j]=false;
            }
        }
        return isPrime;

    }

    public  static void printPrime (boolean[] a){

         for(int i=0; i<a.length; i++){
             if(a[i]==true){
                 System.out.print(i+" ,"+ " ");
             }
         }

        }




    public static void main(String[] args) {
       boolean[] rangedNumber = sieveOfEratosthenes(12);
       printPrime(rangedNumber);
    }
}
