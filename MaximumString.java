package com.Bridgelabz;

public class MaximumString {
     static String P = "Apple";
     static String Q = "Peach";
     static String R = "Banana";
    public static <T extends Comparable<T>> T getMaxString() {

        T max = (T) P;

        if (Q.compareTo((String) max) > 0)
            max = (T) Q;

        if (R.compareTo((String) max) > 0)
            max = (T) R;
        System.out.println("Maximum value of given three String is: " + max);

        return max;
    }

    public String MaxString(String max){

        return max;
    }

    public static void main(String[] args) {


        MaximumString.getMaxString();
    }
}

