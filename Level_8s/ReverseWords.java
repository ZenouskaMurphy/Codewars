/* COMPLETED
Complete the solution so that it reverses all of the words within the string passed in.

Example:

ReverseWords.reverseWords("The greatest victory is that which requires no battle");
// should return "battle no requires which that is victory greatest The"
*/

package Level_8s;

public class ReverseWords{
    public static String reverseWords(String str){  
        /* reverse just order of words*/
        String[] words = str.split(" ");   //split each word by " "
        StringBuilder sb = new StringBuilder(); 
        
        for (int i = words.length -1; i >= 0; i--){   //Iterate through string array backwards
          sb.append(words[i]).append(" ");  //add " " after each word in stringbuilder
        }
        return sb.toString();//convert from stringbuilder to string
      }
    public static String reverseWords2(String str){
        /* Reverse order of words and characters in each word*/
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    } 
}
