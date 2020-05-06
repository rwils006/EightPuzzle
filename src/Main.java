import java.util.Scanner;

public class Main {

    final static private String trivial = "123456780"; //userIn = 0
    final static private String veryEasy = "123456708"; //userIn = 1
    final static private String easy = "120453786"; //userIn = 2
    final static private String doable = "012453786"; //userIn = 3
    final static private String ohBoy = "871602543"; //userIn = 4
    final static private String impossible = "123456870"; //userIn = 5

    public static void main(String[] args) {

        System.out.println("Pick a number between 0 and 5: ");
        Scanner userIn = new Scanner(System.in); //this gets the user input
        char user = userIn.next().charAt(0);
        if (user == '0'){
            String rootState = trivial;

        } else if (user == '1'){
            String rootState = veryEasy;


        } else if (user == '2'){
            String rootState = veryEasy;

        } else if (user == '3'){
            String rootState = easy;

        } else if (user == '4'){
            String rootState = doable;

        } else if (user == '5'){
            String rootState = ohBoy;

        } else {
            System.out.println("Invalid input");
        }
    }
}
