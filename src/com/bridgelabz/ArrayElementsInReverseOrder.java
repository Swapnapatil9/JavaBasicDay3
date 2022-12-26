package com.bridgelabz;

public class ArrayElementsInReverseOrder {
    public static void main(String[] args) {
        int [] element=new int[]{5,10,15,20,25};
        System.out.println("Original array:");

        for (int i=0;i<element.length;i++) {
            System.out.println(element[i]);
        }
            System.out.println("Array in reverse order:");
            for (int i=element.length-1;i>=0;i--){
                System.out.println(element[i]);
            }
    }
}
