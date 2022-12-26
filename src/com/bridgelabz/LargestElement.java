package com.bridgelabz;

public class LargestElement {
    public static void main(String[] args) {
        int [] element=new int[]{50,10,15,20,25};
        int max=element[0];
        for (int i=0;i<element.length;i++) {
            if (element[i] > max)
                max = element[i];
        }
            System.out.println("Largest element in an array is:" +max);
    }
}
