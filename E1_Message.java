/*
In previous problem we use a function i.e. msg to print some stuff about the Recursion
 */
/*
But now we have to write that Statement 5 times
Q1: Print "This is Example of Recursion" 5 Times considering the below conditions
Condition:- i) You should not change the method
ii) You should call that method inside driver code only once

 */
public class E1_Message {
    public static void main(String[] args) {
        // See the beauty here we just use one msg() for getting the output rather than calling each method msg1(), msg2() number of times

        msg();
    }
    static void msg(){
        System.out.println("This is Example of Recursion ");
        // here after printing above line it will itself call another method msg1
        msg1();
    }
    static void msg1(){
        System.out.println("This is Example of Recursion ");
        // here after printing above line it will itself call another method msg2
        msg2();
    }
    static void msg2(){
        System.out.println("This is Example of Recursion ");
        // here after printing above line it will itself call another method msg3
        msg3();;
    }
    static void msg3(){
        System.out.println("This is Example of Recursion ");
        // here after printing above line it will itself call another method msg4
        msg4();
    }
    static void msg4(){
        System.out.println("This is Example of Recursion ");
        // here after printing above line it will end the legacy of itself as well as msg3, msg2, msg1 and msg

    }
}

