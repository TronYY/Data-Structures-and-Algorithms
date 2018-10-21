package jzoffer;

public class Solution {
    public int Sum_Solution(int n) {
        int ans=n;
        boolean t=(n>0) && ((ans+=Sum_Solution(n-1))>0);//短路与，只有当n=0时，不会计算右边；
        return ans;
        
    }
}
