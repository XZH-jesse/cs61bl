import java.util.ArrayList;
import java.util.List;

public class ArrayExercises {

    /** Returns an array [1, 2, 3, 4, 5, 6] */
    public static int[] makeDice() {
        // TODO: Fill in this function.
        int[] result = new int[]{1, 2, 3, 4, 5, 6};
        return result;
    }

    /** Returns the positive difference between the maximum element and minimum element of the given array.
     *  Assumes array is nonempty. */
    public static int findMinMax(int[] array) {
        // TODO: Fill in this function.
        int min = array[0];
        int max = array[0];
        for (int i : array) {
            if (min > i) {
                min = i;
            }
            if (max < i) {
                max = i;
            }
        }
        return max - min;
    }

}
