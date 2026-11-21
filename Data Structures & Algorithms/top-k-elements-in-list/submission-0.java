class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freq = new HashMap<>();
        int temp;
        for(int i=0;i<nums.length;i++)
        {
            if(freq.get(nums[i])!=null)
            {
                temp = freq.get(nums[i]);
                freq.put(nums[i],temp+1);
            }
            else
            {
                freq.put(nums[i],1);
            }
        }
        // bucket[i] contains numbers that occur i times
        List<Integer>[] bucket = new List[nums.length + 1];

        for (int num : freq.keySet()) {
            int count = freq.get(num);

            if (bucket[count] == null) {
                bucket[count] = new ArrayList<>();
            }

            bucket[count].add(num);
        }

        // Collect the most frequent elements
        int[] result = new int[k];
        int index = 0;

        for (int count = bucket.length - 1; count >= 0 && index < k; count--) {
            if (bucket[count] != null) {
                for (int num : bucket[count]) {
                    result[index] = num;
                    index++;

                    if (index == k) {
                        break;
                    }
                }
            }
        }

        return result;
    }
}