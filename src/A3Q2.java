/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ranam3235
 */
public class A3Q2 {

    public int smallestMissingNumber(int[] array) {

        // keep track of the number we are comparing
        for (int position = 0; position < array.length; position++) {
            // if array at posititon doesn't equal position
            if (array[position] != position) {
                // return position where "strange" number is located
                return position;
            }
        }
        // if all numbers are present and in order, return -1
        return -1;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] numbers = new int[8];
        numbers[0] = 0;
        numbers[1] = 1;
        numbers[2] = 2;
        numbers[3] = 4;
        numbers[4] = 3;
        numbers[5] = 5;
        numbers[6] = 6;
        numbers[7] = 7;

        A3Q2 test = new A3Q2();
        int missing = test.smallestMissingNumber(numbers);
        System.out.println(missing);

    }
}