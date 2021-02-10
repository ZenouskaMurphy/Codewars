/* COMPLETED
It's bonus time in the big city! The fatcats are rubbing their paws in anticipation... but who is going to make the most money?

Build a function that takes in two arguments (salary, bonus). Salary will be an integer, and bonus a boolean.

If bonus is true, the salary should be multiplied by 10. If bonus is false, the fatcat did not make enough money and must receive only his stated salary.

Return the total figure the individual will receive as a string prefixed with "£" (= "\u00A3", JS, Go, Java and Julia), "$" (C#, C++, Ruby, Clojure, Elixir, PHP, Python, Haskell and Lua) or "¥" (Rust).
*/

package Level_8s;

public class CalculateBonus{
/*Solution 1 */
public static String bonusTime(final int salary, final boolean bonus) {
    int newSalary;
    if(bonus == true){
        newSalary = salary*10;
    }
    else{
        newSalary = salary;
    }
    return "\u00A3"+ newSalary;
  }

/*Solution 2 */
public static String bonusTime2(final int salary, final boolean bonus) {
    return "\u00A3"+ (bonus ? 10 : 1) * salary;
}
}
