package com.AlstonCroning;

public class BaseClass {
    private int [] largestSumAndIndex;//used to store largestSum and starting index
    private int [] pSolutionsData;
    private int bSolutionData;
    private int sIndexData;
    private PossibleSolutions possibleSolutions;
    private BestSolution bestSolution;
    private StartingIndex startingIndex;
    private int groupsize;

    public BaseClass(int [] array,
                     PossibleSolutions possibleSolutions, BestSolution bestSolution, StartingIndex startingIndex) {
        this.largestSumAndIndex = new int[2];
        this.pSolutionsData = new int[array.length];
        this.bSolutionData = 0;
        this.sIndexData = 0;
        this.possibleSolutions = possibleSolutions;
        this.bestSolution = bestSolution;
        this.startingIndex = startingIndex;
    }

    public LargestSumAndIndex findTheLargestSumOfConsecutiveEntries() {
        pSolutionsData = possibleSolutions.possibleSolutions();
        bSolutionData = bestSolution.bestSolution(pSolutionsData);
        sIndexData = startingIndex.findStartingIndexOfBestSolution(pSolutionsData,bSolutionData);
        return new LargestSumAndIndex(bSolutionData,sIndexData);
    }

}
