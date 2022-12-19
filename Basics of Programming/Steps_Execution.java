/*
Steps Execution
easy
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Take 4 digit number input from the user, add 8 to it and then divide it by 3(Only take integer part) Now, the modulus of that number is taken with 5 and then multiply the resultant value by 5. Display the final result.
Input
You don't have to worry about the input, you just have to complete the function stepsExecute

Constraints
1000 <= number <= 9999
Output
Print the final result
Example
Sample Input :
2345

Sample Output :
20
*/



import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int P = (N+8)/3;
        int Q = P%5;
        int Result = Q*5;
        System.out.println(Result);
    }
}
