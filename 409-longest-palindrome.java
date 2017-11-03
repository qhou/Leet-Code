/*
Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.
This is case sensitive, for example "Aa" is not considered a palindrome here.
Note:
Assume the length of given string will not exceed 1,010.

Example:
Input:
"abccccdd"
Output:
7

Explanation:
One longest palindrome that can be built is "dccaccd", whose length is 7.
*/


import java.util.Hashtable; 
import java.util.Collection; 
class Solution {
    public int longestPalindrome(String s) {
        if (s==null){
            return 0;
        }
        //Hashtable<char, Integer>, value is the frequency
        //get key where value % 2 == 0
        //sum and return 
        int ret = 0;
        Hashtable<Character, Integer> hash = new Hashtable<Character, Integer>();
        int n = s.length();
      
        for (int i = 0; i < n; i++){
            char curr = s.charAt(i);
            if (hash.containsKey(curr)){
                hash.remove(curr);
                ret++;
                
            } else
                hash.put(curr, 1);
        }
        return ret*2+1;
    }
}
          