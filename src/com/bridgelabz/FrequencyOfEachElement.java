package com.bridgelabz;

public class FrequencyOfEachElement {
    public static void main(String[] args) {
        int[] element = new int[]{1, 2, 8, 3, 2, 2, 2, 5, 1};
        int[] frequency = new int[element.length];
        int visited = -1;

        for (int i = 0; i < element.length; i++) {
            int count = 1;
            for (int j = i + 1; j < element.length; j++) {
                if (element[i] == element[j]) {
                    count++;
                    frequency[j] = visited;
                }
            }
            if (frequency[i] != visited)
                frequency[i] = count;
            System.out.println("Element|Frequency");
            System.out.println("" + element[i] + " | " + frequency[i]);
        }
    }
}
