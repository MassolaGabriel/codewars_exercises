package kyu8.twoarraysintoone;
import java.util.Arrays;

public class MergeArray {

    public int[] mergeArray(int[] array1, int[] array2) {
        int newArrayLength = array1.length + array2.length;
        int[] arrayMerged = new int[newArrayLength];

        for (int i = 0; i < array1.length; i++) {
            arrayMerged[i] = array1[i];
        }

        for (int i = 0; i < array2.length; i++) {
            arrayMerged[i + array1.length] = array2[i];
        }

        return arrayMerged;
    }

    public static void main(String[] args) {
        MergeArray merger = new MergeArray();

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,10};
        int[] result = merger.mergeArray(arr1, arr2);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(result));
    }
}
