/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ranam3235
 */
public class A3Q3 {

    public int countOnes(int[] array) {
        // integer to store number of ones
        int ones = 0;
        // run through the array, keeping track of i
        for (int i = 0; i < array.length; i++) {
            // if array at position i equals one
            if (array[i] == 1) {
                // add one to integer ones
                ones++;
            }

        }
        // after looking through the whole array, return ones
        return ones;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numbers = new int[8];
        numbers[0] = 1;
        numbers[1] = 1;
        numbers[2] = 0;
        numbers[3] = 10;
        numbers[4] = 10;
        numbers[5] = 1;
        numbers[6] = 10;
        numbers[7] = 000;

        A3Q3 test = new A3Q3();
        int print = test.countOnes(numbers);
        System.out.println(print);
    }

}
