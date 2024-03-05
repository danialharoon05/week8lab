package week8;

import java.util.Scanner;

public class Iam {
    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        String userInput , qualities =  "";
        userInput = keyboard.nextLine();
        while(!userInput.equals(".")) {

            if (userInput.startsWith("I am ")) {
            String concate = userInput.substring(5);
            qualities += concate + ", ";
                //System.out.println("The qualities are " + concate);
            }

            userInput = keyboard.nextLine();
            ;
        }
        System.out.println("The qualities are " + qualities);

    }
}
