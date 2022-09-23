import java.util.Scanner;

import javax.swing.undo.StateEdit;




public class Game {
private static Scanner scanner;

public static void main(String[] args) {
    
    int stateID = 0;
    String action;
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

     while(stateID!=666){
        stateID = takeAction(stateID,getInput());
        printState(stateID);
    }
   

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
    String Input ="";
    while(valid==false)
    {
        System.out.println("\nWhat would do you like to do?");
        Input = scanner.nextLine();
        Input.toLowerCase();
        if(("quit".equals(Input))||("open the door".equals(Input))||("go north".equals(Input))||("go east".equals(Input))||("go south".equals(Input))||("go west".equals(Input))||("take item".equals(Input))||("drop item".equals(Input))||("use item".equals(Input)))
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

public static int takeAction(int currentState,String action){


if(action.equals("open the door")){
    currentState = 666;
}
else if(currentState==0 && action.equals("open the door")){
    currentState = 1;
}
else if(currentState==0 && action.equals("take item")){
    currentState = 2;
}
else if(currentState==1 && action.equals("go east")){
    currentState = 3;
}
else{
    return currentState;
}
return currentState;
}

public static void printState(int currentState){
    if(currentState==0){
        System.out.println("You are standing in an abandoned university office. There are neither"+ 
        "students nor teachers around you. There"+"’"+"s a table in front of you with"+ 
        "various papers, pens, a small puzzle toy, and a calculator."+
        "A large window shows an empty office building; there are no Zombies in the"+ 
        "empty building (as far as you can tell). Behind you is a dark and mysterious"+ 
        "door that leads to a well-lit corridor with a fireproof ceiling and floor. You feel"+ 
        "a sense of Wi-Fi around you, the grinding of an LCD operated coffee"+ 
        "machine can be heard in the distance. You are not thirsty, but you rather"+ 
        "have a craving for justice.");
    }
    else if(currentState==1){
        System.out.println("You are in a long hallway. There’s a man wearing glasses at the end of it, he"+ 
        "looks harmless. West is a wall, east is the man, to the north is nothing but"+ 
        "empty offices, a desperate sight. The carpeting in the hallway feels soft, you"+ 
        "hear the clicking of a mouse in the distance. Your office is south (behind"+ 
        "you).");
    }
    else if(currentState==2){
        System.out.println("You take the calculator from your desk. It’s a Casio FX-85gt Plus. The"+ 
        "display shows the number 0.1134. You turn it upside down; now the Casio"+ 
        "greets you with a friendly “hello”, nice. You hold the calculator in your hand.");
    }
    else if(currentState==3){
        System.out.println(" The man greets you and starts endlessly talking to you about his children"+ 
        "and his holiday to Benidorm. You die of boredom");
    }
}
}



