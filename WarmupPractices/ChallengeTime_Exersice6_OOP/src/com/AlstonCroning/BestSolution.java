package com.AlstonCroning;

public class BestSolution {
    private int currentData;//used to save currentData
    private int previousData;//used to store previousData
    private int savedData;//used to storeData until the bestSolution is found

    public BestSolution() {
        this.currentData = 0;
        this.previousData = 0;
        this.savedData = 0;
    }

    public int bestSolution(int[] possibleSolutionsArray) {
        for (int i = 0; i < possibleSolutionsArray.length; i++) {
            currentData = possibleSolutionsArray[i]; //current data of each index of the array

            //Save the bestSolution if the groupSize is equal to the length of the original array
            if ((possibleSolutionsArray[i] != 0) && (i == 0)) {
                savedData = currentData;
            }
            //Save the bestSolution if the group size is less than the length of the actual array
            else if (i != 0) {
                if (currentData >= previousData) {
                    if (savedData < currentData) {
                        savedData = currentData;
                    } else if (savedData == currentData) {
                        savedData = currentData;
                    }
                }
            }
            previousData = currentData;//currentData becomes previous data in the next iteration
        }
        return savedData;
    }
}