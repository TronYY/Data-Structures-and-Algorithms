package $153_FindMinimuminRotatedSortedArray_BS_M;

class Solution {
    public int findMin(int[] nums) {
    	int l=0,r=nums.length-1;
    	//����ֻ��һԪ�أ�����ǵ��ھͻ�һֱѭ��
        while (l<r) {
        	
        	if (nums[l]<nums[r]) return nums[l];
        	int mid=(l+r)/2;
        	if (nums[l]<=nums[mid]) l=mid+1;//������Ԫ��1 0
        	else r=mid;
        		
        }
        return nums[l];
    }
}