/*
You're at the zoo... all the meerkats look weird. Something has gone terribly wrong - someone has gone and switched their heads and tails around!

Save the animals by switching them back. You will be given an array which will have three values (tail, body, head). It is your job to re-arrange the array so that the animal is the right way round (head, body, tail).

Same goes for all the other arrays/lists that you will get in the tests: you have to change the element positions with the same exact logics

Simples!
*/

package Level_8s;
import java.util.List;
import java.util.Arrays;

public class WrongEndHead {
/* Solution 1 */
  public static String[] fixTheMeerkat(String[] arr) {  
    List<String> list = Arrays.asList(arr); //Convert string array to ArrayList
    for (int i=0; i<list.size(); i++){
      String first = list.get(0);
      String last = list.get(2);
      list.set(0, last);
      list.set(2, first);
    }
    return list.toArray(new String[list.size()]); //Convert ArrayList back to string array for return statement
  }

/*Solution 2 */
  public static String[] fixTheMeerkat2(String[] arr) { 
      String first = arr[0];
      arr[0] = arr[2];
      arr[2] = first;
      return arr; 
    }
}