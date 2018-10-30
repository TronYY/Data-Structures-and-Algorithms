public class ExtendeBinarySearch {
    //基本的二分法
    public int search(int[] arr,int key) {
        int left = 0, right = arr.length-1;
        int mid;
        while (left <= right) {

            mid = left + ((right - left) >> 1);//>> 优先级比+低
            if (arr[mid] == key) return mid;
            else if (arr[mid] > key) right = mid - 1;
            else left = mid + 1;
        }
        // 查到的话要么l与r在mid等距的两边 要么left=mid，r=l或r=left+1；
        // 查不到的话right<left,刚好夹在key两侧
        return -1;
    }

    //1. 找出第一个与key相等的元素
    // 1 2R 3L 3 4 返回L
    public int searchFirstEqual(int[] arr,int key) {

        int left = 0, right = arr.length-1;
        int n=arr.length-1;
        int mid;
        while (left <= right) {

            mid = left + ((right - left)>>1);
            //if (arr[mid] == key) return mid;
            if (arr[mid] >= key) right = mid - 1;//结合 图例，等于key之后，R还需要移动
            else left = mid + 1;
        }
        if (left < n && arr[left] == key) return left;//>= 比 && 高
        return -1;
    }

    // 2. 找出最后一个与key相等的元素
    // 1 2 3 3R 4L 返回R
    public int searchLastEqual(int[] arr,int key) {
        int left = 0, right = arr.length-1;
        int n=arr.length-1;
        int mid;
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            //if (arr[mid] == key) return mid;
            if (arr[mid] > key) right = mid - 1;//结合 图例，等于key之后，R还需要移动（即本轮循环不移动R，但是要移动L，下一轮mid重新计算后，R仍然有可能移动
            else left = mid + 1;
        }
        if (right > 0 && arr[right] == key) return right;
        return -1;
    }

    // 3. 查找第一个等于或者大于Key的元素
    // 1 2R 3L 3 4 返回L
    public int searchFirstEqualorLarger(int[] arr,int key) {
        int left = 0, right = arr.length-1;
        int n=arr.length-1;
        int mid;
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            //if (arr[mid] == key) return mid;
            if (arr[mid] >= key) right = mid - 1;//结合 图例，等于key之后，R还需要移动
            else left = mid + 1;
        }
        if (left < n && arr[left] >= key) return left;
        return -1;
    }

    // 4. 查找第一个大于key的元素
    // 1 2 3 3R 4L 返回L
    public int searchFirstLarger(int[] arr,int key) {
        int left = 0, right = arr.length-1;
        int n=arr.length-1;
        int mid;
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            //if (arr[mid] == key) return mid;
            if (arr[mid] > key) right = mid - 1;//结合 图例，等于key之后，R不需要移动
            else left = mid + 1;
        }
        if (left < n && arr[left] > key) return left;
        return -1;
    }

    // 5. 查找最后一个等于或者小于key的元素
    // 1 2 3 3R 4L 返回R
    public int searchLastEqualorSmaller(int[] arr,int key) {
        int left = 0, right = arr.length-1;
        int mid;
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            //if (arr[mid] == key) return mid;
            if (arr[mid] > key) right = mid - 1;//结合 图例，等于key之后，R不需要移动
            else left = mid + 1;
        }
        if (right > 0 && arr[right] <= key) return right;
        return -1;
    }

    // 6. 查找最后一个小于key的元素
    // 1 2R 3L 3 4 返回R
    public int searchLastSmaller(int[] arr,int key) {
        int left = 0, right = arr.length-1;
        int mid;
        while (left <= right) {
            mid = left + ((right - left) >> 1);
            //if (arr[mid] == key) return mid;
            if (arr[mid] >= key) right = mid - 1;//结合 图例，等于key之后，R还需要移动
            else left = mid + 1;
        }
        if (right > 0 && arr[right] < key) return right;
        return -1;
    }

}


