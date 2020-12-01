package interview.challengequestions;

public class DuplicateArray {

    public static void main(String[] args) {
        // creating an array with duplicate elements
        int arr[] = {1, 2, 2, 3, 3, 4, 4, 5, 6, 7, 8, 9, 9, 9};
        int arrLength = arr.length;
        // passing the array and its length to the custom function to check duplicate elements
        arrLength = removeDuplicateElementFromArray(arr, arrLength);

        // printing the resulted array without duplicates
        for (int i = 0; i < arrLength; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static int removeDuplicateElementFromArray(int[] arr, int arrLength) {
        // checks if the array has 0 or 1 length and returns
        // no need to check as it has 0 or 1 elements so no duplicates
        if (arrLength == 0 || arrLength == 1) {
            return arrLength;
        }

        // initializing a temp array and a variable
        int[] temp = new int[arrLength];
        int j = 0;

        // checking array to rule out duplicate elements
        for (int i = 0; i < arrLength - 1; i++) {
            if (arr[i] != arr[i+1]) {
                temp[j++] = arr[i];
            }
        }

        // assigning the value of last element
        temp[j++] = arr[arrLength - 1];

        // assigning the values to the original elements
        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }
        return j;
    }
}
