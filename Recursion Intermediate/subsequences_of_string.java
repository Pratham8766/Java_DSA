public class subsequences_of_string {
    public static int count = 0;
    //Subsequence of a given string
    public static void printSubsequence(String str, int idx, String newString){
        if(idx==str.length()){
            if(isPalindrome(newString)){
                count++;
                System.out.println(newString);
                return;
            }
            return;
        }
        char currChar = str.charAt(idx);
        
        printSubsequence(str, idx+1, newString+currChar);

        printSubsequence(str, idx+1, newString);
    }
    public static boolean isPalindrome(String str){
        int left = 0;
        int right = str.length()-1;
        char [] arr = str.toCharArray();
        while(left<right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
        
        return new String(arr).equals(str);
    }

    
    public static void main(String[] args) {
        printSubsequence("babad", 0, "");
        // System.out.println(isPalindrome("abb"));
    }
}
