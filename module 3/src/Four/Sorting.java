package Four;

public class Sorting {
    public static int[] mergeSortedArrays(int[] array1, int[] array2) {
        int num1 = array1.length;
        int num2 = array2.length;
        int[] mergedArr = new int[num1 + num2];

//        create indexes for the 3 arrays, compare them, and put them in otder
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < num1 && j < num2) {
            if (array1[i] <= array2[j]) {
                mergedArr[k++] = array1[i++];
            } else {
                mergedArr[k++] = array2[j++];
            }
        }
//        put the remaining values in the final array
        while (i < num1) {
            mergedArr[k++] = array1[i++];
        }

        while (j < num2) {
            mergedArr[k++] = array2[j++];
        }

        return mergedArr;
    }
}
