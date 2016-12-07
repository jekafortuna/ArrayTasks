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
    public static final String TASK1 = "Task1: Calculate the sum of all elements in array:";
    public static final String TASK2 = "Task2: ";
    public static final String TASK3 = "Task3: ";
    public static final String TASK4 = "Task4: ";
    public static final String TASK5 = "Task5: ";
    public static final String TASK6 = "Task6: ";
    public static final String TASK7 = "Task7: ";
    public static final String TASK8 = "Task8: ";
    public static final String TASK9 = "Task9: ";
    public static final String TASK10 = "Task10: ";
    public static final String TASK11 = "Task11: ";
    public static final String TASK12 = "Task12: ";
    public static final String TASK13 = "Task13: ";
    public static final String TASK14 = "Task14: ";
    public static final String TASK15 = "Task15: ";
    public static final String TASK16 = "Task16: ";
    public static final String TASK17 = "Task17: ";
    public static final String TASK18 = "Task18: ";

    // Methods for printing the output data
    public void printMessage(Object message){
        System.out.println(message);
    }

    public void printMessage(String message, int array[]){
        System.out.println(message);
        System.out.println(Arrays.toString(array));
    }
}
