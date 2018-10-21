import java.util.ArrayList;
public class Solution {
    ArrayList<Integer> arrayList=new ArrayList<Integer>();//ArrayList≥ı ºªØ
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if (listNode!=null) {
            printListFromTailToHead(listNode.next);
            arrayList.add(listNode.val);//ArrayListÃÌº”
        }
        return arrayList;
            
        
        
    }
}