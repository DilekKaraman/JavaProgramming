package day23;

import javax.sql.rowset.FilteredRowSet;
import java.util.Locale;

public class NameFormat {
    public static void main(String[] args) {
        nameFormat("cYdEo","SCHOOL");
    }

    public static void nameFormat(String firstName, String lastName) {
        firstName = firstName.toLowerCase();
        lastName = lastName.toLowerCase();
        firstName=firstName.replace('c','C');
        lastName=lastName.replace('s','S');

        String result = firstName + " " + lastName;
        System.out.println(result);
    }

}
/*write a method that can print out the full name of a person in
regular format
ex:
fullName("cYdEo", "SCHOOL");
output:
"Cydeo School"

 */
