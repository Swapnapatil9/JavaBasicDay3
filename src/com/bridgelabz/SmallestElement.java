package com.bridgelabz;

public class SmallestElement {
    public static void main(String[] args) {
        int [] element=new int[]{50,10,15,20,25};
        int min=element[0];
        for (int i=0;i<element.length;i++) {
            if (element[i] < min)
                min = element[i];
        }
        System.out.println("Smallest element in an array is:" +min);
    }
}
