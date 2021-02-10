/* 
It's the academic year's end, fateful moment of your school report. The averages must be calculated. All the students come to you and entreat you to calculate their average for them. Easy ! You just need to write a script.

Return the average of the given array rounded down to its nearest integer.

The array will never be empty.
*/ 

package Level_8s;


public class School{
  /* Solution 1 */
    public static int getAverage(int[] marks){
      int sum = 0;
      for(int i = 0; i < marks.length; i++ ){
        sum = sum + marks[i];
      }
      return sum / marks.length;
    }

/*Solution 2 */
    public static int getAverage2(int[] marks){
      int sum = 0;
      for (int mark : marks) {
        sum += mark;
      } 
      return sum / marks.length;
    }
  }
  