/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ranam3235
 */
public class A3Q4 {

    public void countingSort(int[] array) {

        // tracker array
        int tracker[] = new int[101];

        // fill in the tracker array with the inputted array
        for (int i = 0; i < array.length; i++) {
            tracker[i] = tracker[i] + 1;
        }
        // variables used to track positions within orignal and tracker array
        int o = 0;
        int t = 0;

        // perform action x amount of times
        // x = the length of the array
        // whilst the original array has space
        while (o < array.length) {
            // if the int (in the position) in the tracker array is greater than 0
            if (tracker[t] > 0) {
                // set array at position int o to the position of the value in the tracker array 
                array[o] = t;
                // subtract one from position int t in the tracker array
                tracker[t]--;
                // add one to integer o
                o++;
            }
            // if tracker at position int t is not greater than 0, add one to int t
            t++;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A3Q4 test = new A3Q4();

        // making a random array of ints
        int[] numbers = new int[101];
        for (int i = 0; i < numbers.length; i++) {
            // make a random number
            numbers[i] = (int) (Math.random() * 42);
        }
        System.out.println("BEFORE:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        //SORT HERE
        test.countingSort(numbers);

        //AFTER
        System.out.println("AFTER:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }

}
