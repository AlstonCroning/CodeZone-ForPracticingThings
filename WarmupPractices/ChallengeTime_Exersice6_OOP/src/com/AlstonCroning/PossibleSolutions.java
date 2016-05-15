package com.AlstonCroning;

public class PossibleSolutions {
    private int extractedTempData; //current data of each index of the array
    private int addedTempData;//to be used for added data of each iteration (current + old data)
    private int arrayLength; //length of array
    private int [] extractedDataSum; //summed up data to be saved in this array
    private int temp_i;//useful for comparing current iteration and grouping each groups
    private int groupSize;
    private int [] array;


    public PossibleSolutions(int [] array, int groupSize) {
        this.extractedTempData = 0;
        this.addedTempData = 0;
        this.arrayLength = array.length;
        this.extractedDataSum = new int[arrayLength*2];
        this.temp_i = groupSize - 1;
        this.groupSize = groupSize;
        this.array = array;
    }

    public int[] possibleSolutions() {
        for(int i = 0; i < arrayLength; i++) {
            extractedTempData = array[i];//extract the data temporily

            for(int k = (i+1); k < arrayLength; k++) {
                addedTempData += array[k];//add data until the end of each group

                //condition true if the end of each group has reached
                if(k == temp_i){
                    addedTempData += extractedTempData;//add the total summed data of each group
                    extractedDataSum[i] = addedTempData;//save the each possibleSolution in the new array
                    addedTempData = 0;
                    temp_i++;//end of next group's iterator should be 1 greater than the previous
                    break;
                }
            }
        }
        return extractedDataSum;
    }
}
