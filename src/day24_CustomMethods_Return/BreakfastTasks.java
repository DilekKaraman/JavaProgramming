package day24_CustomMethods_Return;

public class BreakfastTasks {

    public static void main(String[] args) {

        initials("Wooden","World!");
        System.out.println("-------------------------------------------");

        domain("Cydeo.School@amazon.com");
        System.out.println("-------------------------------------------");

        String[] emails={"josh@gmail.com", "Elminur@cydeo.com", "Gulsen@gmail.com"};
        for(String email:emails){
            domain(email);
        }
        System.out.println("-------------------------------------------");
        nameOfMonth(12);
        System.out.println("-------------------------------------------");
        nameOfDay(7);
        System.out.println("-------------------------------------------");
        dayInMonth("February",2022);
        System.out.println("-------------------------------------------");
        agegroup(38);
    }
//Create a method that can display the initials of the person.  initials(String firstName, String lastName)
    public static void initials(String firstName, String lastName){

        String initial= firstName.charAt(0)+ "."+lastName.charAt(0);
        initial=initial.toUpperCase();
        System.out.println("initial = " + initial);
    }

    // Create a method that can display the domain of the email. domain(String email)
public static void domain(String emails) {
    String domain = emails.substring(emails.indexOf("@") + 1, emails.lastIndexOf("."));
    System.out.println("domain = " + domain);
}
    // Create a method that can display the name of the month based on the given number to the method
public static void nameOfMonth(int number){
        String name="";
        if(number>=1&&number<=12){
          name=(number==1)?"January":(number==2)?"Feb":(number==3)? "Mar":(number==4)? "Apr":(number==5)?"May":(number==6)?
                  "June":(number==7)?"July":(number==8)?"Aug":(number==9)?"Sep":(number==10)?"Oct":(number==11)?"Nov":
                  "Dec";
        }else{
            name="invalid";
        }
    System.out.println("name = " + name);
}
//Create a method that can display the name of the day based on the given number to the method
    public static void nameOfDay(int number){
        String name="";
        if(number>=1&&number<=7){
           name=(number==1)?"Monday":(number==2)?"Tuesday":(number==3)?"Wednesday":(number==4)? "Thursday":(number==5)?"Friday"
                   :(number==6)?"saturday":"Sunday";
        }else{
            name="Invalid ";
        }
        System.out.println("name = " + name);
    }
//Create a method that can display the how may days a month has
public static void dayInMonth(String name,int year) {
    int days;

    if ((name.equalsIgnoreCase("February")) && (year % 2 == 0)) {
        System.out.println("days = " + 28);
    }
    if ((name.equalsIgnoreCase("April")) || (name.equalsIgnoreCase("June")) || (name.equalsIgnoreCase("September"))
            || (name.equalsIgnoreCase("November")) && (year % 2 == 0 || year % 2 != 0)) {
        System.out.println(" days= " + 30);
    } else{
        System.out.println(" days= " + 31);
    }
}

/* infant (1 - 2), Toddler (3 - 5),Kid (6 - 9), Pre-Teen (10 - 12),
                        Teenager (13 - 17),Young Adult (18 - 20),Adult (21 - 39),
                        Young Middle-Aged Adult (40 - 49),Middle-Aged Adult (50 - 54),
                        Very Young Senior Citizen (55 - 64),Young Senior Citizen (65 - 74),
                        Senior Citizen (75 - 84),
                        Old Senior Citizen (85+)

 */
    public static void agegroup(int num){
       String groups="";
       if(num>=1){
        groups=(num==1|| num==2)?"infant":(num>=3&&num<=5)?"Toddler":(num>=6&&num<=9)?"Kid":(num>=10&&num<=12)?"Pre-Teen":
                (num>=13&&num<=17)?"Teenager":(num>=18&&num<=20)?"Young Adult":(num>=21&&num<=39)?"Adult":(num>=40&&num<=49)?
                        "Young Middle-Aged Adult":(num>=50&&num<=54)?"Middle-Aged Adult":(num>=55&&num<=64)?"Very Young Senior Citizen":
                        (num>=65&&num<=74)?"Young Senior Citizen":(num>=75&&num<=84)?"Senior Citizen":"Old Senior Citizen";

        }else{
           System.out.println("Invalid");
       }
        System.out.println("groups = " + groups);
    }
    /*1.Create a method that can display the initials of the person.
    2. Create a method that can display the domain of the email
    3. Create a method that can display the name of the month based on the given number to the method
    4. Create a method that can display the name of the day based on the given number to the method
    5. Create a method that can display the how may days a month has
    6.age groups are:infant (1 - 2), Toddler (3 - 5),Kid (6 - 9), Pre-Teen (10 - 12),
                        Teenager (13 - 17),Young Adult (18 - 20),Adult (21 - 39),
                        Young Middle-Aged Adult (40 - 49),Middle-Aged Adult (50 - 54),
                        Very Young Senior Citizen (55 - 64),Young Senior Citizen (65 - 74),
                        Senior Citizen (75 - 84),
                        Old Senior Citizen (85+)
     */
}
