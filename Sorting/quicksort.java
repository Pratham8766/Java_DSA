public class quicksort{
    public static void printArray(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    //{6, 3, 2, 5, 9, 8};
    public static void quick(int [] arr, int low, int high){
        if(low < high){
            int partitionIndex = partition(arr, low, high);
            quick(arr, low, partitionIndex - 1);
            quick(arr, partitionIndex + 1, high);
        }
    }

    public static int partition(int [] arr, int low, int high){
        int pivot = arr[low];
        int leftPointer = low + 1;
        int rightPointer = high;

        while(leftPointer<=rightPointer){
            //Finding the element greater than pivot
            while(leftPointer<=rightPointer && pivot>=arr[leftPointer]){
                leftPointer++;
            }

            //Finding the element less than pivot
            while(leftPointer<=rightPointer && pivot<arr[rightPointer]){
                rightPointer--;
            }

            //If found then swap arr[leftPointer] and arr[rightPointer]
            if(leftPointer<rightPointer){
                int temp = arr[leftPointer];
                arr[leftPointer] = arr[rightPointer];
                arr[rightPointer] = temp;
            }

            //Again continue the same procedure
        }

        // Now swap arr[low] with arr[rightPointer]
        int temp = arr[low];
        arr[low] = arr[rightPointer];
        arr[rightPointer] = temp;

        return rightPointer;
    }

    public static void main(String[] args) {
        int [] arr = {6, 3, 9, 5, 2, 8};
        printArray(arr);
        quick(arr, 0, arr.length-1);
        printArray(arr);
    }
}