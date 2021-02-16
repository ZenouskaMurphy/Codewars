/* COMPLETED
Given a non-negative integer n, write a function to_binary/ToBinary which returns that number in a binary format.
*/

package Level_8s;

public class ToBinary {
    public static int toBinary(int n) {
        String binary = Integer.toBinaryString(n); // convert from int to binary string
        n = Integer.valueOf(binary);               // convert from binary string back to int
        return n;
    }  
}
