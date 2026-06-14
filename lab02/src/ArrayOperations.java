/** Array Operations Class. Optional Exercise **/
public class ArrayOperations {
    /**
     * Delete the value at the given position in the argument array, shifting
     * all the subsequent elements down, and storing a 0 as the last element of
     * the array.
     */
    public static void delete(int[] values, int pos) {
        if (pos < 0 || pos >= values.length) {
            return;
        }
        // TODO: fill out this function
        while (pos < values.length - 1) {
            values[pos] = values[pos + 1];
            pos += 1;
        }
        values[values.length - 1] = 0;
    }

    /**
     * Insert newInt at the given position in the argument array, shifting all
     * the subsequent elements up to make room for it. The last element in the
     * argument array is lost.
     */
    public static void insert(int[] values, int pos, int newInt) {
        if (pos < 0 || pos >= values.length) {
            return;
        }
        // TODO: fill out this function
        int curr = values.length - 1;
        while (curr > pos) {
            values[curr] = values[curr - 1];
            curr -= 1;
        }
        values[pos] = newInt;
    }

    /** 
     * Returns a new array consisting of the elements of A followed by the
     *  the elements of B. 
     */
    public static int[] catenate(int[] A, int[] B) {
        // TODO: fill out this function
        int size = A.length + B.length;
        int[] newArray = new int[size];
        for (int i = 0; i < A.length; i += 1) {
            newArray[i] = A[i];
        }
        for (int i = 0; i < B.length; i += 1) {
            newArray[A.length + i] = B[i];
        }
        return newArray;
    }

}