package com.bridgelabz;

public class ElementsInEvenPosition {
    public static void main(String[] args) {
        int [] element=new int[]{5,10,15,20,25};
        System.out.println("Elements of an array present on an even position:");

        for (int i=1;i<element.length;i=i+2){
            System.out.println(element[i]);
        }
    }
}
