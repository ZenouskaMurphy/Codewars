/*COMPLETED
One hot summer day Pete and his friend Billy decided to buy watermelons. They chose the biggest crate. They rushed home, dying of thirst, and decided to divide their loot, however they faced a hard problem.

Pete and Billy are great fans of even numbers, that's why they want to divide the number of watermelons in such a way that each of the two parts consists of an even number of watermelons. However, it is not obligatory that the parts are equal.

Example: the boys can divide a stack of 8 watermelons into 2+6 melons, or 4+4 melons.

The boys are extremely tired and want to start their meal as soon as possible, that's why you should help them and find out, whether they can divide the fruits in the way they want. For sure, each of them should get a part of positive weight.
*/

package Level_8s;

public class DivideIntoEvens {
  public static boolean divide(int weight) {
    boolean even_loads;
    if (weight > 2 && weight % 2 == 0){
      even_loads = true;
    }
    else{
      even_loads = false;
    } 
    return even_loads;
  }    
}
