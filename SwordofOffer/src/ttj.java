public class Solution {
    public int JumpFloor(int target) {
        int fibone=1,fibtwo=2,ans=0;
        if (target==0) return 0;
        if (target==1) return fibone;
        if (target==2) return fibtwo;
        for (int i=3;i<=target;i++) {
            ans=fibone+fibtwo;
            fibone=fibtwo;
            fibtwo=ans;
        }
        return ans;

    }
}