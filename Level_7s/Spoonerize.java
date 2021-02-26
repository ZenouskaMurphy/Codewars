/* COMPLETED
A spoonerism is a spoken phrase in which the first letters of two of the words are swapped around, often with amusing results.

In its most basic form a spoonerism is a two word phrase in which only the first letters of each word are swapped:

"not picking" --> "pot nicking"

Your task is to create a function that takes a string of two words, separated by a space: words and returns a spoonerism of those words in a string, as in the above example.

NOTE: All input strings will contain only two words. Spoonerisms can be more complex. For example, three-word phrases in which the first letters of the first and last words are swapped: "pack of lies" --> "lack of pies" or more than one letter from a word is swapped: "flat battery --> "bat flattery" You are NOT expected to account for these, or any other nuances involved in spoonerisms.
*/


package Level_7s;

public class Spoonerize{
    public String spoonerize(String words) {
        /* Solution 1*/
        String [] array = words.split(" ");
        String final_ans = "";
  
        for(int i=0; i<array.length;i++){
          String first_word = array[0]; // first word
          String second_word = array[1];  // second word
          char char_0_first = first_word.charAt(0); //first char of first word
          char char_0_second = second_word.charAt(0); // first char of second word
          String ans1 = first_word.replace(first_word.charAt(0), char_0_second); //replace first char of first word with first char of second word
          String ans2 = second_word.replace(second_word.charAt(0), char_0_first);  //replace first char of second word with first char of first word
          final_ans = ans1 + ans2;
        }
        return final_ans;
      } 
      
      /*Solution 2*/
    public String spoonerize2(String words) {
        String [] array = words.split(" ");
        //example string array:  hello world
        return array[1].substring(0,1) + array[0].substring(1) + " " + array[0].substring(0,1) + array[1].substring(1); //return w + ello h + orld
    }
}
