/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maloof
 */
public class A3Q5 {

    // swap method
    public void swap(String[] array, int p1, int p2) {
        // set a temporary variable and equal it to array at position p1
        String temp = array[p1];
        // set array at position p1 to array at position p2
        array[p1] = array[p2];
        // set array at position p2 to temp, which is array at position p1 (prior to swap)
        array[p2] = temp;
    }

    // insertion sort
    public void insertionSort(String[] array) {
        // start going through the array
        for (int i = 0; i < array.length - 1; i++) {
            // store position
            int position = i;
            // compare strings beside each other in the array to see if they are in alphabatical order
            while (position >= 0 && array[position].compareTo(array[position + 1]) > 0) {
                // if out of place, swap it downwards
                // until correct position is reached 
                swap(array, position, position + 1);
                position--;
            }
        }
    }

    public static void main(String[] args) {
        A3Q5 test = new A3Q5();

        // making a random array of strings
        String[] words = new String[4];
        words[0] = "apple";
        words[1] = "danner";
        words[2] = "crista";
        words[3] = "binlad";

        //SORT HERE
        test.insertionSort(words);

        // output the array once it has been sorted
        System.out.println("AFTER:");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

    }
}
