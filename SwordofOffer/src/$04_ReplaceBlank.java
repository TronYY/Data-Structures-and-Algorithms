public class $04_ReplaceBlank {
    public String replaceSpace(StringBuffer str) {
        int originalLength = str.length();
        int newLength = originalLength;
        for (int i = 0;i < originalLength; i++)
            if (str.charAt(i) == ' ') newLength += 2;
        str.setLength(newLength);//不包含\0
        int p1 = newLength - 1;
        int p0 = originalLength - 1;
        while (p0 >= 0) {
            if (str.charAt(p0) == ' ') {
                str.setCharAt(p1--,'0');
                str.setCharAt(p1--,'2');
                str.setCharAt(p1--,'%');
                p0--;
            }
            else str.setCharAt(p1--,str.charAt(p0--));
        }
        return str.toString();

    }
}

/**

public class Solution {
    public String replaceSpace(StringBuffer str) {
        int len=str.length(),i=0;
        while (i<len) {
            if (str.charAt(i)!=' ') i++;
            else {
                str.replace(i,i+1,"%20");//方法取代了字符在这个StringBuffer的一个子字符串在指定字符串中的字符。
                len=len-1+3;
                i=i+3;
            }
        }
        return str.toString();
    }
}
*/
/**
当对字符串进行修改的时候，需要使用 StringBuffer 和 StringBuilder 类。

和 String 类不同的是，StringBuffer 和 StringBuilder 类的对象能够被多次的修改，并且不产生新的未使用对象。

StringBuilder 类在 Java 5 中被提出，它和 StringBuffer 之间的最大不同在于 StringBuilder 的方法不是线程安全的（不能同步访问）。

由于 StringBuilder 相较于 StringBuffer 有速度优势，所以多数情况下建议使用 StringBuilder 类。然而在应用程序要求线程安全的情况下，则必须使用 StringBuffer 类。
*/