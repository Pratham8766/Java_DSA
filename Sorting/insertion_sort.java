public class insertion_sort {
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void insertion_sorting(int[] arr) {
        for (int i = 1; i < arr.length; i++) { //Starting from Unsorted array as initially sorted array is arr[0] and unsorted in remaining
            int current = arr[i]; //1
            int j = i-1;  //Taking the previous element

            while(j>=0 && current < arr[j]){   // Run the loop and just shift the places(no placement of elements) until j is less than equal to 0 and unless the smallest element is found. If greater element is found then just place it. 
                arr[j+1] = arr[j]; //arr[2] = arr[1]
                j--;
            }

            arr[j+1] = current; //placement
        }
    }
    public static void main(String[] args) {
        int[] array = {7, 8, 3, 1, 2};

        insertion_sorting(array);

        System.out.println("Sorted Array:");
        printArray(array);
    }
}
