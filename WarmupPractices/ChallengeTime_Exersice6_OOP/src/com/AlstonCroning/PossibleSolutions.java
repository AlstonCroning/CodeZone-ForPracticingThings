package com.AlstonCroning;

class PossibleSolutions {
    private int groupSize;
    private int[] array;

    PossibleSolutions(int[] array, int groupSize) {
        this.groupSize = groupSize;
        this.array = array;
    }

    int[] possibleSolutions() {
        int extractedTempData;
        int addedTempData = 0;
        int arrayLength = array.length;
        int[] extractedDataSum = new int[arrayLength * 2];
        int tempI = groupSize - 1;

        for (int i = 0; i < arrayLength; i++) {
            //extract the data temporarily
            extractedTempData = array[i];

            for (int k = (i + 1); k < arrayLength; k++) {
                //add data until the end of each group
                addedTempData += array[k];

                //condition true if the end of each group has reached
                if (k == tempI) {
                    addedTempData += extractedTempData;//add the total summed data of each group
                    extractedDataSum[i] = addedTempData;//save the each possibleSolution in the new array
                    addedTempData = 0;
                    //end of next group's iterator should be 1 greater than the previous
                    tempI++;
                    break;
                }
            }
        }
        return extractedDataSum;
    }
}
