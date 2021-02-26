/*COMPLETED
write me a function stringy that takes a size and returns a string of alternating '1s' and '0s'.

the string should start with a 1.

a string with size 6 should return :'101010'.

with size 4 should return : '1010'.

with size 12 should return : '101010101010'.

The size will always be positive and will only use whole numbers.
*/

package Level_8s;

public class BinaryStrings {
    public static String stringy(int size) {
        StringBuilder binary = new StringBuilder();
        for (int i=0; i<size; i++){
          if (i % 2 == 0){ /* size -2 -2 -2 -2 is either 0 or 1*/ /*Also distinguishes even numbers*/ 
            binary.append("1");
          }
          else{
             binary.append("0");
          }
        }
        return binary.toString();
      }   
}
