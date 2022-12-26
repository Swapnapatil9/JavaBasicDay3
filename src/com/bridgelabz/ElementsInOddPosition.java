package com.bridgelabz;

public class ElementsInOddPosition {
    public static void main(String[] args) {
        int [] element=new int[]{5,10,15,20,25};
        System.out.println("Elements of an array present on an odd position:");
        for (int i=0;i<element.length;i=i+2){
            System.out.println(element[i]);
        }
    }
}
