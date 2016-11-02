package ua.kpi;

import java.util.Arrays;

/**
 * Created by Evgeniy on 11/2/2016.
 */
public class View {

    // Text's constants
    public static final String INPUT_INT_VALUE = "Input INT value: ";
    public static final String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please!";
    public static final String VALUE_BY_INDEX = "Value of this element is: ";
    public static final String RESULT = "Result is: ";
    public static final String CHOOSE_OPERATION = "\nENTER NUMBER 1...24 to see the task and it solution. Or press 25 to quit!";
    public static final String BREAK = "BREAK!";

    // Methods for printing the output data
    public void printMessage(Object message){
        System.out.println(message);
    }

    public void printMessage(String message, int array[]){
        System.out.println(message);
        System.out.println(Arrays.toString(array));
    }
}
