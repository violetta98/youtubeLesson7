package ua.lesson.lesson7;

import java.util.Scanner;

/**
 * Created by Violetta on 12-07-2017.
 */
public class InteractRunner {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Calculator calculator = new Calculator();
        String exit = "no";
        while(!exit.equals("yes")) {
            System.out.println("Enter first arg : ");
            int first = reader.nextInt();
            System.out.println("Enter second arg : ");
            int second = reader.nextInt();
            try {
                calculator.div(first, second);
            } catch (UserException e) {
                e.printStackTrace();
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } finally {

            }
            System.out.println("Result : " + calculator.getResult());
            calculator.cleanResult();
            System.out.println("Exit : yes/no ");
            exit = reader.next();
        }
        reader.close();
    }
}
