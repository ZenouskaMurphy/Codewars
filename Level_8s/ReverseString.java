/* COMPLETED
Complete the solution so that it reverses the string passed into it.

'world'  =>  'dlrow'
*/
package Level_8s;

public class ReverseString{
    public static String solution(String str) {
        /* Solution 1 = StringBuilder*/
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    public static String solution2(String str) {
        /*Solution 2*/
        String reverse = "";
        for(int i=str.length()-1; i>=0; i--){
            reverse += str.charAt(i);
        }
        return reverse;
    } 
}