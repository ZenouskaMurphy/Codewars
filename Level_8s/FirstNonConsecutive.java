/* NOT COMPLETE
Your task is to find the first element of an array that is not consecutive.

By not consecutive we mean not exactly 1 larger than the previous element of the array.

E.g. If we have an array [1,2,3,4,6,7,8] then 1 then 2 then 3 then 4 are all consecutive but 6 is not, so that's the first non-consecutive number.

If the whole array is consecutive then return null2.

The array will always have at least 2 elements1 and all elements will be numbers. The numbers will also all be unique and in ascending order. The numbers could be positive or negative and the first non-consecutive could be either too!
*/

package Level_8s;

class FirstNonConsecutive {
    static Integer find(final int[] array) {
      int current = 0;
      int nonConsecutive = 0;
      //pass
      
      for(int i=0; i<array.length; i++){
        current = array[i];
        if(array[i+1] == (array[i] + 1)){
          System.out.println("consecutive" + current); //need to return null if whole array is consecutive
          //pass = null;
        }
        else{
          nonConsecutive = array[i + 1]; //gets all instances of nonconsecutive (needs to just be first instance)
          System.out.println("Nonconsecutive" + nonConsecutive);
          //pass = nonConsecutive;
        }
      }
       return pass;
    }
  }