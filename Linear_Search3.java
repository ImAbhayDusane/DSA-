// if element found return true or false 
public class Linear_Search3 {
    public static void main(String[] args) {
        int[] array = {82, 33, 11, 33, 31, 74};
        int targetElement = 75;
        boolean result = linearSearch(array, targetElement);
        System.out.println(result);
    }
    // just add boolean in previous code to define this 
    static boolean linearSearch(int[] arr, int targetElement){
        if(arr.length == 0){
            return false;
        }
        
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if(arr[index] == targetElement){
                // if you found element return true
                return true;
            }
        }
        // if unable to find anything return false
        return false;
    }
}
