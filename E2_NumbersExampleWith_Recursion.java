/*
Function calling itself is recursion
Why Recursion?
# it helps us in solving bigger complex problem in simpler ways.
# you can convert recursion solution into iteration and vice-versa
# space complexity is not constant because of recursive calls
# it helps us in breaking down bigger problem in smaller once
 */
public class E2_NumbersExampleWith_Recursion {
    public static void main(String[] args) {
        // Write the function that takes the value and prints it
        // print the first 5 numbers i.e. 1 2 3 4 5
        // follow the pattern from E1_Message
        input(1);
    }
    static void input(int n){
        // if we forget to insert this loop this program will give error after printing 19891 numbers
        /*
        hence the if loop is Base Condition here
        Base Condition :- Condition where our recursion stop making new calls .
         */
        if(n == 5){
            System.out.println(5);
            return;
        }
        /*
        ## as many times as you call function it will take memory separately
        When there is no base condition function call will keep happening
        Stack will be gets filled again and again
        and once memory of computer will exceed the limit responsible for giving stack overflow error
         */
        System.out.println(n);

        // below one is tail recursion
        // since it is last function call
        input(n + 1);
    }
}
