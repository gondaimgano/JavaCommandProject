package code;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * This is my first class
 *
 * @author Gondai Mgano
 *
 */
public class FirstClass {
    /**
     * The main function to be used
     *
     * @param args this holds all the arguments
     *
     */
    public static void main(String[] args) {
        System.out.println("My First Java Application!");
        boolean keepRunning=true;
        String regex="^(.[0-9]+)$";
        Pattern pattern=Pattern.compile(regex);
        if (pattern.matcher("123456").matches()) {
            System.out.println("Yes!!");
        }
       try (Scanner scanner=new Scanner(System.in)){
           while(keepRunning){
               System.out.println("Please choose your selection");
               //int[] ints = {1, 2, 3};
               for(String i : new String[]{"1 for Fruit", "2 for Apple", "3 " +
                       "for " +
                       "Potato"}){
                   System.out.println(i);
               }
               System.out.println("=======");
               switch (scanner.nextInt()) {
                   case 1 -> {
                       System.out.println("Fruit");
                       keepRunning = false;
                   }
                   case 2 -> {
                       System.out.println("Apple");
                       keepRunning = false;
                   }
                   case 3 -> {
                       System.out.println("Potato");
                       keepRunning = false;
                   }
                   default -> System.out.println("Unknown try again!");
               }
           }

        }
       catch (InputMismatchException ex){
           System.out.println("Entered invalid input");
       }
       catch(Exception ex){
           System.out.println(ex);
       }

    }
}
