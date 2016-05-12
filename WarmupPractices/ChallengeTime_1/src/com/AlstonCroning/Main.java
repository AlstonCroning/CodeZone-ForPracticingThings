package com.AlstonCroning;

public class Main {

    public static void main(String[] args) {
        //exercise 1
        //printNumbersOrFooBar();

        //exercise 2
        //System.out.println(countEvenNumbers(15));

        //exercise 3
        //a = 1 + 1 + 1 = 3  (min)
        //a = 6 + 6 + 6 = 18  (max)

        //exercise 4
        //removeDuplicatesFromArrays();

        //exercise 5
        //printLikeNumbersForGivenLength(5);

        //exercise 6
//        int groupSize = 3;
//        int[] myArray = {1, 1, 1, 2, 2, 3, 4, 5, 6, 7, 7,8}; //11 entries (group size = 2)
//        int[] myArray = {1,7,8,9,10,6,2,3,4,5,99};


        //define variables and initialize

        //exercise 6
        int groupSize = 11;
        int[] myArray = {1, 1, 1, 2, 2, 3, 4, 5, 6, 7, 7};
        int [] theLargestSumOfConsecutiveEntries = findTheLargestSumOfConsecutiveEntries(myArray,groupSize);
        int largestSumAndPosition;

        for(int i=0; i < 2; i++) {
            largestSumAndPosition = theLargestSumOfConsecutiveEntries[i];
            if(i == 0) {
                System.out.println("Largest Sum: " +largestSumAndPosition);
            } else if (i == 1){
                System.out.println("Position: " + largestSumAndPosition);
            }
        }
    }

    //exercise 6
    private static int[] possibleSolutions(int [] array, int groupSize) {
        int extractedTempData; //current data of each index of the array
        int addedTempData = 0;//to be used for added data of each itteration (current + old data)
        int arrayLength = array.length; //length of array
        int [] ExtractedDataSum = new int[arrayLength*2]; //summed up data to be saved in this array
        int temp_i = groupSize - 1;//useful for comparing current itteration and grouping each groups

        //loop from (0 - length of the array)
        for(int i = 0; i < arrayLength; i++) {
            extractedTempData = array[i];//extract the data temporrilly

            //loop from ( (i+1) to (length of array) )
            for(int k = (i+1); k < arrayLength; k++) {
                addedTempData += array[k];//add data until the end of each group

                //condition true if the end of each group has reached
                if(k == temp_i){
                    addedTempData += extractedTempData;//add the total summed each group
                    ExtractedDataSum[i] = addedTempData;//save the each possibleSolution in the new array
                    addedTempData = 0;//reset addedTempData variable
                    temp_i++;//end of next group's itterator should be 1 greater than the previous
                    break;//we're done collecting possible solution for each group so 'break'
                }
            }
        }
        return ExtractedDataSum;//return the possibleSolutions
    }
    private static int bestSolution(int [] possibleSolutionsArray) {
        //defining variables and/or initialize
        int currentData;//used to save currentData
        int previousData = 0;//used to store previousData
        int savedData = 0;//used to storeData until the bestSolution is found

        //loop from ( 0 - length of possibleSolutionsArray)
        for(int i=0; i < possibleSolutionsArray.length; i++) {
            currentData = possibleSolutionsArray[i]; //current data of each index of the array

            //Save the bestSolution if the groupSize is equal to the length of the original array
            if((possibleSolutionsArray[i] != 0) && (i == 0)) {
                savedData = currentData;//save the bestSolution
            }
            //Save the bestSolution if the group size is less than the length of the actual array
            else if(i != 0) {
                //if the currentData is greater than or equal to previous data
                if(currentData >= previousData) {
                    //if the savedData is less than the currentData
                    if(savedData < currentData) {
                        savedData = currentData;//save the currentData
                    }
                    //if the savedData is equals to currentData
                    else if(savedData == currentData) {
                        savedData = currentData;//saved the currentData
                    }
                }
            }
            //replace the previousData with currentData
            previousData = currentData;//because currentData becomes previous data in the next itteration
        }
        return savedData;//return the bestSolution
    }
    private static int findStartingIndexOfBestSolution(int [] array, int [] possibleSolutions, int bestSolution) {
        //define variables and/ initialize
        int arrayLength = array.length;//length of the original array
        int savedIndex = 0;//used to store the position/index of the largest Sum

        //loop from ( 0 - length of the original array)
        for(int i = 0; i < arrayLength; i++) {
            //compare each data of possibleSolutions array with the bestSolution
            if(possibleSolutions[i] == bestSolution) {
                //if both bestSolution matched with possibleSolution's data then save the current index
                savedIndex = i;
            }
        }
        return savedIndex;//return the starting index of best solution
    }
    private static int [] findTheLargestSumOfConsecutiveEntries(int[] array, int groupSize) {
        //define variables and/or initialize and method calls
        int [] largestSumAndIndex = new int[2];//used to store largestSum and starting index
        int [] possibleSolutions = possibleSolutions(array,groupSize);//obtain the possibleSolutions
        int largestSum = bestSolution(possibleSolutions);//obtain the bestSolution
        int startingIndex = findStartingIndexOfBestSolution(array,possibleSolutions,largestSum);//obtain the starting index

        //store largesSum and Starting index in the new Array
        largestSumAndIndex[0] = largestSum;
        largestSumAndIndex[1] = startingIndex;

        return largestSumAndIndex;//return largestSum and starting Index
    }












    //exercise 1
    public static void printNumbersOrFooBar () {

        //defining variables
        int number1 = 3;
        int number2 = 5;
        int Remainder_num1;
        int Remainder_num2;

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
    public static int countEvenNumbers(int number) {

        //defining variables
        int remainder;
        int count = 0;

        //itterate untill the number that was given
        for(int i = 0; i <= number; i++) {
            remainder = i%2;//save remainder of each itteration divided by 2

            //if the remainder is 0 then the number is a even number
            if(remainder == 0) {
                count++;//represents the number of even numbers
            }
        }
        return count;//return the count
    }

    //exercise 4
    public static void removeDuplicatesFromArrays() {

        //defining variables
        String[] myarray = {"one","one","two","three","three","two"};
        String tempWord;

        //loop untill the length of array
        for(int i = 0; i < myarray.length; i++) {
            tempWord = myarray[i];//save each word

            //loop untill length of array and compare each word and remove duplicates
            for(int k = (i+1); k < myarray.length; k++) {

                //if the current word is equals with next word replace with empty string
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

    //exercise 5 (additional features)
    public static void printLikeNumbersForGivenLength(int length) {

        //loop from 1 to length given
        for(int i = 1; i <= length; i++) {
            //loop from 1 to length given
            for(int k = 1; k <= length; k++) {

                System.out.print(i);//print outer loop itteration value

                //line break
                if(k == length) {
                    System.out.println();
                }
                //add space for numbers larger than or equal to 10
                else if(length >= 10 && i >= 10) {
                    System.out.print("   ");
                }
                //add space for numbers less than 10
                else {
                    System.out.print("    ");
                }
            }
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


//exercise 5 (previously)
//    public static void printLikeNumbers() {
//        for(int i = 1; i <= 5; i++) {
//            System.out.println(i + " " + i + " " + i + " " + i + " " + i);
//        }
//    }


/*
//exercise 6 (incomplete Solution)
if(remainder == 0) {
    for(int i=0; i < arrayLength; i++) {
        addedTempData += array[i]; //added data (current + old data)
        if (i == temp_i) {
            ExtractedDataSum[i] = addedTempData;//addedTempData to be inserted into a new array
            addedTempData = 0;//replace addedTempData with 0
        } else {
            if(i == (temp_i + groupSize)) {
                ExtractedDataSum[i] = addedTempData;//addedTempData to be inserted into a new array
                addedTempData = 0;//replace addedTempData with 0
                temp_i = temp_i + groupSize;
            }
        }
    }
    return ExtractedDataSum;
}

else {
    for(int i=0; i < arrayLength; i++) {
        extractedTempData = array[i];//current data
        addedTempData += array[i];//added data (current + old data)
        if(i == temp_i) {
            ExtractedDataSum[i] = addedTempData;//addedTempData to be inserted into a new array
            addedTempData = extractedTempData;//replace addedTempData with the current data so that it can be added with the new data
        } else {

        }
    }
    return ExtractedDataSum;
}
*/


