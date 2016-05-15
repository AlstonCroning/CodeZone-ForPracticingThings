package com.AlstonCroning;

public class LargestSumAndIndex {
    private int sum;
    private int index;
    private PossibleSolutions possibleSolutions;
    private BestSolution bestSolution;
    private StartingIndex startingIndex;
    private int [] array;
    private int groupSize;
//    int [] largestSumAndIndex = new int[2];//used to store largestSum and starting index
    private int [] pSolutions;
    private int bSolution;
    private int sIndex;

    public LargestSumAndIndex(int sum, int index) {
        this.sum = sum;
        this.index = index;
    }

    public LargestSumAndIndex findTheLargestSumOfConsecutiveEntries(int[] array, int groupSize) {
        this.array = array;
        this.groupSize = groupSize;

        pSolutions = getPossibleSolutions().possibleSolutions();
        bSolution = getBestSolution().bestSolution(pSolutions);
        sIndex = getStartingIndex().findStartingIndexOfBestSolution(pSolutions,bSolution);

        return new LargestSumAndIndex(bSolution,sIndex);
    }


    //getters
    public PossibleSolutions getPossibleSolutions() {
        return possibleSolutions;
    }

    public BestSolution getBestSolution() {
        return bestSolution;
    }

    public StartingIndex getStartingIndex() {
        return startingIndex;
    }

    public int getSum() {
        return sum;
    }

    public int getIndex() {
        return index;
    }
}
