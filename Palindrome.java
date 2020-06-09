//package IBMBootcamp.2;
// Given a string, find the longest substring which is palindrome. 
// For example, if the given string is "ababad", the output should be "ababa".

// How To find a palindrome
public class Palindrome {
    /*public static boolean isPalindrome(String s) {
        for (int i = 0; i < s.length() - 1; i++){
            for (int l = s.length() - 1; l < 0; l--) {
                if (s.charAt(i) != s.charAt(l)) {
                    return false;
                }
            }
        }
        System.out.println(s);
        return true;
    }*/
    public static void printSub(String s, int lowest, int highest) { 
        System.out.println(s.substring(lowest, highest + 1)); 
    } 
  
    
    public static int longSubstring(String s) { 
        int max = 0;  
        int start = 0; 
        int length = s.length(); 
        // lengths
        for (int i = 1; i < length; i++)  {
            int lowest = i - 1; 
            int highest = i; 
            while (s.charAt(lowest) == s.charAt(highest) && lowest >= 0 && highest < length) { 
                if (highest - lowest + 1 > max) { 
                    start = lowest; 
                    max = highest - lowest + 1; 
                } 
                highest++; 
                lowest--; 
            } 
            lowest = i - 1; 
            highest = i + 1; 
            while (lowest >= 0 && highest < length && s.charAt(lowest) == s.charAt(highest)) { 
                if (highest - lowest + 1 > max) { 
                    start = lowest; 
                    max = highest - lowest + 1; 
                } 
                highest++; 
                lowest--; 
            } 
        } 
        System.out.println("Word: " + s);
        System.out.print("Substring: "); 
        printSub(s, start, start + max - 1); 
        
        System.out.print("Length: ");
        return max; 
    } 
  
    
    public static void main(String[] args) {
        //System.out.println(isPalindrome("racecar"));
        String s = ("ababad");
        System.out.println(longSubstring(s));

    }
}
    
