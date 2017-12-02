public class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split(" +");
        Collections.reverse(Arrays.asList(words));
        
        return String.join(" ", words);
        
        
        /*
        *** First attempt: without builtin functions ***
        
        if (s.length() == 1 || s.length() == 0){
            return s;
        }
        
        //create ret string
        //from the end of the array, get substring(first space, n);
        //add substring into ret string
        //continue and until next space
        
        //do until i == 0
        int spaceIndex = s.length() - 1;
        int lastIndex = s.length() - 1;
        String reversed = " ";
        
        
        for (int i = s.length() - 1; i > 0; i++){
            
        System.out.println("got hya");
            if (s.charAt(i) == ' '){
                spaceIndex = i;
                reversed += s.substring(spaceIndex, lastIndex);
                System.out.println(reversed);
                lastIndex = i;
            } 
            
        }
        return reversed;
        */
        
        
    }
}