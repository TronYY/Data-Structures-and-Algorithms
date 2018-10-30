
import java.rmi.ServerError;

public class HwTest {
    public static int search(int[] arr,int key) {
        int left = 0, right = arr.length-1;
        int mid=0;
        int flag = 0;
        while (left <= right) {
            mid = left + ((right - left) >> 1);//>> ????+?
            if (arr[mid] == key) {
                flag=1;
                break;
            }
            else if (arr[mid] > key) right = mid - 1;
            else left = mid + 1;
        }
        System.out.println("left="+left+" right="+right);
        if (flag==1) return mid;
        else return -1;
    }


    public static void main(String[] args) {
        System.out.println("Hw");
        int[] a=new int[]{0, 1, 2, 3, 4};
        //System.out.println(search(a,1));
        ExtendeBinarySearch


    }


}
