public class Solution {
    public int RectCover(int target) {
        if (target==0) return 0;
        if (target==1) return 1;
        if (target==2) return 2;
        return RectCover(target-1)+RectCover(target-2);//ԭ��д����RectCover(target-1)+2*RectCover(target-2);��Ϊ��Ϊ��һ�������ַŷ�����������һ�ַŷ���ʵ�Ѿ�������target-1������

    }
}