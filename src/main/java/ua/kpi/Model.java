package ua.kpi;

/**
 * Created by Evgeniy on 11/2/2016.
 */
public class Model {

    public static final int MIN = -100;
    public static final int MAX = 100;

    public int findSum(int array[]){
        int sum = 0;
        for (int element : array){
            sum += element;
        }
        return sum;
    }
}
