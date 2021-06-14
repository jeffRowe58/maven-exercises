

import java.util.Scanner;

import static org.apache.commons.lang3.StringUtils.*;

public class Dependecy_exercises {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter something.");
        String something = sc.nextLine();
        System.out.println("You entered " + something);
        if(isNumeric(something) == true){
            System.out.println("You entered a number.");
        }else{
            System.out.println(something + " is not a number");
        }
        System.out.println("Flipped caps: " + swapCase(something));
        System.out.println("Saying reversed: " + reverse(something));

    }


}
