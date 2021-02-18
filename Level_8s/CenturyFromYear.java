/* COMPLETED
The first century spans from the year 1 up to and including the year 100, The second - from the year 101 up to and including the year 200, etc.

Task :
Given a year, return the century it is in.

Input , Output Examples ::
centuryFromYear(1705)  returns (18)
centuryFromYear(1900)  returns (19)
centuryFromYear(1601)  returns (17)
centuryFromYear(2000)  returns (20)
*/

package Level_8s;

public class CenturyFromYear {
    public static int century(int number) {
        int period = 0;
        int last_number = 0;
        int ans = 0;
        for(int i=0; i<number; i++){
          period = number / 99;     //each century
          last_number = number % 10;  
          if(last_number != 0){  // if year is between two centuries we need to +1 
            ans = period + 1;
          }
          else{
            ans = period;
          }
        }
        return ans;
      }
}
