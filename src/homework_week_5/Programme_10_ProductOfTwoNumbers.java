package homework_week_5;

/**
 * 10. Write a Java Program that takes two number as input and display the
 * product of two numbers.
 * Test Data:
 * Input first number: 25
 * Input Second number: 5
 * Expected Output : 25 X 5 = 125
 */

public class Programme_10_ProductOfTwoNumbers {
    public static void main(String[] args) {
        //First Number declaration
        int firstNumber = 25;
        //Second Number declaration
        int secondNumber = 5;
        int produced = firstNumber * secondNumber;
        //Expected output
        System.out.println(firstNumber + " X " + secondNumber + " = " + produced);
    }
}
