class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> ret = new ArrayList<Integer>();
        HashMap<Integer, Integer> hash = new HashMap<>();
        int k = 0; 
        while (k < nums1.length){
            if (hash.get(nums1[k]) == null){
                hash.put(nums1[k], 1);
            }else {
                hash.put(nums1[k], hash.get(nums1[k])+1);
            } 
                k++;
                
            }
        int i = 0;
        while (i < nums2.length ){
            if (hash.get(nums2[i]) == null || hash.get(nums2[i]) == 0){
            } else {
                ret.add(nums2[i]);
                hash.put( nums2[i], hash.get(nums2[i]) -1);
            }
            i++;
        }
        
        int[] result = new int[ret.size()];
        for (int m = 0 ; m < ret.size(); m++){
            result[m] = ret.get(m);
        }
        
        return result;
    }
}
        