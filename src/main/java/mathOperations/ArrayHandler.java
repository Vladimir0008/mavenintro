package mathOperations;

import java.util.Arrays;

public class ArrayHandler {

    public static int[] getArrayAfterLastFour(int[] inputArray) {
        int newArrayCapacity = findCountElementsAfterLastFour(inputArray);
        return Arrays.copyOfRange(inputArray, inputArray.length - newArrayCapacity, inputArray.length);

    }

    public static int findCountElementsAfterLastFour(int[] inputArray) {
        int newArrayCapacity = 0;
        for (int i = inputArray.length - 1; i >= 0; i--) {
            if (inputArray[i] == 4) {
                break;
            } else {
                newArrayCapacity++;
            }
        }
        if (newArrayCapacity == inputArray.length) {
            throw new RuntimeException("No 4 in array");
        } else {
            return newArrayCapacity;
        }
    }

    public static boolean oneFourArrayChecker(int[] inputArray) {
        boolean isOne = false;
        boolean isFour = false;
        boolean isOtherNumber = false;
        for (int i : inputArray) {
            if (i == 1) {
                isOne = true;
            } else if (i == 4) {
                isFour = true;
            } else if (i != 4 && i != 1) {
                isOtherNumber = true;
                break;
            }
        }
        return (isOne && isFour && !isOtherNumber);
    }
}