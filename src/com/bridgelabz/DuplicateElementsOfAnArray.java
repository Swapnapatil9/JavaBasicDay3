package com.bridgelabz;

public class DuplicateElementsOfAnArray {
    public static void main(String[] args) {
        int [] element=new int[]{1,2,3,5,2,3,4,5,4};
        System.out.println("Duplicate elements of an array:");

        for (int i=0;i<element.length;i++) {
            for (int j = i+1; j< element.length; j++) {
                if (element[i] == element[j])
                System.out.println(element[j]);
            }
        }
    }
}
