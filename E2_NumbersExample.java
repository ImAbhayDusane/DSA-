
public class E2_NumbersExample {
    public static void main(String[] args) {
        // Write the function that takes the value and prints it
        // print the first 5 numbers i.e. 1 2 3 4 5
        // follow the pattern from E1_Message
        input(1);
    }
    // Same function Same Body
    static void input(int n){
        System.out.println(n);
        // Notice here we are just calling the function with the help of another function
        input1(2);
    }
    // Same function Same Body
    static void input1(int n){
        System.out.println(n);
        // Notice here we are just calling the function with the help of another function
        input2(3);
    }
    // Same function Same Body
    static void input2(int n){
        System.out.println(n);
        // Notice here we are just calling the function with the help of another function
        input3(4);
    }
    // Same function Same Body
    static void input3(int n){
        System.out.println(n);
        // Notice here we are just calling the function with the help of another function
        input4(5);
    }
    // Different Function
    static void input4(int n){
        System.out.println(n);

    }

}
