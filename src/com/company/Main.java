package com.company;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[] {64,12,43,124,54,21,56,32,11,34,7,346,21};

        int minValue = array[0];
        int minIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if(array[i] < minValue){
                minValue = array[i];
                minIndex = i;
            }
        }

        System.out.println(" min value:" + minValue);
        System.out.println(" min index:" + minIndex);
    }
}
