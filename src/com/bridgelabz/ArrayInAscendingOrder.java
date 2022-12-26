package com.bridgelabz;

public class ArrayInAscendingOrder {
    public static void main(String[] args) {

        int[] arr=new int[]{2,5,4,7,3};
        int temp=0;

        System.out.println("Elements of original array:");
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        for (int i=0;i<arr.length;i++){
        for (int j=i+1;j<arr.length;j++){
            if(arr[i]>arr[j]){
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        }
        System.out.println(" Elements of an array sorted in ascending order:");
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
