/* PARTLY COMPLETED
#Issue Looks like some hoodlum plumber and his brother has been running around and damaging your stages again.

The pipes connecting your level's stages together need to be fixed before you recieve any more complaints. Each pipe should be connecting, since the levels ascend, you can assume every number in the sequence after the first index will be greater than the previous and that there will be no duplicates.

#Task Given the a list of numbers, return the list so that the values increment by 1 for each index up to the maximum value.

#Example:

Input: 1,3,5,6,7,8

Output: 1,2,3,4,5,6,7,8
*/

package Level_8s;

public class FixPipe{
  /*Solution 1 - Find missing numbers. Create new array and add numbers in original array  + missing numbers (not completed) */
  public static int[] pipeFix(int[] numbers) {
    int current = 0;
    int next = 0;
    int missing = 0;
    
    //int [] new_array = new int[size];// new array
    
    for (int i=0; i<numbers.length-1; i++){
      current = numbers[i];
      next = numbers[i + 1];
      if(next != (current + 1)){
        missing = current + 1;
      }
    }
    return new_array;
  }
  /*Solution 2 - create new array of correct size and generate by adding +1 to each number from first number*/ 
  public static int[] pipeFix2(int[] numbers) {
    int min_array = numbers[0];
    int max_array = numbers[numbers.length-1];
    int size_array = (max_array - min_array) + 1;
    int [] new_array = new int[size_array]; //initialize new array with desired length of new array
    for (int i=0; i<size_array; i++){
      new_array[i] = min_array + i;
    }
    return new_array;
  }
}
