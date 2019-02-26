import java.util.ArrayList;
public class $08_MinNumberInRotateArray {
    public int minNumberInRotateArray(int [] array) {
        if (array.length == 0) return 0;
        int left = 0, right = array.length - 1;
        int mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (array[left] < array[right]) return array[left];
            //分== > < 三种情况
            if (array[mid] == array[right] ) right--;//无法判断 只能顺序
            else if (array[mid] < array[right]) right = mid;//防止两个元素时出现问题，因为mid总是指向下标小的元素
            else left = mid + 1;
        }
        return array[left];

    }
}