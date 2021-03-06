/* COMPLETED
Given a non-negative integer, 3 for example, return a string with a murmur: "1 sheep...2 sheep...3 sheep...". Input will always be valid, i.e. no negative integers.
*/

package Level_8s;

public class CountSheep {

    public static String countingSheep(int num) {
        String sheep = "sheep...";
        String print = "";
        
        for(int i=1; i<=num; i++){
            print += i + " " + sheep;
        }
        return print;
    }
}
