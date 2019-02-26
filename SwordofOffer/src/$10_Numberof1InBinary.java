public class $10_Numberof1InBinary {
    public int NumberOf1(int n) {
        //把一个整数减1，再和原整数& 能把整数最右边的1变成0
        int ans = 0;
        while (n != 0) {
            n = n & (n-1);
            ans++;
        }
        return ans;

    }
}