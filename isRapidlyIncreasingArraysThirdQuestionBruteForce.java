package com.test;

public class isRapidlyIncreasing {

    public static int isRapidlyIncreasing(int[] a){
        int firstElement =a[0];
        int sum=0;

        for(int i=1; i<a.length; i++){
            if(a[i]>2*(firstElement+sum)){
                sum=sum+firstElement;
                firstElement=a[i];
            }
            else {
                return 0;
            }
        }
        return 1;

    }
    public static void main(String[] args) {

    System.out.println(isRapidlyIncreasing( new int[]{1,3,9,27}));
    System.out.println(isRapidlyIncreasing( new int[]{1,3,200,500}));
    System.out.println(isRapidlyIncreasing( new int[]{1}));
    System.out.println(isRapidlyIncreasing( new int[]{1,3,9,26}));
    System.out.println(isRapidlyIncreasing( new int[]{1,3,7,26}));
    System.out.println(isRapidlyIncreasing( new int[]{1,3,8,26}));


    }
}
