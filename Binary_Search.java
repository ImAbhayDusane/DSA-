public class Binary_Search {
    public static void main(String[] args) {
        int[] array = {-101,-5, 0, 2, 5, 7, 8, 11, 33}; // array must be sorted
        int targetElement = 7;
        int result = binarySearch(array, targetElement);
        System.out.println(result);
    }
    static int binarySearch(int[] arr, int targetElement){
        int start = 0;
        int end = arr.length -1;
        
        // if target value is less than middle value we will search in first half only
        // in above case middle element previously will be our new end element
        while (start <= end){
            int mid = start + (end - start )/2;
            if(targetElement < arr[mid]){
                end = mid -1;
            }
            // if target value is greater than middle value we will search in second half only
            // in above case middle element previously will be our new start element
            // end will remain as it is
            else if(targetElement > arr[mid]){
                start = mid +1;
            }else {
                // ans found
                return mid;
            }

        }
        return -1;
        }
}
