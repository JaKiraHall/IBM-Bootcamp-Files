//package IBMBootcamp.1;

import java.util.Arrays;

/*Given an array of bad numbers and a range of integers, determine the longest 
 segment of integers within the range that does NOT include any bad numbers
​
 Example: 
 badNumbers[37,7,22,15,49,60]
 lowerBound = 3
 upperBound = 48
 */

 //psuedo code
 // Sort badNumbers
 // badNumbers = {1, 5, 18, 9, 6, 27, 39, 4, 2, 0};
 // loop starting at lower bound 
 // break at upper bound 
 // initialize max;
 // running count
 // condition that updates max length
 // return max length
public class ArrayPractice{
    public static void main(String args[]){
        int [] arr = {1, 5, 18, 9, 6, 27, 39, 4, 2, 0};
        int lower = 5;
        int upper = 32;
        longestSequence(arr, lower, upper);
    }

    public static int longestSequence(int [] arr, int lowerBound, int upperBound) {
        //Would generally use a modified quick sort for performance break 
        int max = 0;
        int diff;
        Arrays.sort(arr); 
        // badNumbers = {1, 5, 18, 9, 6, 27, 39, 4, 2, 0};
        System.out.println(Arrays.toString(arr)); 
        // max = element[0] - lowerBound

        for (int i = 0; i < arr.length - 1; i++){
             if (arr[i] < 5 || arr[i + 1] > 32){
                continue;

             } else {
                diff = arr[i + 1] - 1 - arr[1];
             }
             if (diff > max) {
                 max = diff;
             }

        }
        System.out.println(max);
        return max;
    }
}

// Segment class stategy (More Space)
// Create a segment class
// every interval create a segment
// for every segment add to array List
// Sort List 
// subtract as long as second value < upper bound
// subtract

// 1 Loop Strategy
// Sort Array
// Pointer element and next
// iterate through elements
// as long as p.next !> upperBound
// do math
//same in reverse for lower all in the same loop
//return maxValue;