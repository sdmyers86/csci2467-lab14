package edu.cscc;

public class BubbleSort {
    public static void sort(String[] list) {
        // TODO - implement a Bubble Sort for a String array
        // Use the integer Bubble Sort from Unit 14 as a starting point
        // You'll need to use the String compareTo() method to compare Strings
        boolean changed = true;
        do {
            changed = false;
            for (int i = 0; i < list.length; i++)
                for(int j = i + 1; j < list.length; j++){
                    if ((list[i].compareTo(list[j]) > 0)) {
                        String temp = list[i];
                        list[i] = list[j];
                        list[j] = temp;
                        changed = true;
                    }
                }
        } while (changed);
    }
}
