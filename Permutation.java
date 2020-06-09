/*Given a string str, the task is to print all the permutations of str. 
A permutation is an arrangement of all or part of a set of objects, with regard to the order of the arrangement. 
For example, if given "abb", the output should be "abb abb bab bba bab bba"*/

public class Permutation { 
    static void printPermutation(String s, String answer) 
    {  
        if (s.length() == 0) { 
            System.out.print(answer + " "); 
            return; 
        } 
        for (int i = 0; i < s.length(); i++) {  
            char c = s.charAt(i); 
            String sub = s.substring(0, i) +  s.substring(i + 1); 
            printPermutation(sub, answer + c); 
        } 
    } 
   
    public static void main(String[] args) 
    { 
        String e = "abb"; // e for example
        printPermutation(e, ""); 
    } 
} 
