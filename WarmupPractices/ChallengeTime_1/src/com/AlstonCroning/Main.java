package com.AlstonCroning;

public class Main {

    public static void main(String[] args) {
        //exercise 1
        //printNumbersOrFooBar();

        //exercise 2
        //countEvenNumbers(15);

        //exercise 4
        //removeDuplicatesFromArrays();

        //exercise 5
        //printLikeNumbers();


        //use the (group size of 2)
        int groupSize = 2;
//        int[] myArray = {1, 1, 1, 2, 2, 3, 4, 5, 6, 7, 7}; //11 entries (group size = 2)
        int[] myArray = {1, 1, 2, 4, 6, 5,1,2,5,4,1}; //test array
        int [] possibleSolitions = possibleSolutions(myArray,groupSize);

        for(int i=0; i< myArray.length;i++) {
            System.out.println(possibleSolitions[i]);
        }
    }


    public static int[] possibleSolutions(int [] array, int groupSize) {

        int arrayLength = array.length; //length of array
        int remainder = arrayLength % groupSize; //remainder for making sure if the array is dividable by the group size
        int [] ExtractedDataSum = new int[arrayLength*2]; //summed up data to be saved in this array
        int extractedTempData = 0; //current data of each index of the array
        int addedTempData = 0;//to be used for added data of each itteration (current + old data)
        int remainderOfItteration;//remainderOfItteration used to make sure if the itterator is dividable by the group size for Extracting data into an array

        if(remainder == 0) {

            for(int i=0; i < arrayLength; i++) {
                addedTempData += array[i]; //added data (current + old data)
                remainderOfItteration = (i % groupSize);

                if( remainderOfItteration != 0) {
                    ExtractedDataSum[i] = addedTempData;//addedTempData to be inserted into a new array
                    addedTempData = 0;//replace addedTempData with 0
                }
            }
            return ExtractedDataSum;
        } else {
            for(int i=0; i < arrayLength; i++) {
                extractedTempData = array[i];//current data
                addedTempData += array[i];//added data (current + old data)
                if(i != 0) {
                    ExtractedDataSum[i] = addedTempData;//addedTempData to be inserted into a new array
                }
                //replace addedTempData with the current data so that it can be added with the new data
                addedTempData = extractedTempData;
            }
            return ExtractedDataSum;
        }
    }

    public static int bestSolution(int [] possibleSolutions) {

        return 0;
    }

    public static int findStartingIndexOfBestSolution() {

        return 0;
    }

    public static int findLargestSum(int[] array, int groupSize) {

        return 0;
    }












    //exercise 1
    public static void printNumbersOrFooBar () {

        //variables
        int number1 = 3;
        int number2 = 5;
        int Remainder_num1 = 0;
        int Remainder_num2 = 0;

        //Loop from( 1 to 100)
        for (int i = 1; i <= 100; i++) {

            //save the remainder of each number
            Remainder_num1 = i%number1;
            Remainder_num2 = i%number2;

            //if either one of the remainders are '0' this condition is true
            if(Remainder_num1 == 0 || Remainder_num2 == 0) {

                //print 'FooBar' if both remainders are the '0'
                if(Remainder_num1 == 0 && Remainder_num2 == 0) {
                    System.out.print("FooBar ");
                }
                //print 'Foo' or 'Bar'
                else {
                    if (Remainder_num1 == 0) {
                        System.out.print("Foo ");
                    }
                    if (Remainder_num2 == 0) {
                        System.out.print("Bar ");
                    }
                }
            }
            //print numbers that aren't multiplication of '3' or '5'
            else {
                System.out.print(i + " ");
            }
        }
    }

    //exercise 2
    public static void countEvenNumbers(int number) {

        int remainder = 0;
        int count = 0;

        for(int i = 0; i <= number; i++) {
            remainder = i%2;
            if(remainder == 0) {
                count++;
            }
        }
        System.out.println(count);
    }

    //exercise 4
    public static void removeDuplicatesFromArrays() {
        String[] myarray = new String[6];
        myarray[0] = "one";
        myarray[1] = "one";
        myarray[2] = "two";
        myarray[3] = "three";
        myarray[4] = "three";
        myarray[5] = "two";
        String tempWord = "";

        //loop throughly and compare each word and remove duplicates
        for(int i = 0; i < 6; i++) {
            tempWord = myarray[i];//save each word

            for(int k = (i+1); k < 6; k++) {
               if( tempWord.equals(myarray[k])) {
                   myarray[k] = "";
               }
            }
        }

        //print the remaining values of array to the output
        int count = 0;
        while (count < 6) {
            System.out.print(myarray[count] + " ");
            count++;
        }

    }

    //exercise 5
    public static void printLikeNumbers() {
        for(int i = 1; i <= 5; i++) {
            System.out.println(i + " " + i + " " + i + " " + i + " " + i);
        }
    }

}


/*
    def largestSumOfConsecutiveEntries(inputList: List[Int], groupingSize: Int): Option[Solution] = {

        val potentialSolutions = permute(inputList, groupingSize)
        val bestSolution = findSolutionWithHighestSum(potentialSolutions)

        if (bestSolution.isEmpty) {
            None
        } else {
            val startingIndex = findStartingIndexOfBestSolution(inputList, bestSolution)
            Some(Solution(startingIndex, bestSolution, bestSolution.sum))
        }
    }



        def potentialSolution(inputList: List[Int], groupingSize: Int): List[Int] =
      if (inputList.size < groupingSize) List.empty
      else inputList.take(groupingSize)

    def permute(inputList: List[Int], groupingSize: Int): Set[List[Int]] =
      inputList.indices.foldLeft(Set.empty[List[Int]]) {
        (acc: Set[List[Int]], elem: Int) => acc + potentialSolution(inputList.drop(elem), groupingSize)
      } filter(_.nonEmpty)


    def findSolutionWithHighestSum(xs: Set[List[Int]]): List[Int] =
      xs.reduce((nextSet, maxSet) => if (nextSet.sum > maxSet.sum) nextSet else maxSet)

    def findStartingIndexOfBestSolution(originalList: List[Int], bestSolution: List[Int]): Int =
      originalList.indexOfSlice(bestSolution)
*/



        /*
        //old solution : not valid
        int count = 0;
        int arrayData;
        int arrayData2;

        while(count < myArray.length) {
            arrayData = myArray[count];

            if(arrayData == (arrayData2 = myArray[++count])) {
                System.out.println("found a match");
            }
            count++;
        }

        //old solution 2 (not valid)
        int count = 0;
        int arrayData = 0;

        for (int i = 0; i < array.length; ) {
            arrayData = array[i];

            if(arrayData == array[i+1]) {
                count++;
            }
            i++;
        }
        System.out.println(count);
        */