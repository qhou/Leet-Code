/*
*** Answer incorrect; revisit ***

Given two words (beginWord and endWord), and a dictionary's word list, find the length of shortest transformation sequence from beginWord to endWord, such that:

Only one letter can be changed at a time.
Each transformed word must exist in the word list. Note that beginWord is not a transformed word.
For example,

Given:
beginWord = "hit"
endWord = "cog"
wordList = ["hot","dot","dog","lot","log","cog"]
As one shortest transformation is "hit" -> "hot" -> "dot" -> "dog" -> "cog",
return its length 5.

Note:
Return 0 if there is no such transformation sequence.
All words have the same length.
All words contain only lowercase alphabetic characters.
You may assume no duplicates in the word list.
You may assume beginWord and endWord are non-empty and are not the same.
*/
class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        //use BFS to keep track
        Queue<String> toVisit = new LinkedList<String>();
        Set Visited = new HashSet<String>(); //if String has been visited
        int level = 0; //count to keep track

        toVisit.add(beginWord);

        String currString = "";

        if (!wordList.contains(endWord))
            return 0;

        while (!toVisit.isEmpty()) {
            currString = toVisit.poll();
            System.out.println("Just polled: " + currString);
            if (currString != null) {
                //System.out.println("current word: " + currString);
                //for each char in currString, swap in characters from 'a' to 'z'
                for (int i = 0; i < currString.length(); i++) {
                    //change string to char array 
                    char[] currCharArray = currString.toCharArray();

                    for (char c = 'a'; c < 'z'; c++) {
                        currCharArray[i] = c;
                        String newString = new String(currCharArray);

                        //if char-swapped String is endWord, return current count
                        if (newString.equals(endWord)) {
                            return level;
                            //else if swappe
                        } else if (wordList.contains(newString) && !Visited.contains(newString)) {
                            toVisit.add(newString);
                            Visited.add(newString);
                            level++;
                            System.out.println("current string: " + currString + "  level: " + level);
                            /*
                            for (Object v: Visited){
                                System.out.println(v);
                            }
                            */
                        }
                    }
                }
            } else {
                return level;
            }

            if (toVisit.isEmpty()) {
                toVisit.add(null);
            }

        }

        return 0;
    }
}