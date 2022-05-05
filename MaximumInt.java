package com.Bridgelabz;


public class MaximumInt {

    public static <T extends Comparable<T>> T getMaxInt(T P, T Q, T R) {
        T max = P;

        if (Q.compareTo(max) > 0)
            max = Q;

        if (R.compareTo(max) > 0)
        max = R;
        System.out.println("Maximum value of given three integers is: " + max);

        return max;
    }

    public int MaxInt(int max){

        return max;
    }




    public static void main(String[] args) {


        MaximumInt.getMaxInt(20, 16, 30);
    }
}
