package Arrays.Easy;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] a = new int[m];
        for(int i=0; i<m; i++){
            a[i] = nums1[i];
        }
        
        int i=0; int j=0; int k=0;
        
        while(i<m && j<n){
            if(a[i]<=nums2[j]){
                nums1[k++]=a[i++];
            }else{
                nums1[k++] = nums2[j++];
            }
        }
        
        while(i<m){
            nums1[k++]=a[i++];
        }
        
        while(j<n){
            nums1[k++] = nums2[j++];
        }
    }
}