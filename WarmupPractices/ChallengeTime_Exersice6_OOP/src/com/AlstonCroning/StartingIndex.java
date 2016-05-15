package com.AlstonCroning;

public class StartingIndex {
    private int arrayLength;//length of the original array
    private int savedIndex;//used to store the position/index of the largest Sum
    private int groupSize;

    public StartingIndex(int [] array, int groupSize) {
        this.arrayLength = array.length;
        this.savedIndex = 0;
        this.groupSize = groupSize;
    }

    public int findStartingIndexOfBestSolution(int [] possibleSolutions, int bestSolution) {

        for(int i = 0; i < arrayLength; i++) {
            //compare each data of possibleSolutions array with the bestSolution
            if(possibleSolutions[i] == bestSolution) {
                //if both bestSolution matched with possibleSolution's data then save the current index
                savedIndex = i;
            }
        }
        return savedIndex;//return the starting index of best solution
    }
}
