package com.bridgelabz;

public class PrintElementsOfAnArray {
    public static void main(String[] args) {
       // int[] elements={0,1,2,3,4};
        int[] elements=new int[5];
        elements[2]=10;
        elements[4]=20;
        for (int i=0;i<elements.length;i++)
        System.out.println(elements[i]);
    }
}
