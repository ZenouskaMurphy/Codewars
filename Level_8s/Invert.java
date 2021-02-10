/* NOT COMPLETED
Given a set of numbers, return the additive inverse of each. Each positive becomes negatives, and the negatives become positives.

invert([1,2,3,4,5]) == [-1,-2,-3,-4,-5]
invert([1,-2,3,-4,5]) == [-1,2,-3,4,-5]
invert([]) == []
*/

package Level_8s;

import java.util.List;
import java.util.ArrayList;

public class Invert{
  public static int[] invert(int[] array){
    List<Integer> list = new ArrayList<>(); //convert int array to int list
    int current = 0;
    int newest = 0;
  for (int i=0; i< array.length; i++){
    current = array[i];
    newest = (current * -1);
    System.out.println(list);
    list.add(newest);
  }
    //return list.toArray(new Integer[list.size()]); //convert int list back into int array for return
    return array;
    }
  }