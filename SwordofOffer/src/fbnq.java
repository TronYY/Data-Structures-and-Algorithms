public class fbnq {
    public int Fibonacci(int n) {
        int n1=1,n2=1,ans=1;
        if (n==0) return 0;//����
        for (int i=3;i<=n;i++) {
            ans=n1+n2;
            n1=n2;
            n2=ans;
        }
        return ans;

    }
}

/**
[fn fn-1
fn-1 fn-2]=[1 1
            1 0]^(n-1)  ���ɷ�֤��
 
 ת��Ϊ��˷�����һ�����ÿ�����

*/