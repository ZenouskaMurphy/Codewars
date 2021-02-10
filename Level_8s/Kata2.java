/* COMPLETED
Given a month as an integer from 1 to 12, return to which quarter of the year it belongs as an integer number.

For example: month 2 (February), is part of the first quarter; month 6 (June), is part of the second quarter; and month 11 (November), is part of the fourth quarter.
*/
package Level_8s;

public class Kata2 {
    public static int quarterOf(int month) {
      int quarter = 0;
      
      if ((month > 0 ) && (month <4)){
        return quarter = 1;
      }
      if ((month > 3) && (month < 7)){
        return quarter = 2;
      }
      if ((month > 6) && (month < 10)){
        return quarter = 3;
      }
      if ((month > 9) && (month < 13)){
        return quarter = 4; 
      } 
      return quarter;
    }
}