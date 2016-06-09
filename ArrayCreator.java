package Array_engine;

import java.util.Scanner;

public class ArrayCreator {
    public int[] arrayInit(){
        Scanner input = new Scanner(System.in);
        int[] myArray = new int[5];

        for (int i =0; i < myArray.length; i++){
            System.out.println("Please enter number " + (i+1) + " : ");
            myArray[i] = input.nextInt();
        }

        System.out.println("You entered the following data: ");

        for (int i = 0; i < myArray.length; i++){
            System.out.print(myArray[i] + " | ");
        }
        return myArray;
    }

}
