package jzoffer;

public class Solution {
    public int Sum_Solution(int n) {
        int ans=n;
        boolean t=(n>0) && ((ans+=Sum_Solution(n-1))>0);//��·�룬ֻ�е�n=0ʱ����������ұߣ�
        return ans;
        
    }
}
