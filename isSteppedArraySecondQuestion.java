package com.test;

public class isSteppedArraySecondQuestion {

    public static int isStepped(int[] a){
        int firstElement =a[0];
        int counter =1;

        for(int i=1; i<a.length; i++){
            if(firstElement==a[i]){
                counter++;
                firstElement=a[i];
            }
            else if(counter>=3 && firstElement<a[i]){
                counter=1;
                firstElement=a[i];
            }
            else {
                return 0;
            }
        }
        if(counter<3){
            return 0;
        }
        return 1;

    }

    public static void main(String[] args) {

        System.out.println(isStepped(new int[]{1,1,1,5,5,5,5,8,8,8}));
        System.out.println(isStepped(new int[]{1,1,5,5,5,5,5,8,8,8}));
        System.out.println(isStepped(new int[]{5,5,5,5,15}));
        System.out.println(isStepped(new int[]{3,3,3,2,2,5,5,5,5,5}));
        System.out.println(isStepped(new int[]{3,3,3,2,2,2,1,1,1}));
        System.out.println(isStepped(new int[]{1,1,1,1}));
        System.out.println(isStepped(new int[]{1,1,1,1,1,1,1}));


    }
}
