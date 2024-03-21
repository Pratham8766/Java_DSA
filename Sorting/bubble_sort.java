public class bubble_sort {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void bubble_sorting(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) { //N-1 comparisons because Heavy element is pushed to the back of the array
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swapping elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {7, 8, 3, 1, 2};

        bubble_sorting(arr);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}
