public class Solution {
    public int Add(int num1,int num2) {
        int tempsum=0,carry=0;
        while (num2!=0){
            tempsum=num1^num2; //������λ
            carry=(num1&num2)<<1;
            num1=tempsum;
            num2=carry;
        }
        return num1;
    }
}
/*
����������൱��ÿһλ��ӣ��������ǽ�λ��
���������룬������һλ���൱����ý�λ��
�����������Ľ�����*/