class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list1 = Arrays.stream(nums1)
                              .boxed() 
                              .collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(nums2)
                              .boxed() 
                              .collect(Collectors.toList());

        list1.addAll(list2);

        Collections.sort(list1);
        int left = 0 , right = list1.size()-1;
        int mid = (left+right)/2;
        // for(Integer num: list1){
        //     System.out.print(num + " ");
        // }
        if(list1.size()%2==0){
            return ((double)list1.get(mid)+(double)list1.get(mid+1))/2;
        }
        return ((double)list1.get(mid));
    }
}
