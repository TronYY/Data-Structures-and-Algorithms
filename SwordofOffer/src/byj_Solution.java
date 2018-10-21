public class Solution {
    public int Add(int num1,int num2) {
        int tempsum=0,carry=0;
        while (num2!=0){
            tempsum=num1^num2; //不含进位
            carry=(num1&num2)<<1;
            num1=tempsum;
            num2=carry;
        }
        return num1;
    }
}
/*
两个数异或：相当于每一位相加，而不考虑进位；
两个数相与，并左移一位：相当于求得进位；
将上述两步的结果相加*/