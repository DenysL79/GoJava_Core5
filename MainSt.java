import Array_engine.ArrayCreator;
import Array_engine.BubbleSortable;
import Array_engine.FindMinMax;

import java.util.Arrays;
import java.util.Scanner;

public class MainSt {
    public static void main(String[] args) {
        try {
            init();
        } catch (IllegalArgumentException e) {
            System.err.println(e);
            init();
        }
    }


    private static void init() {
        int[] myArray;
        ArrayCreator initArray = new ArrayCreator();
        myArray = initArray.arrayInit();

        BubbleSortable bubbleSortable = new BubbleSortable();
        FindMinMax findMinMax = new FindMinMax();

        Scanner input = new Scanner(System.in);

        System.out.println("Please make a choice: ");
        System.out.println("\n 1 - for Sort Array with built-in Array.sort() function" +
                "\n 2 - for Sort Array without built-in functions" +
                "\n 3 - for Calculate and print Min and Max array value" +
                "\n -------------------------------------" +
                "\n Please make a selection: ");
        int userSelect = input.nextInt();


        switch (userSelect) {
            case 1:
                System.out.println("\n\nSorting Array data with built-in Array.sort.....");
                Arrays.sort(myArray);
                for (int i = 0; i < myArray.length; i++) {
                    System.out.print(myArray[i] + " | ");
                }
                break;
            case 2:
                System.out.println("\n\nSorting Array data via bubble method.....");
                myArray = bubbleSortable.bubbleInt(myArray);
                for (int i = 0; i < myArray.length; i++) {
                    System.out.print(myArray[i] + " | ");
                }
                break;
            case 3:
                System.out.println("\n\nFinding the Min and Max value in the Array.....");
                int max = findMinMax.getMax(myArray);
                int min = findMinMax.getMin(myArray);
                System.out.println("Maximum Value is: " + max);
                System.out.println("Minimum Value is: " + min);
                break;
            default:
                System.out.println("Incorrect selection. Please try again");
                break;
        }
    }
}

