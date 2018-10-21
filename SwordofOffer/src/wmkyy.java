public class Solution {
    public int RectCover(int target) {
        if (target==0) return 0;
        if (target==1) return 1;
        if (target==2) return 2;
        return RectCover(target-1)+RectCover(target-2);//原先写成了RectCover(target-1)+2*RectCover(target-2);因为以为后一种有两种放法，但是其中一种放法其实已经包含在target-1这里了

    }
}