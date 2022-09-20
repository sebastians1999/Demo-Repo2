import java.util.Scanner;




public class Game {
private static Scanner scanner;


public static void main(String[] args) {
    scanner = new Scanner(System.in);
    // ----- Write your code below
    String s =  "       __                    _          ___       __                 __\n"
    +           "      / /__  ____________  _( )_____   /   | ____/ /   _____  ____  / /___  __________ \n"   +
              " __  / / _ \\/ ___/ ___/ / / /// ___/  / /| |/ __  / | / / _ \\/ __ \\/ __/ / / / ___/ _ \\ \n" +
               "/ /_/ /  __/ /  / /  / /_/ / (__  )  / ___ / /_/ /| |/ /  __/ / / / /_/ /_/ / /  /  __/ \n"  +
               "\\____/\\___/_/  /_/   \\__, / /____/  /_/  |_\\__,_/ |___/\\___/_/ /_/\\__/\\__,_/_/   \\___/ \n"  +
               "                    /____/";             
    System.out.println(s);
    System.out.println("\nby: Sebastian Schmülling");

    System.out.print("\n\nWhat is your name? : ");
    String name = scanner.next();
    System.out.print("\nHi "+name+"!\n");

    System.out.print("When were you born?\n");
    int age = scanner.nextInt();                                //nextInt to make sure only to read in integers
    System.out.print("You are "+calculateAge(age)+" old\n");
    scanner.nextLine();                                      //to read in the line-end after reading the input, because nextInt did not do it 

    String text =  "\n\nYou are standing in an abandoned university office. There are neither students\n" +
    "nor teachers around you. There's a table in front of you with various papers,\n" +
    "pens, a small puzzle toy, and a calculator.\n" +
   "A large window shows an empty office building; there are no Zombies in the empty\n" +
   "building (as far as you can tell). Behind you is a dark and mysterious door that\n" +
   "leads to a well-lit corridor with a fireproof ceiling and floor. You feel a\n" +
   "sense of Wi-Fi around you, the grinding of an LCD operated coffee machine can be\n" +
   "heard in the distance. You are not thirsty, but you rather have a craving for\n" +
   "justice.\n"; 
   System.out.print(text);
   
   System.out.print("\n\nWhat do you would like to do?\n");
   String answer = scanner.nextLine(); 
   System.out.print("\n"+answer+"\n");

   getInput();




        // ----- Write your code above
}
public static int calculateAge(int birthYear)
{
    return 2022-birthYear;   
}

public static String getInput()
{
    boolean valid = false;
    scanner = new Scanner(System.in);


    while(valid==false)
    {
        System.out.println("\nWhat would do you like to do?");
        String Input = scanner.nextLine();
        if(("Open the door".equals(Input))||("Go north".equals(Input))||("Go east".equals(Input))||("Go south".equals(Input))||("Go west".equals(Input))||("Take item".equals(Input))||("Drop item".equals(Input))||("Use item".equals(Input)))
        {
            System.out.println("\n"+Input);
            valid=true;
        }
        else
        {
            System.out.println("\nInvalid Input");
        }
    }
    return Input;
}
}


