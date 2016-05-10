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


        int groupSize = 2;
        int[] myArray = {1,2,3,5,90,50,10,5,10,10,10,1}; //11 entries (group size = 2)
        int [] possibleSolitions = possibleSolutions(myArray,groupSize);

        int bestSolution = bestSolution(possibleSolitions);
        System.out.println(bestSolution);

//        //test loop
//        System.out.println("Possible Solutions: ");
//        for(int i = 0; i< myArray.length;i++) {
//            System.out.println(possibleSolitions[i]);
//        }

    }

    public static int[] possibleSolutions(int [] array, int groupSize) {
        int arrayLength = array.length; //length of array
        int remainder = arrayLength % groupSize; //remainder for making sure if the array is dividable by the group size
        int [] ExtractedDataSum = new int[arrayLength*2]; //summed up data to be saved in this array
        int extractedTempData = 0; //current data of each index of the array
        int addedTempData = 0;//to be used for added data of each itteration (current + old data)
        int remainderOfItteration;//remainderOfItteration used to make sure if the itterator is dividable by the group size for Extracting data into an array

        int temp_i = groupSize - 1;

        if(remainder == 0) {

            for(int i=0; i < arrayLength; i++) {
                addedTempData += array[i]; //added data (current + old data)
//                remainderOfItteration = (i % groupSize);
//                if( remainderOfItteration != 0) {
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

    public static int bestSolution(int [] possibleSolutionsArray) {

        int [] bestSolutionArray = new int[possibleSolutionsArray.length];
        int currentData = 0;
        int previousData = 0;
        int bestRessult = 0;
        int saveData = 0;

        for(int i=0; i < possibleSolutionsArray.length; i++) {
            currentData = possibleSolutionsArray[i];

            if(i != 0) {
                if(currentData >= previousData) {

                    if(saveData < currentData) {
                        saveData = currentData;
                    }
                    else if(saveData == currentData) {
                        saveData = currentData;
                    }
                }
//                else if(currentData < previousData) {
//                    saveData = previousData;
//                }

/*                if(currentData != previousData) {
                    if (currentData > previousData) {
                        saveData = currentData;
                    } else if (currentData < previousData) {
                        saveData = previousData;
                    }
                } else {
                    saveData = currentData;
                }*/
            }
            previousData = currentData;
        }
//        System.out.println(saveData);
        return saveData;
    }

    public static int findStartingIndexOfBestSolution() {

        return 0;
    }

    public static int findLargestSum(int[] array, int groupSize) {
        return 0;
    }












    //exercise 1
    public static void printNumbersOrFooBar () {

        //defining variables
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