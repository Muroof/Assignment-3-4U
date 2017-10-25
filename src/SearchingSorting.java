/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ranam3235
 */
public class SearchingSorting {

    // swap method
    public void swap(int[] array, int p1, int p2) {
        // store array at position p1 into int temp
        int temp = array[p1];
        // swap - set array at position p1 equal to array at position p2
        array[p1] = array[p2];
        // swap - set array at position p2 equal to temp, which is array at position p1 (prior to swap)
        array[p2] = temp;
    }

    public void selectionSort(int[] array) {
        // keep track of which position we are sorting
        for (int position = 0; position < array.length - 1; position++) {
            // integer small is set to equal position
            int small = position;
            // go through the rest looking for a smaller number
            for (int i = position + 1; i < array.length; i++) {
                // have we found smaller?
                if (array[i] < array[small]) {
                    // if i is smaller than array at position small
                    // small equals i
                    small = i;
                }
            }
            // swap once you are sure the number is in it's position
            swap(array, small, position);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SearchingSorting test = new SearchingSorting();

        // making a random array of ints
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            // make a random number
            numbers[i] = (int) (Math.random() * 15);
        }
        System.out.println("BEFORE:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        //SORT HERE
        test.selectionSort(numbers);

        //AFTER
        System.out.println("AFTER:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }


    }
}
