public class Solution {
    public int minNumberInRotateArray(int [] array) {
		if (array.length==0) return 0;
        int l=0,r=array.length-1,mid=0;
		while (l<=r) {
			//while (l<r && array[l]==array[r])l++;
			if (array[l]<array[r]) return array[l];
			mid=l+(r-l)/2;
			if (array[mid]<array[r]) r=mid;
            else if (array[mid]==array[r]) r=r-1;//不好判断只能一个个试
			else l=mid+1;
		}
        return array[mid];
    
    }
}