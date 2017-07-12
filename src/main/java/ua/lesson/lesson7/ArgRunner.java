package ua.lesson.lesson7;

/**
 * Created by Violetta on 12-07-2017.
 */
public class ArgRunner {
    public static void main(String[] args) {
        System.out.println("Calculate...");
        if (args.length == 2) {
            Integer first = Integer.valueOf(args[0]);
            Integer second = Integer.valueOf(args[1]);
            Calculator calculator = new Calculator();
            calculator.add(first, second);
            System.out.println("Sum :" + calculator.getResult());
        } else {
            System.out.println("Enter two parameters!");
        }
    }
}
