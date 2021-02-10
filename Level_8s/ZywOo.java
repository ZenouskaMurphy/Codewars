/*
Wolves have been reintroduced to Great Britain. You are a sheep farmer, and are now plagued by wolves which pretend to be sheep. Fortunately, you are good at spotting them.

Warn the sheep in front of the wolf that it is about to be eaten. 

(YOU ARE HERE AT THE FRONT OF THE QUEUE)  [sheep, sheep, sheep, sheep, sheep, wolf, sheep, sheep]      
                                             1      2      3      4      5            6      7

If the wolf is the closest animal to you, return "Pls go away and stop eating my sheep". Otherwise, return "Oi! Sheep number N! You are about to be eaten by a wolf!" where N is the sheep's position in the queue.

Note: there will always be exactly one wolf in the array.

*/

package Level_8s;

 public class ZywOo {

   public static String warnTheSheep(String[] array) {
     String findMe = "wolf";
     for (int i=0; i<array.length; i++){
        if (array[0] == findMe){
           return "Pls go away and stop eating my sheep";
         }
        else{
          if(array[i] == findMe){
            int findMeN = (i+1); // +1 because the array starts at 0, but the queue starts at 1 
            return "Oi! Sheep number" +  (findMeN-1) +"!" + "You are about to be eaten by a wolf!"; // (findMeN -1) because we are looking for the sheep 1 place to the left of the pos of the wolf in queue
         }
       }
      }
      return "";
   }
}