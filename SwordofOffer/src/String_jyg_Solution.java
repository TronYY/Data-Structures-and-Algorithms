package jzoffer;
import java.lang.String;

public class String_jyg_Solution {
    public static int StrToInt(String str) {
    	if (str == null || str.length()== 0) return 0;//java string�ж�Ϊ�յķ���
        int ans=0;
        for (int i=0;i<str.length();i++) {//java��û�н�������һ�������str.length()����ʵ�ʳ���
        	if (i==0 && (str.charAt(i)=='+' || str.charAt(i)=='-')) continue;
            int t=str.charAt(i)-'0';//java��֧����������� String����ĳ���ַ� ������str[i] 
            if (t>9 || t<0) return 0;
            ans=ans*10+t;
             
        }
        if (str.charAt(0)=='-') return -ans;
        else return ans;
         
    }
    
    public static void main(String args[]) {
    	String str="";
    	System.out.println();
    	System.out.println(StrToInt(str));
    }
     
     
}