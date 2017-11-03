/*
Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

For example,
"A man, a plan, a canal: Panama" is a palindrome.
"race a car" is not a palindrome.

Note:
Have you consider that the string might be empty? This is a good question to ask during an interview.

For the purpose of this problem, we define empty string as valid palindrome.
*/

class Solution {
    public boolean isPalindrome(String s) {
       
        if (s == ""){
            return true;
        }
        //convert to lower case
        //only alphanuermic characters remaining
        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        
        int b = 0;
        int e = s.length() -1;
        
        while (b <= e){
            if (s.charAt(b) != s.charAt(e)){
                return false;
            }else 
                b++;
                e--;
        } 
        
        if (b == e){
            return true;
        }
        
        
        return true;
    }
}