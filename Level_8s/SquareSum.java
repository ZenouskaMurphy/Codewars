/* COMPLETED
Complete the square sum function so that it squares each number passed into it and then sums the results together.

For example, for [1, 2, 2] it should return 9 because 1^2 + 2^2 + 2^2 = 9.
*/

package Level_8s;

public class SquareSum{
    public static int squareSum(int[] n){
        /*Solution 1*/
        double result = 0;
        for(int i=0; i<n.length; i++){
          result = result + Math.pow(n[i],2);
        }
        return (int) result;
    }
    
    public static int squareSum2(int[] n){
        /*Solution 2*/
        int result = 0;
        for(int each: n){
            result += Math.pow(each,2);
        }
        return result;
    }
}
