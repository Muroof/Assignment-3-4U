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

        // variable to keep track of how many times a number is found
        int specNumCounter = 0;
        // tracker array
        int tracker[] = new int[101];

        // run through the tracker array counting amounts of numbers
        for (int i = 0; i < array.length; i++) {
            // increase counter
            specNumCounter = array[i];
            // number at tracker position number counter is set to equal numvet at position number counter plus one
            tracker[specNumCounter] = tracker[specNumCounter] + 1;
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
            } else {
                // if tracker at position int t is not greater than 0, add one to int t
                t++;
            }
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        A3Q4 test = new A3Q4();

        // making a random array of ints
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            // make a random number
            numbers[i] = (int) (Math.random() * 101);
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
