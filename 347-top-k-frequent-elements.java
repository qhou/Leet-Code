/*
Given a non-empty array of integers, return the k most frequent elements.

For example,
Given [1,1,1,2,2,3] and k = 2, return [1,2].

Note: 
You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
*/


class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        //hashmap(nums, frequency)
        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i ++){
            numsMap.put(nums[i], numsMap.getOrDefault(nums[i], 0) + 1);
            /*
            System.out.println("iteration: " + i);
            System.out.println(numsMap);
            */
        }
        
        //use priority queue for to store top frequency 
        PriorityQueue<Map.Entry<Integer, Integer>> freqPriorityQueue = 
                                    new PriorityQueue<>((a,b)->(a.getValue()-b.getValue()));
        //for each element in hashmap add to priority queue
        int c = 0;
        for (Map.Entry<Integer, Integer> e: numsMap.entrySet()){
            freqPriorityQueue.offer(e);
            //keep polling (minimum) from priority queue until pqueue size = k
            if (freqPriorityQueue.size() > k)
                freqPriorityQueue.poll();
            /*
            System.out.println("count: " + c);
            System.out.println(freqPriorityQueue);
            c++;
            */
        }
        
        //poll from pqueue into list
        List kMostFrequent = new ArrayList<>();
        while (kMostFrequent.size() != k){
            kMostFrequent.add(freqPriorityQueue.poll().getKey());
        }
        
        //return list
        return kMostFrequent;
        
        
        
        /*
        // create a min heap
        PriorityQueue<Pair> queue = new PriorityQueue<Pair>(new Comparator<Pair>(){
            public int compare(Pair a, Pair b){
                return a.count-b.count;
            }
        });
        https://www.programcreek.com/2014/05/leetcode-top-k-frequent-elements-java/
        */        
    }
}