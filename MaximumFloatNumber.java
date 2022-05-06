package com.Bridgelabz;

public class MaximumFloatNumber {

    public static <T extends Comparable<T>> T getMaxFloat(T P, T Q, T R) {

        T max = P;

        if (Q.compareTo(max) > 0)
            max = Q;

        if (R.compareTo(max) > 0)
            max = R;
        System.out.println("Maximum value of given three Float numbers is: " + max);

        return max;
    }

    public double MaxFloat(double max){

        return max;
    }

    public static void main(String[] args) {


        MaximumFloatNumber.getMaxFloat(1.29, 3.56, 4.54);
    }
}




