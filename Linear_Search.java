// Linear Search 1
public interface Linear_Search {
    public static void main(String[] args) {
        // the actual question
        int[] array = {21, 23, 3, 2, 11, 90, 18};
        int targetElement = 90;
        int result = linearSearch(array, targetElement);
        System.out.println(result);
    }
    static int linearSearch(int[] arr, int targetElement){
        if(arr.length == 0){
            return -1;
        }
        // if we target element found then just return the index value
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if(element == targetElement){
                return index;
            }
        }
        // if we are unable to get any result from above process it will print -1
        return -1;
    }

}
