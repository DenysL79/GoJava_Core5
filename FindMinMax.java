package Array_engine;

public class FindMinMax {
    public int getMax(int[] array) {

        int[] myArray = array;
        int maxValue = myArray[0];
        for (int i =1; i < myArray.length; i++) {
            if (myArray[i] > maxValue) {
               maxValue = myArray[i];
            }
        }
    return maxValue;
    }

    public int getMin(int[] array) {

        int[] myArray = array;
        int minValue = myArray[0];
        for (int i =1; i < myArray.length; i++) {
            if (myArray[i] > minValue) {
                minValue = myArray[i];
            }
        }
        return minValue;
    }
}
