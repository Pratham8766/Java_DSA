public class merge_sort{
    public static void printArray(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void conquer(int [] arr, int si, int mid, int ei){
        int [] merged = new int [ei - si + 1];

        int idx1 = si; //Starting index of first sub array
        int idx2 = mid + 1;  // Starting index of second sub array
        int x = 0;

        //comparing the elements in two arrays
        while(idx1<=mid && idx2<=ei){
            if(arr[idx1]<= arr[idx2]){
                merged[x] = arr[idx1];
                x++;
                idx1++;
            }
            else{
                merged[x] = arr[idx2];
                idx2++;
                x++;
            }
        }

        //Copying remaining elements in the merged array if remaining in 1st subarray
        while(idx1<=mid){
            merged[x] = arr[idx1];
            x++;
            idx1++;
        }

        //Copying remaining elements in the merged array if remaining in 2nd subarray
        while(idx2<=ei){
            merged[x] = arr[idx2];
            idx2++;
            x++;
        }


        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }
    public static void divide(int [] arr, int si, int ei){

        if(si>=ei){
            return;
        }
        int mid = si + (ei-si)/2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr, si, mid, ei);
    }
    public static void main(String[] args) {
        int [] arr = {6, 3, 2, 5, 8, 9};
        printArray(arr);
        System.out.println();
        divide(arr, 0, arr.length-1);
        printArray(arr);
    }
}