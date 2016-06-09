package Array_engine;

public class BubbleSortable {
    public int[] bubbleInt(int[] array) {

        int[] myArray = array;

        boolean swapOccured = true;
        {
            while (swapOccured) {
                swapOccured = false;
                for (int i = 0; i < myArray.length - 1; i++) {
                    if (myArray[i] > myArray[i + 1]) {
                        int tempVariable = myArray[i];

                        myArray[i] = myArray[i + 1];
                        myArray[i + 1] = tempVariable;

                        swapOccured = true;
                    }
                }
            }
            return myArray;
        }
    }
}

