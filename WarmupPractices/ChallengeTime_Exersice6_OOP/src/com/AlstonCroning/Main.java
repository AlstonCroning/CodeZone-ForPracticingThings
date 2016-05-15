package com.AlstonCroning;

public class Main {

    public static void main(String[] args) {

        //define and initialize variables and/or classes
        int groupSize = 4;
        int[] myArray = {1, 1, 1, 2, 2, 3, 4, 5, 6, 7, 7};
        PossibleSolutions possibleSolutions = new PossibleSolutions(myArray,groupSize);
        BestSolution bestSolution = new BestSolution();
        StartingIndex startingIndex = new StartingIndex(myArray, groupSize);
        BaseClass baseClass = new BaseClass(myArray,possibleSolutions,bestSolution,startingIndex);

        //test code
        baseClass.findTheLargestSumOfConsecutiveEntries();
        System.out.println("Best Solution: " + baseClass.findTheLargestSumOfConsecutiveEntries().getLargestsum());
        System.out.println("Starting Index: " + baseClass.findTheLargestSumOfConsecutiveEntries().getStartingIndex());

    }
}
